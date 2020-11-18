package dao.interfaces.cliente;

import dao.interfaces.DaoInterface;
import model.cliente.Cliente;

public interface ClienteDAO extends DaoInterface<Cliente> {

    Cliente getByDniEmail(int dni, String email);

}
