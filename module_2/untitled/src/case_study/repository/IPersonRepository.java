package case_study.repository;

import java.util.List;

public interface IPersonRepository<E> extends IFuramaRepository<E> {
    public static final String COMMA = ",";
    void edit(E e);
    List<E> searchByName(String name);
}
