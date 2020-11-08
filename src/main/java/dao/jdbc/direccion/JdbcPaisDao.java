package dao.jdbc.direccion;

import dao.interfaces.direccion.PaisDao;
import dao.jdbc.JdbcDao;
import model.direccion.Pais;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcPaisDao extends JdbcDao<Pais> implements PaisDao {

    public JdbcPaisDao(Connection connection) {
        super(connection);
    }

    @Override
    public Pais get(int id) {
        return getOne("SELECT * FROM paises WHERE id_pais = '" + id + "'");
    }

    @Override
    public List<Pais> getAll() {
        return list("SELECT * FROM paises");
    }

    protected Pais create(ResultSet rs) throws SQLException {
        return new Pais(rs.getInt("id_pais"),
                rs.getString("codigo_pais"),
                rs.getString("nombre_pais"),
                rs.getInt("codigo_telefono"));
    }

    @Override
    public boolean insert(Pais p) {
        return false;
    }

    @Override
    public boolean modify(int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
