package dbH2;

import com.sun.source.tree.WhileLoopTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Figuras {

    public static void main(String[] args) {

        Connection connection = null;

        try {
            //Coneccion a la BD
            connection = getConnection();

            Statement statement = connection.createStatement();

            statement.execute(" DROP TABLE IF EXISTS FIGURAS; CREATE TABLE FIGURAS" +
                    "(ID INT PRIMARY KEY, " +
                    "TIPO VARCHAR(100) NOT NULL, " +
                    "COLOR VARCHAR(100) NOT NULL )" );

            statement.execute("INSERT INTO FIGURAS VALUES(1, 'CIRCULO', 'ROJO')," +
                    "(2, 'CUADRADO', 'AZUL'), "+
                    "(3, 'CUADRADO', 'ROSA')," +
                    "(4, 'CIRCULO', 'ROJO')," +
                    "(5, 'CUADRADO', 'AMARLLO')");

            // Consulto todas las figuras
            ResultSet rs = statement.executeQuery("SELECT * FROM FIGURAS");
            while(rs.next()){
                System.out.println("Figura: " + rs.getString(2) + " color: " + rs.getString(3));
            }

            // Consulto las figuras de color rojo
            ResultSet rsColor = statement.executeQuery("SELECT * FROM FIGURAS WHERE COLOR = 'ROJO' ");
            while (rsColor.next()){
                System.out.println("Las figuras de color Rojo son: " + rsColor.getString(2));
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }


    }

    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");

        return DriverManager.getConnection("jdbc:h2:./Backend", "sa","sa");
    }

}
