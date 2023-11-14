package com.example.kiem_tra_module3.model;

public class TaiKhoan {
    private int ma;
    private String tenTaiKhoan;
    private String SoDKThuNuoi;

    public TaiKhoan(int ma, String tenTaiKhoan, String soDKThuNuoi) {
        this.ma = ma;
        this.tenTaiKhoan = tenTaiKhoan;
        SoDKThuNuoi = soDKThuNuoi;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getSoDKThuNuoi() {
        return SoDKThuNuoi;
    }

    public void setSoDKThuNuoi(String soDKThuNuoi) {
        SoDKThuNuoi = soDKThuNuoi;
    }
}
