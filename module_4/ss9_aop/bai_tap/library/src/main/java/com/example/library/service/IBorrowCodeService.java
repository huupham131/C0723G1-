package com.example.library.service;

import com.example.library.model.BorrowCode;
import org.springframework.data.repository.query.Param;

public interface IBorrowCodeService {
    void createBorrowCode(BorrowCode borrowCode);
    boolean checkCode(String code);
    BorrowCode getBorrowCodeByCode(String code);
    void updateBorrowCode(BorrowCode borrowCode);
}
