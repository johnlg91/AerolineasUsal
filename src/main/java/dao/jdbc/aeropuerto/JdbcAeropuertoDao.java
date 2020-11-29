package dao.jdbc.aeropuerto;

import dao.interfaces.aeropuerto.AeropuertoDAO;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.DaoManager;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.direccion.JdbcPaisDao;
import dao.jdbc.direccion.JdbcProvinciaDao;
import model.aeropuerto.Aeropuerto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcAeropuertoDao extends AbstractJdbcDao<Aeropuerto> implements AeropuertoDAO {
    public JdbcAeropuertoDao(DaoManager manager) {
        super(manager);
    }

    @Override
    public boolean insert(Aeropuerto element) {
        int id = insert("INSERT INTO aeropuertos(codigo_aeropuerto, ciudad, id_pais, id_provincia, provincia_otro)" +
                " VALUES(?,?,?,?,?)", element);
        element.setIdAeropuerto(id);
        return true;
    }

    @Override
    public boolean update(int id, Aeropuerto element) {
        return update("UPDATE aeropuertos" +
                " SET codigo_aeropuerto = ?," +
                "ciudad = ?," +
                "id_pais = ?," +
                "id_provincia = ?," +
                "provincia_otro = ?" +
                "WHERE id_aeropuerto = ?", element, id) > 0;
    }

    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM aeropuertos WHERE id_aeropuerto = ?", id);
    }

    @Override
    public Aeropuerto get(int id) {
        return getOne("SELECT * FROM aeropuertos WHERE id_aeropuerto = " + id);
    }

    @Override
    public List<Aeropuerto> getAll() {
        return list("SELECT * FROM aeropuertos");
    }

    @Override
    protected void setFields(PreparedStatement statement, Aeropuerto entity) throws SQLException {
        statement.setString(1, entity.getCodigoAeropuerto());
        statement.setString(2, entity.getCiudad());
        statement.setInt(3, entity.getPais().getIdPais());
        statement.setInt(4, entity.getProvincia().getIdProvincia());
        //todo revisar si funciona
        statement.setString(5, entity.getProvinciaOtro());
    }

    @Override
    protected Aeropuerto create(ResultSet rs) throws SQLException {
        return new Aeropuerto(
                rs.getInt("id_aeropuerto"),
                rs.getString("codigo_aeropuerto"),
                rs.getString("ciudad"),
                manager.getEntity(rs.getInt("id_pais"), JdbcPaisDao.class),
                manager.getEntity(rs.getInt("id_provincia"), JdbcProvinciaDao.class),
                rs.getString("provincia_otro")
        );
    }
}
