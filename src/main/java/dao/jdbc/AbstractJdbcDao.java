package dao.jdbc;



import org.intellij.lang.annotations.Language;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public abstract class AbstractJdbcDao<T> {
    protected final JdbcDaoFactory factory;

    public AbstractJdbcDao(JdbcDaoFactory factory) {
        this.factory = factory;
    }

    /**
     * Un insert un poco mas generico, directamente le pide los parametros a las clases jdbc
     *
     * @param sql,    el tipo comando sql q se requiere para insertar el objeto, cada jdbc clase guarda el suyo
     * @param entity, un generic, el objeto a insertar
     * @return devuelve el id generado por sql
     */

    protected int insert(/*@Language(value = "SQL")*/ String sql, T entity) {
        try (PreparedStatement statement = getConnection().prepareStatement(sql, RETURN_GENERATED_KEYS)) {
            setFields(statement, entity);
            statement.executeUpdate();
            try (ResultSet rs = statement.getGeneratedKeys()) {
                if (rs != null && rs.next())
                    return rs.getInt(1);
                throw new RuntimeException("Cannot get generated Key");
            }
        } catch (SQLException e) {
            throw handleException(e);
        }
    }

    protected int update(/*@Language(value = "SQL")*/ String sql, T entity, int id) {
        try (PreparedStatement statement = getConnection().prepareStatement(sql)) {
            setFields(statement, entity);
            int idPosition = statement.getParameterMetaData().getParameterCount();
            statement.setInt(idPosition, id);
            return statement.executeUpdate();
        } catch (SQLException e) {
            throw handleException(e);
        }
    }

    protected boolean delete(/*@Language(value = "SQL")*/String sql, int id) {
        try (PreparedStatement statement = getConnection().prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw handleException(e);
        }
    }




    protected T getOne(/*@Language(value = "SQL")*/String query) {
        try (
                Statement statement = getConnection().createStatement();
                ResultSet rs = statement.executeQuery(query)
        ) {
            if (rs.next()) return create(rs);
            return null;
        } catch (SQLException e) {
            throw handleException(e);
        }
    }



    protected List<T> list(/*@Language(value = "SQL")*/String query) {
        try (
                Statement statement = getConnection().createStatement();
                ResultSet rs = statement.executeQuery(query)
        ) {
            List<T> resultList = new ArrayList<>();
            while (rs.next()) resultList.add(create(rs));
            return resultList;
        } catch (SQLException e) {
            throw handleException(e);
        }
    }

    private RuntimeException handleException(SQLException e) {
        e.printStackTrace();
        return new RuntimeException(e);
    }

    protected abstract void setFields(PreparedStatement statement, T entity) throws SQLException;

    protected abstract T create(ResultSet rs) throws SQLException;

    private Connection getConnection() {
        return factory.getConnection();
    }
}
