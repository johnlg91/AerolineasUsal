package dao.jdbc.direccion;

import dao.interfaces.direccion.DireccionDao;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.DaoManager;
import model.direccion.Direccion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcDireccionDao extends AbstractJdbcDao<Direccion> implements DireccionDao {


    public JdbcDireccionDao(DaoManager manager) {
        super(manager);
    }

    @Override
    public boolean insert(Direccion direccion) {
        int id = insert("INSERT INTO direcciones(calle, altura, ciudad, codigo_postal, id_pais, id_provincia, provincia_otro)" +
                " VALUES (?, ?, ?, ?, ?, ?, ?)", direccion);
        direccion.setIdDireccion(id);
        return true;
    }

    @Override
    public boolean update(int id, Direccion direccion) {
        return update("UPDATE direcciones " +
                "SET calle = ?," +
                "    altura = ?," +
                "    ciudad = ?," +
                "    codigo_postal = ?," +
                "    id_pais = ?," +
                "    id_provincia = ?," +
                "    provincia_otro = ?" +
                "WHERE id_direccion = ?", direccion, id) > 0;
    }

    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM direcciones WHERE id_direccion = ?", id);
    }

    @Override
    public Direccion get(int id) {
        return getOne("SELECT * FROM direcciones WHERE id_direccion = " + id + "");

    }

    @Override
    public List<Direccion> getAll() {
        return list("SELECT * FROM direcciones");

    }

    @Override
    protected Direccion create(ResultSet rs) throws SQLException {
        int idPais = rs.getInt("id_pais");
        int idProvincia = rs.getInt("id_provincia");
        return new Direccion(rs.getInt("id_direccion"),
                rs.getString("calle"),
                rs.getInt("altura"),
                rs.getString("ciudad"),
                rs.getInt("codigo_postal"),
                manager.getEntity(idPais, JdbcPaisDao.class),
                manager.getEntity(idProvincia, JdbcProvinciaDao.class),
                rs.getString("provincia_otro"));
    }

    @Override
    protected void setFields(PreparedStatement statement, Direccion entity) throws SQLException {
        statement.setString(1, entity.getCalle());
        statement.setInt(2, entity.getAltura());
        statement.setString(3, entity.getCiudad());
        statement.setInt(4, entity.getCodigoPostal());
        statement.setInt(5, entity.getPais().getIdPais());
        statement.setInt(6, entity.getProvincia().getIdProvincia());
        statement.setString(7, entity.getProvinciaOtro());
    }
}
