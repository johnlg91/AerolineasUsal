package dao.jdbc.cliente;

import dao.interfaces.DaoInterface;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.direccion.JdbcPaisDao;
import model.cliente.Pasaporte;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcPasaporteDao extends AbstractJdbcDao<Pasaporte> implements DaoInterface<Pasaporte> {
    protected JdbcPasaporteDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(Pasaporte element) {
        return false;
    }

    @Override
    public boolean update(int id, Pasaporte element) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM pasaportes WHERE id_pasaporte = ?", id);
    }

    @Override
    public Pasaporte get(int id) {
        return getOne("SELECT * FROM pasaportes WHERE id_pasaporte = " + id + " ");
    }

    @Override
    public List<Pasaporte> getAll() {
        return list("SELECT * FROM pasaportes");
    }

    @Override
    protected Pasaporte create(ResultSet rs) throws SQLException {
        final int idPais = rs.getInt("id_pais");
        JdbcPaisDao paisDao = factory.getDao(JdbcPaisDao.class);
        return new Pasaporte(rs.getInt("id_pasaporte"),
                rs.getInt("nro_pasaporte"),
                rs.getString("autoridad_emision"),
                rs.getDate("fecha_emision"),
                rs.getDate("fecha_vencimiento"),
                paisDao.get(idPais));
    }

    @Override
    protected void setFields(PreparedStatement statement, Pasaporte entity) throws SQLException {
        statement.setInt(1, entity.getNroPasaporte());
        statement.setString(2, entity.getAutoridadEmision());
        statement.setDate(3, entity.getFechaEmision());
        statement.setDate(4, entity.getFechaVencimiento());
        statement.setInt(5, entity.getPais().getIdPais());
    }
}
