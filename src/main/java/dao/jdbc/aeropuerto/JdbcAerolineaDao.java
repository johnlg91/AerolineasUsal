package dao.jdbc.aeropuerto;

import dao.interfaces.aeropuerto.AerolineaDao;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import model.aeropuerto.Aerolinea;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcAerolineaDao extends AbstractJdbcDao<Aerolinea> implements AerolineaDao {

    public JdbcAerolineaDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    protected void setFields(PreparedStatement statement, Aerolinea entity) throws SQLException {

    }

    @Override
    protected Aerolinea create(ResultSet rs) throws SQLException {
        return null;
    }


    @Override
    public boolean insert(Aerolinea element) {
        return false;
    }

    @Override
    public boolean update(int id, Aerolinea aerolinea) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Aerolinea get(int id) {
        return null;
    }

    @Override
    public List<Aerolinea> getAll() {
        return null;
    }
}
