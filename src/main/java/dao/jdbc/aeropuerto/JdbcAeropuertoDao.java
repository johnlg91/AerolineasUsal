package dao.jdbc.aeropuerto;

import dao.interfaces.aeropuerto.AeropuertoDAO;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import model.aeropuerto.Aeropuerto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcAeropuertoDao extends AbstractJdbcDao<Aeropuerto> implements AeropuertoDAO {
    protected JdbcAeropuertoDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(Aeropuerto element) {
        return false;
    }

    @Override
    public boolean update(int id, Aeropuerto element) {
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
    protected void setFields(PreparedStatement statement, Aeropuerto entity) throws SQLException {

    }

    @Override
    protected Aeropuerto create(ResultSet rs) throws SQLException {
        return null;
    }
}
