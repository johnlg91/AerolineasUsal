package dao.jdbc.cliente;

import dao.interfaces.cliente.PasajeroFrecuenteDAO;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import model.cliente.PasajeroFrecuente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcPasajeroFrecuenteDao extends AbstractJdbcDao<PasajeroFrecuente> implements PasajeroFrecuenteDAO {
    protected JdbcPasajeroFrecuenteDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(PasajeroFrecuente element) {
        return false;
    }

    @Override
    public boolean update(int id, PasajeroFrecuente element) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public PasajeroFrecuente get(int id) {
        return null;
    }

    @Override
    public List<PasajeroFrecuente> getAll() {
        return null;
    }

    @Override
    protected void setFields(PreparedStatement statement, PasajeroFrecuente entity) throws SQLException {

    }

    @Override
    protected PasajeroFrecuente create(ResultSet rs) throws SQLException {
        return null;
    }
}
