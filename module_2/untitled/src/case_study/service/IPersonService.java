package case_study.service;

import case_study.service.IFuramaService;

import java.util.List;

public interface IPersonService<E> extends IFuramaService<E> {
    void edit(E e);
    List<E> searchByName(String name);

}
