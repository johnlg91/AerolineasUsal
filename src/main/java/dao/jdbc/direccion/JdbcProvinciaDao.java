package dao.jdbc.direccion;

import dao.interfaces.direccion.ProvinciaDAO;
import dao.jdbc.JdbcDao;
import model.direccion.Provincia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcProvinciaDao extends JdbcDao<Provincia> implements ProvinciaDAO {
    public JdbcProvinciaDao(Connection connection) {
        super(connection);
    }

    @Override
    public boolean insert(Provincia element) {
        return false;
    }

    @Override
    public boolean modify(int id) {
        return false;
    }

    @Override
    public boolean delete(int  id) {
        return false;
    }

    @Override
    public Provincia get(int  id) {
        return getOne("select * from provincias where id_provincia = " + id);
    }

    @Override
    public List<Provincia> getAll() {
        return list("select * from provincias");
    }

    @Override
    protected Provincia create(ResultSet rs) throws SQLException {
        return new Provincia(
                rs.getInt("id_provincia"),
                rs.getString("nombre_provincia"));
    }
}
