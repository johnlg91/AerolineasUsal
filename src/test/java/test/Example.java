package test;

import java.sql.*;

public class Example {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aerolineas", "root", "Arescom1234!")) {

            System.out.println("Java JDBC PostgreSQL Example");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver");

            System.out.println("Connected to PostgreSQL database!");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM paises");
            System.out.println("Reading Paises");
            System.out.printf("%-30.30s  %-30.30s%n", "Codigo", "Nombre");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("id_pais"), resultSet.getString("nombre_pais"));
            }

        }
        catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}