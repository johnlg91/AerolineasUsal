package dao;

import dao.interfaces.Dao;
import dao.jdbc.JdbcDao;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


/**
 * DAO Factory, se encarga de crear los DAO para todas las tablas
 * Cuando lo creo inicializa la coneccion con la base de datos.
 */
public class JdbcDaoFactory implements Closeable {

    private final Connection connection;
    private Map<String, Object> daos = new HashMap<>();

    static final String URL = "jdbc:mysql://localhost:3306/aerolineas";
    public static final String USER = "root";
    public static final String PASS = "aerolineas-usal";

    public JdbcDaoFactory() {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }


    /**
     * Busca el DAO de la clase especificada
     * Si no existe, lo crea usando reflexion
     *
     * @param daoClass, la clase del DAO que se busca(o crea)
     * @param <T>,      el tipo de DAO Ejem: PaisDAO
     * @return el DAO creado
     */
    @SuppressWarnings("unchecked")
    public <T> T getDao(Class<T> daoClass) {
        return (T) daos.computeIfAbsent(daoClass.getName(), s -> {
            try {
                return daoClass.getConstructor(Connection.class).newInstance(connection);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        });
    }


    /**
     * Close the connection when
     * the factory is not used anymore
     */
    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
