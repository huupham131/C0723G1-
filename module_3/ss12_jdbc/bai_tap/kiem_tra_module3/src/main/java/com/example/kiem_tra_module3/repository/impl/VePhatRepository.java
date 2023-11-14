package com.example.kiem_tra_module3.repository.impl;

import com.example.kiem_tra_module3.model.TaiKhoan;
import com.example.kiem_tra_module3.model.VePhat;
import com.example.kiem_tra_module3.model.VePhatDTO;
import com.example.kiem_tra_module3.repository.IVePhatRepository;
import com.example.kiem_tra_module3.util.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VePhatRepository implements IVePhatRepository {
private final String LAY_TAT_CA_VE = "SELECT * FROM ve_phat vp join tai_khoan tk on vp.ma_dang_ky_thu_nuoi = tk.ma ;";
private final String LAY_TAI_KHOAN = "SELECT * FROM tai_khoan tk ;";
private final String THEM_VE_PHAT = "INSERT INTO `ve_phat` (ma_ve_phat,`ma_dang_ky_thu_nuoi`, `mo_ta_vi_pham`, `ngay_gio_vi_pham`, `so_tien_phat`) VALUES (?,?,?,?,?);";
    @Override
    public void themVePhat(VePhat vePhat) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(THEM_VE_PHAT);
            preparedStatement.setString(1,vePhat.getMaVePhat());
            preparedStatement.setInt(2,vePhat.getMaDangKyThuNuoi());
            preparedStatement.setString(3,vePhat.getMoTaViPham());
            preparedStatement.setString(4,vePhat.getNgayGioViPham());
            preparedStatement.setString(5,vePhat.getSoTienDongPhat());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean xoaVePhat(int ma) {
        return false;
    }

    @Override
    public List<VePhatDTO> hienThiVePhat() {
        List<VePhatDTO> vePhatDTOS = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(LAY_TAT_CA_VE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int ma = resultSet.getInt("ma");
                String maVePhat = resultSet.getString("ma_ve_phat");
                String tenTaiKhoan = resultSet.getString("ten_tai_khoan");
                String soDKThuNuoi = resultSet.getString("so_dang_ky_thu_nuoi");
                String loiVP = resultSet.getString("mo_ta_vi_pham");
                String ngayGioVP = resultSet.getString("ngay_gio_vi_pham");
                String soTienPhat = resultSet.getString("so_tien_phat");
                vePhatDTOS.add(new VePhatDTO(ma,maVePhat,tenTaiKhoan,soDKThuNuoi,loiVP,ngayGioVP,soTienPhat));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vePhatDTOS;
    }

    @Override
    public List<TaiKhoan> layTatCaTK() {
        List<TaiKhoan> taiKhoans = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(LAY_TAI_KHOAN);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int ma = resultSet.getInt("ma");
                String tenTaiKhoan = resultSet.getString("ten_tai_khoan");
                String soDKThuNuoi = resultSet.getString("so_dang_ky_thu_nuoi");
                taiKhoans.add(new TaiKhoan(ma,tenTaiKhoan,soDKThuNuoi));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return taiKhoans;
    }
}
