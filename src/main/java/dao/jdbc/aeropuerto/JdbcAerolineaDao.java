package dao.jdbc.aeropuerto;

import dao.interfaces.aeropuerto.AerolineaDao;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.DaoManager;
import dao.jdbc.JdbcDaoFactory;
import model.aeropuerto.Aerolinea;
import model.aeropuerto.Alianza;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcAerolineaDao extends AbstractJdbcDao<Aerolinea> implements AerolineaDao {


    public JdbcAerolineaDao(DaoManager manager) {
        super(manager);
    }

    @Override
    public boolean insert(Aerolinea element) {
        int id = insert("INSERT INTO aerolineas(nombre_aerolinea, alianza)" +
                " VALUES (?, ?)", element);
        element.setIdAerolinea(id);
        return id > 0;
    }

    @Override
    public boolean update(int id, Aerolinea aerolinea) {
        return update("UPDATE aerolineas " +
                "SET nombre_aerolinea = ?," +
                "alianza = ? WHERE id_aerolinea = ?", aerolinea, id) > 0;
    }

    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM aerolineas WHERE id_aerolinea = " + id, id);
    }

    @Override
    public Aerolinea get(int id) {
        return getOne("SELECT * FROM aerolineas WHERE id_aerolinea = " + id);
    }

    @Override
    public List<Aerolinea> getAll() {
        return list("SELECT * FROM aerolineas");
    }

    @Override
    protected void setFields(PreparedStatement statement, Aerolinea entity) throws SQLException {
        statement.setString(1, entity.getNombreAerolinea());
        final Alianza alianza = entity.getAlianza();
        statement.setString(2, alianza == null ? "" : alianza.toString());
    }

    @Override
    protected Aerolinea create(ResultSet rs) throws SQLException {
        return new Aerolinea(rs.getInt("id_aerolinea"),
                rs.getString("nombre_aerolinea"),
                //accede al enum...sera malo?
                Alianza.fromString(rs.getString("alianza")));
    }
}
