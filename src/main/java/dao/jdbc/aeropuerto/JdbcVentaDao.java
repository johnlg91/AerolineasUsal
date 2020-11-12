package dao.jdbc.aeropuerto;

import dao.interfaces.aeropuerto.VueloDAO;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import model.aeropuerto.Venta;
import model.aeropuerto.Vuelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcVentaDao extends AbstractJdbcDao<Venta>  implements VueloDAO {
    protected JdbcVentaDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(Vuelo element) {
        return false;
    }

    @Override
    public boolean update(int id, Vuelo element) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Vuelo get(int id) {
        return null;
    }

    @Override
    public List<Vuelo> getAll() {
        return null;
    }

    @Override
    protected void setFields(PreparedStatement statement, Venta entity) throws SQLException {

    }

    @Override
    protected Venta create(ResultSet rs) throws SQLException {
        return null;
    }
}
