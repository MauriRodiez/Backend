package PatronDAO.DAO;

public interface IDao<T> {

    //CRUD

    //CREATE -> Persistir
    T guardar(T t);

    T buscar(T t);

}
