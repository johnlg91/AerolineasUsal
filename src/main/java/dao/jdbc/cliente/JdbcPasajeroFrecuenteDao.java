package dao.jdbc.cliente;

import dao.interfaces.cliente.PasajeroFrecuenteDAO;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.aeropuerto.JdbcAerolineaDao;
import model.cliente.PasajeroFrecuente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcPasajeroFrecuenteDao extends AbstractJdbcDao<PasajeroFrecuente> implements PasajeroFrecuenteDAO {
    public JdbcPasajeroFrecuenteDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(PasajeroFrecuente element) {
        int id = insert("INSERT INTO pasajeros_frecuentes(alianza, numero, categoria, id_aerolinea)" +
                "VALUES (?, ?, ?, ?)", element);
        element.setIdPasajeroFrecuente(id);
        return id >= 0;
    }

    @Override
    public boolean update(int id, PasajeroFrecuente element) {
        return update("UPDATE pasajeros_frecuentes " +
                "SET alianza = ?," +
                "numero = ?," +
                "categoria = ?," +
                "id_aerolinea = ?" +
                "WHERE id_pasajero_frecuente = ?", element, id) > 0;
    }

    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM pasajeros_frecuentes WHERE id_pasajero_frecuente = ?", id);
    }

    @Override
    public PasajeroFrecuente get(int id) {
        return getOne("SELECT * FROM pasajeros_frecuentes WHERE id_pasajero_frecuente = " + id);
    }

    @Override
    public List<PasajeroFrecuente> getAll() {
        return list("SELECT * FROM pasajeros_frecuentes");

    }

    @Override
    protected void setFields(PreparedStatement statement, PasajeroFrecuente entity) throws SQLException {
        statement.setString(1, entity.getAlianza());
        statement.setInt(2, entity.getNumero());
        statement.setString(3, entity.getCategoria());
        statement.setInt(4, entity.getAerolinea().getIdAerolinea());
    }

    @Override
    protected PasajeroFrecuente create(ResultSet rs) throws SQLException {
        JdbcAerolineaDao aerolineaDao = factory.getDao(JdbcAerolineaDao.class);
        int idAerolinea = rs.getInt("id_aerolinea");
        return new PasajeroFrecuente(rs.getInt("id_pasajero_frecuente"),
                rs.getString("alianza"),
                rs.getInt("numero"),
                rs.getString("categoria"),
                aerolineaDao.get(idAerolinea));
    }
}
