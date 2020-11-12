package dao.jdbc.aeropuerto;

import dao.interfaces.aeropuerto.UsuarioDAO;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import model.aeropuerto.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcUsuarioDao extends AbstractJdbcDao<Usuario> implements UsuarioDAO {
    protected JdbcUsuarioDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(Usuario element) {
        return false;
    }

    @Override
    public boolean update(int id, Usuario element) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Usuario get(int id) {
        return null;
    }

    @Override
    public List<Usuario> getAll() {
        return null;
    }

    @Override
    protected void setFields(PreparedStatement statement, Usuario entity) throws SQLException {

    }

    @Override
    protected Usuario create(ResultSet rs) throws SQLException {
        return null;
    }
}
