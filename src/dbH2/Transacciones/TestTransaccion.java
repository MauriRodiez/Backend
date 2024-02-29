package dbH2.Transacciones;

import java.sql.*;

public class TestTransaccion {

    private static final String SQL_CREATE = "DROP TABLE IF EXISTS PACIENTES; CREATE TABLE PACIENTES" +
            "(ID INT PRIMARY KEY," +
            "NOMBRE VARCHAR(50) NOT NULL," +
            "APELLIDO VARCHAR(50) NOT NULL," +
            "DOMICILIO VARCHAR(200)," +
            "DNI INT NOT NULL," +
            "FECHA_DE_ALTA DATE NOT NULL," +
            "USUARIO VARCHAR(100) NOT NULL," +
            "PASSWORD VARCHAR(150) NOT NULL)";
    private static final String SQL_INSERT = "INSERT INTO PACIENTES (ID, NOMBRE, APELLIDO, DOMICILIO, DNI, FECHA_DE_ALTA,USUARIO, PASSWORD) " +
            "VALUES(?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE PACIENTES SET PASSWORD = ? WHERE ID = ?";

    public static void main(String[] args) throws Exception{

        Paciente paciente = new Paciente("Pablo","Perez","Av. Italia 5465",2131454,new Date(2023,12,03),"pape","pa123");

        Connection connection = null;

        try{

            connection = getConnection();

            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE);

            // Creo el insert
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);

            //Empiezo a insertar datos
            psInsert.setInt(1,1);
            psInsert.setString(2, paciente.getNombre());
            psInsert.setString(3, paciente.getApellido());
            psInsert.setString(4, paciente.getDomicilio());
            psInsert.setInt(5, paciente.getDni());
            psInsert.setDate(6, (Date) paciente.getFechaAlta());
            psInsert.setString(7, paciente.getUsuario());
            psInsert.setString(8,paciente.getPassword());
            // ejecuto la insercion
            psInsert.execute();

            //Empiezo la transaccion
            connection.setAutoCommit(false);

            // Update
            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            // Empiezo el update
            paciente.setPassword("11111111");
            psUpdate.setString(1, paciente.getPassword());
            psUpdate.setInt(2,1);
            psUpdate.execute();

            //Causar error
            int a = 4/0;

            connection.commit();

            connection.setAutoCommit(true);

            String consulta = "SELECT * FROM PACIENTES";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);

            while (rs.next()){
                System.out.println(rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3) + " " +
                        rs.getString(4) + " " +
                        rs.getInt(5) + " " +
                        rs.getDate(6) + " " +
                        rs.getString(7) + " " +
                        rs.getString(8));
            }

        }catch (Exception e){
            e.printStackTrace();
                connection.rollback();
        } finally {
                connection.close();
        }

        Connection connection1 = getConnection();
        String consulta = "SELECT * FROM PACIENTES";
        Statement stmt = connection1.createStatement();
        ResultSet rs = stmt.executeQuery(consulta);
        while (rs.next()){
            System.out.println(rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3) + " " +
                    rs.getString(4) + " " +
                    rs.getInt(5) + " " +
                    rs.getDate(6) + " " +
                    rs.getString(7) + " " +
                    rs.getString(8));
        }

    }

    private static Connection getConnection() throws Exception{

        Class.forName("org.h2.Driver");

        return DriverManager.getConnection("jdbc:h2:./Backend", "sa", "sa");
    }
}
