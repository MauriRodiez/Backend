package PatronDAO.Service;

import PatronDAO.DAO.IDao;
import PatronDAO.DAO.Implementation.MedicamentoDAOH2;
import PatronDAO.Model.Medicamento;

public class MedicamentoService {

    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(){
        this.medicamentoIDao = new MedicamentoDAOH2();
    }

    public Medicamento guardar(Medicamento medicamento){
        return medicamentoIDao.guardar(medicamento);
    }

    public Medicamento buscar(Medicamento medicamento){
        return medicamentoIDao.buscar(medicamento);
    }

}
