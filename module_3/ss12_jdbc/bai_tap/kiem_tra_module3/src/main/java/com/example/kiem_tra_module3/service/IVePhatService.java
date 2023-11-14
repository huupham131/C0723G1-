package com.example.kiem_tra_module3.service;

import com.example.kiem_tra_module3.model.TaiKhoan;
import com.example.kiem_tra_module3.model.VePhat;
import com.example.kiem_tra_module3.model.VePhatDTO;

import java.util.List;

public interface IVePhatService {
    void themVePhat(VePhat vePhat);
    boolean xoaVePhat(int ma);
    List<VePhatDTO> hienThiVePhat();
    List<TaiKhoan> layTatCaTK();
}
