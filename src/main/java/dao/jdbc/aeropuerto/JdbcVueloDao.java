package dao.jdbc.aeropuerto;

import dao.interfaces.aeropuerto.VueloDAO;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.DaoManager;
import dao.jdbc.JdbcDaoFactory;
import model.aeropuerto.Vuelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcVueloDao extends AbstractJdbcDao<Vuelo> implements VueloDAO {


    public JdbcVueloDao(DaoManager manager) {
        super(manager);
    }

    @Override
    public boolean insert(Vuelo element) {
        int id = insert("INSERT INTO vuelos (nro_vuelo, cant_asientos, fec_hs_salida, fec_hs_llegada, tiempo_vuelo, id_aerolinea, id_aeropuerto_salida, id_aeropuerto_llegada) " +
                "VALUES (?,?,?,?,?,?,?,?)", element);
        element.setIdVuelo(id);
        return id >= 0;
    }

    @Override
    public boolean update(int id, Vuelo element) {
        return update("UPDATE vuelos " +
                "SET nro_vuelo = ?," +
                "cant_asientos = ?," +
                "fec_hs_salida = ?," +
                "fec_hs_llegada = ?," +
                "tiempo_vuelo = ?," +
                "id_aerolinea = ?," +
                "id_aeropuerto_salida = ?," +
                "id_aeropuerto_llegada = ? " +
                "WHERE id_vuelo = ?", element, id) > 0;
    }

    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM vuelos WHERE id_vuelo = ?", id);
    }

    @Override
    public Vuelo get(int id) {
        return getOne("SELECT * FROM vuelos WHERE id_vuelo = " + id);
    }

    @Override
    public List<Vuelo> getAll() {
        return list("SELECT * FROM vuelos");
    }

    @Override
    protected void setFields(PreparedStatement statement, Vuelo entity) throws SQLException {
        statement.setString(1, entity.getNroVuelo());
        statement.setInt(2, entity.getCantAsientos());
        statement.setTimestamp(3, entity.getFecHsSalida());
        statement.setTimestamp(4, entity.getFecHsLlegada());
        statement.setInt(5, entity.getTiempoVuelo());
        statement.setInt(6, entity.getAerolinea().getIdAerolinea());
        statement.setInt(7, entity.getAeropuertoSalida().getIdAeropuerto());
        statement.setInt(8, entity.getAeropuertoLlegada().getIdAeropuerto());
    }

    @Override
    protected Vuelo create(ResultSet rs) throws SQLException {
        return new Vuelo(
                rs.getInt("id_vuelo"),
                rs.getString("nro_vuelo"),
                rs.getInt("cant_asientos"),
                rs.getTimestamp("fec_hs_salida"),
                rs.getTimestamp("fec_hs_llegada"),
                rs.getInt("tiempo_vuelo"),
                manager.getEntity(rs.getInt("id_aerolinea"), JdbcAerolineaDao.class),
                manager.getEntity(rs.getInt("id_aeropuerto_salida"),JdbcAeropuertoDao.class),
                manager.getEntity(rs.getInt("id_aeropuerto_llegada"),JdbcAeropuertoDao.class)
        );
    }
}
