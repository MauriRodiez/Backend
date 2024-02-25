package PatronDAO;

import PatronDAO.DAO.BD;
import PatronDAO.Model.Medicamento;
import PatronDAO.Service.MedicamentoService;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        MedicamentoService medicamentoService = new MedicamentoService();
        BD.createTable();

        Medicamento medicamento = new Medicamento("lolo","ARA",12,100.0,123);
        Medicamento medicamento1 = new Medicamento("Aspirina","Bayer",15,150.0,233);
        Medicamento medicamento2 = new Medicamento("Vacuna","Pfizer",18,120.0,321);


        medicamentoService.guardar(medicamento);
        medicamentoService.guardar(medicamento1);
        medicamentoService.guardar(medicamento2);


        medicamentoService.buscar(medicamento);

    }
}
