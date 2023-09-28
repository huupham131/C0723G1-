package case_study.repository;

import java.util.List;

public interface IFuramaRepository<E> {
    void add(E e);

    void delete(String id);

    List<E> display();


}
