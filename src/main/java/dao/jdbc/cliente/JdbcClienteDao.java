package dao.jdbc.cliente;

import dao.interfaces.cliente.ClienteDAO;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.direccion.JdbcDireccionDao;
import model.cliente.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcClienteDao extends AbstractJdbcDao<Cliente> implements ClienteDAO {
    public JdbcClienteDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(Cliente element) {
        int id = insert("INSERT INTO clientes(nombre, apellido, dni, cuit_cuil, fecha_nacimiento, email, id_direccion, id_telefono, id_pasaporte, id_pasajero_frecuente) " +
                " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", element);
        element.setIdCliente(id);
        return true;
    }

    @Override
    public boolean update(int id, Cliente element) {
        return update("UPDATE clientes " +
                "SET nombre = ?," +
                "apellido = ?," +
                "dni = ?," +
                "cuit_cuil = ?," +
                "fecha_nacimiento = ?," +
                "email = ?," +
                "id_direccion = ?," +
                "id_telefono = ?," +
                "id_pasaporte = ?," +
                "id_pasajero_frecuente = ?" +
                "WHERE id_cliente = ?", element, id) > 0;
    }

    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM clientes WHERE id_cliente = ?", id);
    }

    @Override
    public Cliente get(int id) {
        return getOne("SELECT * FROM clientes WHERE id_cliente = " + id);
    }

    public Cliente getByName(String name) {
        return getOne("SELECT * FROM clientes WHERE nombre = " + name);
    }
    public Cliente getByDni(int dni) {
        return getOne("SELECT * FROM clientes WHERE dni = " + dni);
    }

    @Override
    public List<Cliente> getAll() {
        return list("SELECT * FROM clientes");
    }

    @Override
    protected void setFields(PreparedStatement statement, Cliente entity) throws SQLException {
        statement.setString(1, entity.getNombre());
        statement.setString(2, entity.getApellido());
        statement.setInt(3, entity.getDni());
        statement.setInt(4, entity.getCuitCuil());
        statement.setDate(5, entity.getFechaNacimiento());
        statement.setString(6, entity.getEmail());
        statement.setInt(7, entity.getDireccion().getIdDireccion());
        statement.setInt(8, entity.getTelefono().getIdTelefonos());
        statement.setInt(9, entity.getPasaporte().getIdPasaporte());
        statement.setInt(10, entity.getPasajeroFrecuente().getIdPasajeroFrecuente());
    }

    @Override
    protected Cliente create(ResultSet rs) throws SQLException {
        JdbcDireccionDao direccionDao = factory.getDao(JdbcDireccionDao.class);
        JdbcTelefonoDao telefonoDao = factory.getDao(JdbcTelefonoDao.class);
        JdbcPasaporteDao pasaporteDao = factory.getDao(JdbcPasaporteDao.class);
        JdbcPasajeroFrecuenteDao pasajeroFrecuenteDao = factory.getDao(JdbcPasajeroFrecuenteDao.class);
        int idDireccion = rs.getInt("id_direccion");
        int idTelefono = rs.getInt("id_telefono");
        int idPasaporte = rs.getInt("id_pasaporte");
        int idPasajeroFrecuente = rs.getInt("id_pasajero_frecuente");
        return new Cliente(rs.getInt("id_cliente"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getInt("dni"),
                rs.getInt("cuit_cuil"),
                rs.getDate("fecha_nacimiento"),
                rs.getString("email"),
                direccionDao.get(idDireccion),
                telefonoDao.get(idTelefono),
                pasaporteDao.get(idPasaporte),
                pasajeroFrecuenteDao.get(idPasajeroFrecuente));
    }
}
