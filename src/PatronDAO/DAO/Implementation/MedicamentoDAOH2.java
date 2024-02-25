package PatronDAO.DAO.Implementation;

import PatronDAO.DAO.BD;
import PatronDAO.DAO.IDao;
import PatronDAO.Model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.*;

public class MedicamentoDAOH2 implements IDao<Medicamento> {

    private static final Logger LOGGER = Logger.getLogger(MedicamentoDAOH2.class);

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        LOGGER.info("Estamos persistiendo un medicamento");

        Connection connection = null;

        try {
            connection = BD.getConnection();
            //Insert con prepared statement
            PreparedStatement psInsert = connection.prepareStatement("INSERT INTO MEDICAMENTOS (NOMBRE, LABORATORIO, CANTIDAD, PRECIO, CODIGO) VALUES(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            // Statement.RETURN_GENERATE_KEYS -> Genera el ID autoincremental

            psInsert.setString(1, medicamento.getNombre());
            psInsert.setString(2, medicamento.getLaboratorio());
            psInsert.setInt(3, medicamento.getCantidad());
            psInsert.setDouble(4, medicamento.getPrecio());
            psInsert.setInt(5, medicamento.getCodigo());

            psInsert.execute();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return medicamento;
    }

    @Override
    public Medicamento buscar(Medicamento medicamento) {

        LOGGER.info("Medicamento encontrado al realizar busqueda por ID");

        Connection connection = null;

        try {
            connection = BD.getConnection();

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM MEDICAMENTOS WHERE ID = 2");

            while (rs.next()){
                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3) + " " +
                        rs.getInt(4) + " " +
                        rs.getDouble(5) + " " +
                        rs.getInt(6));
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

        return medicamento;
    }


}
