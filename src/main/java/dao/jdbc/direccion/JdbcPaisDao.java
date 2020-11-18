package dao.jdbc.direccion;

import dao.interfaces.direccion.PaisDao;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import model.direccion.Pais;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcPaisDao extends AbstractJdbcDao<Pais> implements PaisDao {


    public JdbcPaisDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(Pais pais) {
        int id = insert("INSERT INTO paises(codigo_pais, nombre_pais, codigo_telefono) VALUES (?, ?, ?)", pais);
        pais.setIdPais(id);
        return true;
    }

    @Override
    public boolean update(int id, Pais element) {
        return update("UPDATE paises" +
                " SET codigo_pais = ?, " +
                " nombre_pais = ?, " +
                " codigo_telefono = ? " +
                " WHERE id_pais = ?", element, id) > 0;
    }


    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM paises WHERE id_pais = ?",id);
    }

    @Override
    public Pais get(int id) {
        return getOne("SELECT * FROM paises WHERE id_pais = " + id + "");
    }

    @Override
    public List<Pais> getAll() {
        return list("SELECT * FROM paises");
    }


    @Override
    protected Pais create(ResultSet rs) throws SQLException {
        return new Pais(rs.getInt("id_pais"),
                rs.getString("codigo_pais"),
                rs.getString("nombre_pais"),
                rs.getInt("codigo_telefono"));
    }

    @Override
    protected void setFields(PreparedStatement statement, Pais entity) throws SQLException {
        statement.setString(1, entity.getCodigoPais());
        statement.setString(2, entity.getNombrePais());
        statement.setInt(3, entity.getCodigoTelefono());
    }
}
