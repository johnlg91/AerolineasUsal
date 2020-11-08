package dao.jdbc.direccion;

import dao.interfaces.direccion.DireccionDAO;
import dao.jdbc.JdbcDao;
import model.direccion.Direccion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcDireccionDao extends JdbcDao<Direccion> implements DireccionDAO {
    public JdbcDireccionDao(Connection connection) {
        super(connection);
    }

    @Override
    public boolean insert(Direccion element) {
        return false;
    }

    @Override
    public boolean modify(int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Direccion get(int id) {
        return null;
    }

    @Override
    public List<Direccion> getAll() {
        return null;
    }

    @Override
    protected Direccion create(ResultSet rs) throws SQLException {
        return null;
    }
}
