package com.example.library.repository;

import com.example.library.model.BorrowCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBorrowCodeRepository extends JpaRepository<BorrowCode,Integer> {
    @Query(value = "select code from borrow_code", nativeQuery = true)
    List<String> getAllCode();
    @Query(value = "SELECT * FROM borrow_code where code =:code and status = 1;", nativeQuery = true)
    BorrowCode getBorrowCodeByCode(@Param("code") String code);
}
