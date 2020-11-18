package dao.interfaces.aeropuerto;

import dao.interfaces.DaoInterface;
import model.aeropuerto.Usuario;

public interface UsuarioDAO extends DaoInterface<Usuario> {
    Usuario getByName(String name);

}
