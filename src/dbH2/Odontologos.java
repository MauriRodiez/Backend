package dbH2;

import java.sql.*;

public class Odontologos {

    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = getConnection();

            Statement statement = connection.createStatement();

            statement.execute("DROP TABLE IF EXISTS ODONTOLOGO; CREATE TABLE ODONTOLOGO" +
                    "(ID INT PRIMARY KEY," +
                    "APELLIDO VARCHAR(120) NOT NULL," +
                    "NOMBRE VARCHAR(120) NOT NULL," +
                    "MATRICULA INT NOT NULL)" );

            statement.execute("INSERT INTO ODONTOLOGO VALUES(1,'PEREZ','ANA',123), " +
                    "(2,'LOPEZ','SERGIO',321)");

            // consulto todos los datos de la tabla
            ResultSet rs = statement.executeQuery("SELECT * FROM ODONTOLOGO");

            while (rs.next()){
                System.out.println("Nombre y apellido: " + rs.getString(3) +
                        " " + rs.getString(2) + " - Matricula: " + rs.getString(4));
            }

            // Modificar la matricula de un odontologo
            //statement.executeUpdate("UPDATE ODONTOLOGO SET MATRICULA = 124 WHERE ID=2");
            // Utilizando update con sentencia parametrizada con prepared statement
            String uodate= "UPDATE ODONTOLOGO SET MATRICULA = ? WHERE ID = ?";
            try(PreparedStatement pstmt = connection.prepareStatement(uodate)){
                pstmt.setInt(1,125);
                pstmt.setInt(2,2);
                pstmt.executeUpdate();
            } catch (SQLException e){
                e.printStackTrace();
            }


            ResultSet rsUpdated = statement.executeQuery("SELECT * FROM ODONTOLOGO");

            while (rsUpdated.next()){
                System.out.println("Nombre y apellido: " + rsUpdated.getString(3) +
                        " " + rsUpdated.getString(2) + " - Matricula: " + rsUpdated.getString(4));
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

    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");

        return DriverManager.getConnection("jdbc:h2:./Backend", "sa", "sa");
    }

}
