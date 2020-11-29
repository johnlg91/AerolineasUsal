package dao.jdbc;

import dao.interfaces.DaoInterface;
import dao.jdbc.direccion.JdbcProvinciaDao;

import java.sql.Connection;

public class DaoManager {
    private JdbcDaoFactory daoFactory;

    public DaoManager(JdbcDaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    /**
     *
     * @param id  The key for retriving the entity
     * @param clazz The Class of the JdbcDao of the Entity
     * @param <E> The Entity (i.e. Direccion)
     * @param <D> The Dao for the Entity (i.e. JdbcDireccionDao)
     * @return An instance of the Entity (i.e. a Direccion)
     */
    public  <E, D extends DaoInterface<E>> E getEntity(int id, Class<D> clazz) {
            return daoFactory.getDao(clazz).get(id);
    }

    public Connection getConnection() {
        return daoFactory.getConnection();
    }

}
