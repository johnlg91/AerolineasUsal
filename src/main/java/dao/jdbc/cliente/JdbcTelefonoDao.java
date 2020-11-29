package dao.jdbc.cliente;

import dao.interfaces.DaoInterface;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.DaoManager;
import dao.jdbc.JdbcDaoFactory;
import model.cliente.Telefono;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTelefonoDao extends AbstractJdbcDao<Telefono> implements DaoInterface<Telefono> {


    public JdbcTelefonoDao(DaoManager manager) {
        super(manager);
    }

    @Override
    public boolean insert(Telefono element) {
        int id = insert("INSERT INTO telefonos(personal, celular, laboral)" +
                " VALUES (?, ?, ?)", element);
        element.setIdTelefonos(id);
        return id >= 0;
    }

    @Override
    public boolean update(int id, Telefono element) {
        return update("UPDATE telefonos" +
                " SET personal = ?," +
                " celular = ?," +
                " laboral = ?" +
                " WHERE id_telefono = ?", element, id) > 0;
    }

    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM telefonos WHERE id_telefono = ?", id);
    }

    @Override
    public Telefono get(int id) {
        return getOne("SELECT * FROM telefonos WHERE id_telefono = " + id + " ");
    }

    @Override
    public List<Telefono> getAll() {
        return list("SELECT * FROM telefonos");
    }

    @Override
    protected Telefono create(ResultSet rs) throws SQLException {
        return new Telefono(rs.getInt("id_telefono"),
                rs.getString("personal"),
                rs.getString("celular"),
                rs.getString("laboral"));
    }

    @Override
    protected void setFields(PreparedStatement statement, Telefono entity) throws SQLException {
        statement.setString(1, entity.getPersonal());
        statement.setString(2, entity.getCelular());
        statement.setString(3, entity.getLaboral());
    }


}
