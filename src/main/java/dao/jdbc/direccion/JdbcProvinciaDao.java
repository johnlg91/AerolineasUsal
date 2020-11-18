package dao.jdbc.direccion;

import dao.interfaces.direccion.ProvinciaDao;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import model.direccion.Provincia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcProvinciaDao extends AbstractJdbcDao<Provincia> implements ProvinciaDao {

    public JdbcProvinciaDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(Provincia provincia) {
        int id = insert("INSERT INTO provincias(nombre_provincia) VALUES (?)", provincia);
        provincia.setIdProvincia(id);
        return id > 0;
    }

    @Override
    public boolean update(int id, Provincia element) {
        return update("UPDATE provincias" +
                " SET nombre_provincia = ?" +
                " WHERE id_provincia = ?", element, id) > 0;
    }

    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM provincias WHERE id_provincia = ?", id);
    }

    @Override
    public Provincia get(int id) {
        return getOne("SELECT * FROM provincias WHERE id_provincia = " + id);
    }

    @Override
    public List<Provincia> getAll() {
        return list("SELECT * FROM provincias");
    }

    @Override
    protected Provincia create(ResultSet rs) throws SQLException {
        final Provincia provincia = new Provincia(rs.getString("nombre_provincia"));
        provincia.setIdProvincia(rs.getInt("id_provincia"));
        return provincia;
    }


    @Override
    protected void setFields(PreparedStatement statement, Provincia provincia) throws SQLException {
        statement.setString(1, provincia.getNombreProvincia());
    }


}
