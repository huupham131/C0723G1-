package com.example.library.service;

import com.example.library.model.BorrowCode;
import com.example.library.repository.IBorrowCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowCodeServiceImpl implements IBorrowCodeService{
    @Autowired
    private IBorrowCodeRepository borrowCodeRepository;
    @Override
    public void createBorrowCode(BorrowCode borrowCode) {
        borrowCodeRepository.save(borrowCode);
    }

    @Override
    public boolean checkCode(String code) {
        List<String> listCode =borrowCodeRepository.getAllCode();
        for (String code1:listCode){
            if(code1.equals(code)){
                return true;
            }
        }
        return false;
    }

    @Override
    public BorrowCode getBorrowCodeByCode(String code) {
        return borrowCodeRepository.getBorrowCodeByCode(code);
    }

    @Override
    public void updateBorrowCode(BorrowCode borrowCode) {
        borrowCodeRepository.save(borrowCode);
    }
}
