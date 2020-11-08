package dao.jdbc;

import dao.interfaces.Dao;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.Nullable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcDao<T> implements Dao<T> {
    protected Connection connection;

    protected JdbcDao(Connection connection) {
        this.connection = connection;
    }

    @Nullable
    protected T getOne(@Language(value = "SQL") String query) {
        try (
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query)
        ) {
            if (rs.next()) return create(rs);
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    protected List<T> list(@Language(value = "SQL") String query) {
        try (
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query)
        ) {
            List<T> resultList = new ArrayList<>();
            while (rs.next()) resultList.add(create(rs));
            return resultList;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    protected abstract T create(ResultSet rs) throws SQLException;
}
