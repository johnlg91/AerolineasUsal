package dao.jdbc.cliente;

import dao.interfaces.cliente.ClienteDAO;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import model.cliente.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcClienteDao extends AbstractJdbcDao<Cliente> implements ClienteDAO {
    protected JdbcClienteDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(ClienteDAO element) {
        return false;
    }

    @Override
    public boolean update(int id, ClienteDAO element) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public ClienteDAO get(int id) {
        return null;
    }

    @Override
    public List<ClienteDAO> getAll() {
        return null;
    }

    @Override
    protected void setFields(PreparedStatement statement, Cliente entity) throws SQLException {

    }

    @Override
    protected Cliente create(ResultSet rs) throws SQLException {
        return null;
    }
}
