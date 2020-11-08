package dao.jdbc.aeropuerto;

import dao.interfaces.aeropuerto.AeropuertoDAO;
import dao.jdbc.JdbcDao;
import model.aeropuerto.Aeropuerto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcAerolineaDao extends JdbcDao<Aeropuerto> implements AeropuertoDAO {
    public JdbcAerolineaDao(Connection connection) {
        super(connection);
    }

    @Override
    public boolean insert(Aeropuerto element) {
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
    public Aeropuerto get(int id) {
        return null;
    }

    @Override
    public List<Aeropuerto> getAll() {
        return null;
    }

    @Override
    protected Aeropuerto create(ResultSet rs) throws SQLException {
        return null;
    }
}
