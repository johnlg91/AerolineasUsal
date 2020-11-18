package dao.jdbc;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


/**
 * DAO Factory, se encarga de crear los DAO para todas las tablas
 * Cuando lo creo inicializa la coneccion con la base de datos.
 */
public class JdbcDaoFactory implements Closeable {

    private Connection connection;
    private Map<String, Object> daos = new HashMap<>();


    public JdbcDaoFactory() {
        try {
            Properties properties = new Properties();
            InputStream inputStream = new FileInputStream("/home/fjgoni/Escritorio/Facultad/Programacion Avanzada/AerolineasUsal/src/main/resources/db/Connection.properties");
            properties.load(inputStream);
            this.connection = DriverManager.getConnection(properties.getProperty("URL"),
                    properties.getProperty("USER"),
                    properties.getProperty("PASS"));
            System.out.println(properties.get("USER"));
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        } catch (IOException e) {
            System.out.println("Connection.properties not found");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
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
                return daoClass.getConstructor(JdbcDaoFactory.class).newInstance(this);
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
