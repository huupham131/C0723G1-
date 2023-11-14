package com.example.kiem_tra_module3.service.impl;

import com.example.kiem_tra_module3.model.TaiKhoan;
import com.example.kiem_tra_module3.model.VePhat;
import com.example.kiem_tra_module3.model.VePhatDTO;
import com.example.kiem_tra_module3.repository.IVePhatRepository;
import com.example.kiem_tra_module3.repository.impl.VePhatRepository;
import com.example.kiem_tra_module3.service.IVePhatService;

import java.util.List;

public class VePhatService implements IVePhatService {
    private final IVePhatRepository vePhatRepository = new VePhatRepository();
    @Override
    public void themVePhat(VePhat vePhat) {
        vePhatRepository.themVePhat(vePhat);
    }

    @Override
    public boolean xoaVePhat(int ma) {
        return vePhatRepository.xoaVePhat(ma);
    }

    @Override
    public List<VePhatDTO> hienThiVePhat() {
        return vePhatRepository.hienThiVePhat();
    }

    @Override
    public List<TaiKhoan> layTatCaTK() {
        return vePhatRepository.layTatCaTK();
    }
}
