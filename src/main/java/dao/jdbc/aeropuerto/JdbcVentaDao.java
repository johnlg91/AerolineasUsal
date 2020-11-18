package dao.jdbc.aeropuerto;

import dao.interfaces.aeropuerto.VentaDAO;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.cliente.JdbcClienteDao;
import model.aeropuerto.Venta;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcVentaDao extends AbstractJdbcDao<Venta> implements VentaDAO {
    public JdbcVentaDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(Venta element) {
        int id = insert("INSERT INTO ventas(fec_hs_venta, forma_pago, id_cliente, id_vuelo, id_aerolinea) " +
                "VALUES(?,?,?,?,?) ", element);
        element.setIdVenta(id);
        return false;
    }

    @Override
    public boolean update(int id, Venta element) {
        return update("UPDATE ventas  " +
                "SET fec_hs_venta = ?," +
                "forma_pago = ?," +
                "id_cliente = ?," +
                "id_vuelo = ?," +
                "id_aerolinea = ?" +
                "WHERE id_venta = ?", element, id) > 0;
    }

    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM ventas WHERE id_venta = ?", id);
    }

    @Override
    public Venta get(int id) {
        return getOne("SELECT * FROM ventas WHERE id_venta = " + id);
    }

    @Override
    public List<Venta> getAll() {
        return list("SELECT * FROM ventas");
    }

    @Override
    protected void setFields(PreparedStatement statement, Venta entity) throws SQLException {
        statement.setTimestamp(1, entity.getFecHsVenta());
        statement.setString(2, entity.getFormaPago());
        statement.setInt(3, entity.getCliente().getIdCliente());
        statement.setInt(3, entity.getVuelo().getIdVuelo());
        statement.setInt(3, entity.getAerolinea().getIdAerolinea());
    }

    @Override
    protected Venta create(ResultSet rs) throws SQLException {
        JdbcClienteDao clienteDao = factory.getDao(JdbcClienteDao.class);
        JdbcVueloDao vueloDao = factory.getDao(JdbcVueloDao.class);
        JdbcAerolineaDao aerolineaDao = factory.getDao(JdbcAerolineaDao.class);
        return new Venta(
                rs.getInt("id_venta"),
                rs.getTimestamp("fec_hs_venta"),
                rs.getString("forma_pago"),
                clienteDao.get(rs.getInt("id_cliente")),
                vueloDao.get(rs.getInt("id_vuelo")),
                aerolineaDao.get(rs.getInt("id_aerolinea"))
        );
    }
}
