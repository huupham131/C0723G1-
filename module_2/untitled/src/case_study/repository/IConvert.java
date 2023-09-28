package case_study.repository;

import java.util.List;

public interface IConvert<E> {
    List<E> convertToObject(List<String> strings);

    List<String> convertToString(List<E> e);
}
