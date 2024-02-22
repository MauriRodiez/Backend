package dbH2;

import java.sql.*;

public class Empleado {

    public static void main(String[] args) {

        Connection connection = null;

        try {

            connection = getConnection();

            Statement statement = connection.createStatement();

            statement.execute("DROP TABLE EMPLEADO IF EXISTS; CREATE TABLE EMPLEADO" +
                    "(ID INT PRIMARY KEY, " +
                    "NOMBRE VARCHAR(120) NOT NULL," +
                    "EDAD INT NOT NULL," +
                    "EMPRESA VARCHAR(120) NOT NULL," +
                    "FECHA_INGRESO DATE NOT NULL) " );

            statement.execute("INSERT INTO EMPLEADO VALUES(1,'ROBERTO',35,'DIGITAL','2020-05-15')," +
                    "(2,'CAMILA',24,'GOOGLE','2023-5-18')," +
                    "(3,'SEBASTIAN',32,'FACEBOOK','2021-6-13') ");

            ResultSet rs = statement.executeQuery("SELECT * FROM EMPLEADO");

            while (rs.next()){
                System.out.println("Nombre: " + rs.getString(2) + " - " + "Empresa: " + rs.getString(4));
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private static Connection getConnection() throws Exception {

        Class.forName("org.h2.Driver");

        return DriverManager.getConnection("jdbc:h2:./Backend", "sa", "sa");
    }
}
