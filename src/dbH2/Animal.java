package dbH2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Animal {

    public static void main(String[] args) {

        Connection connection = null;
        try {
            // conexion a la base de datos
            connection = getConnection();

            // Statement - orden a la DB
            Statement statement = connection.createStatement();

            // DROP-CREATE crear la tabla
            statement.execute(" DROP TABLE IF EXISTS ANIMALES; CREATE TABLE ANIMALES" +
                    "(ID INT PRIMARY KEY, " +
                    "NOMBRE VARCHAR(100) NOT NULL, " +
                    "TIPO VARCHAR(100) NOT NULL )" );

            // INSERTAR VALORES EN LA TABLA
            statement.execute("INSERT INTO ANIMALES VALUES(1, 'SIMON', 'PERRO')," +
                    "(2, 'GAHIA', 'PERRO')," +
                    "(3, 'VOLI', 'PERRO')" );

            // CONSULTAR DB
            ResultSet rs = statement.executeQuery("SELECT * FROM ANIMALES");
            while(rs.next()){
                System.out.println("Nombre: " + rs.getString(2) + " y tipo: " + rs.getString(3));
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            //Cerrar conexion
            try{
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");

        return DriverManager.getConnection("jdbc:h2:./Backend", "sa","sa");
    }
}
