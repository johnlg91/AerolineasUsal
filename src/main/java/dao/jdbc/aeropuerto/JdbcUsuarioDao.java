package dao.jdbc.aeropuerto;

import dao.interfaces.aeropuerto.UsuarioDAO;
import dao.jdbc.AbstractJdbcDao;
import dao.jdbc.JdbcDaoFactory;
import model.aeropuerto.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcUsuarioDao extends AbstractJdbcDao<Usuario> implements UsuarioDAO {
    public JdbcUsuarioDao(JdbcDaoFactory factory) {
        super(factory);
    }

    @Override
    public boolean insert(Usuario element) {
        int id = insert("INSERT INTO usuarios(nombre_usuario, clave, perfil)" +
                " VALUE (?,?,?)", element);
        return id >= 0;
    }

    @Override
    public boolean update(int id, Usuario element) {
        return update("UPDATE usuarios" +
                " SET nombre_usuario = ?," +
                "clave = ?," +
                "perfil = ?" +
                "WHERE id_usuarios = ?", element, id) > 0;
    }

    @Override
    public boolean delete(int id) {
        return delete("DELETE FROM usuarios WHERE id_usuarios = ?", id);
    }

    @Override
    public Usuario get(int id) {
        return getOne("SELECT  * FROM usuarios WHERE id_usuarios = " + id);
    }

    @Override
    public List<Usuario> getAll() {
        return list("SELECT * FROM usuarios");
    }

    @Override
    protected void setFields(PreparedStatement statement, Usuario entity) throws SQLException {
        statement.setString(1, entity.getNombreUsuario());
        statement.setString(2, entity.getClave());
        statement.setString(3, entity.getPerfil());
    }

    @Override
    protected Usuario create(ResultSet rs) throws SQLException {
        return new Usuario(
                rs.getInt("id_usuarios"),
                rs.getString("nombre_usuarios"),
                rs.getString("clave"),
                rs.getString("perfil")
        );
    }
}
