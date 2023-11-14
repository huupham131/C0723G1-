package com.example.kiem_tra_module3.model;

public class VePhat {
    private int ma;
    private String maVePhat;
    private int maDangKyThuNuoi;
    private String moTaViPham;
    private String ngayGioViPham;
    private String soTienDongPhat;

    public VePhat(int ma, int maDangKyThuNuoi, String moTaViPham, String ngayGioViPham, String soTienDongPhat) {
        this.ma = ma;
        this.maDangKyThuNuoi = maDangKyThuNuoi;
        this.moTaViPham = moTaViPham;
        this.ngayGioViPham = ngayGioViPham;
        this.soTienDongPhat = soTienDongPhat;
    }

    public VePhat(String maVePhat, int maDangKyThuNuoi, String moTaViPham, String ngayGioViPham, String soTienDongPhat) {
        this.maVePhat = maVePhat;
        this.maDangKyThuNuoi = maDangKyThuNuoi;
        this.moTaViPham = moTaViPham;
        this.ngayGioViPham = ngayGioViPham;
        this.soTienDongPhat = soTienDongPhat;
    }

    public VePhat(int ma, String maVePhat, int maDangKyThuNuoi, String moTaViPham, String ngayGioViPham, String soTienDongPhat) {
        this.ma = ma;
        this.maVePhat = maVePhat;
        this.maDangKyThuNuoi = maDangKyThuNuoi;
        this.moTaViPham = moTaViPham;
        this.ngayGioViPham = ngayGioViPham;
        this.soTienDongPhat = soTienDongPhat;
    }

    public String getMaVePhat() {
        return maVePhat;
    }

    public void setMaVePhat(String maVePhat) {
        this.maVePhat = maVePhat;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getMaDangKyThuNuoi() {
        return maDangKyThuNuoi;
    }

    public void setMaDangKyThuNuoi(int maDangKyThuNuoi) {
        this.maDangKyThuNuoi = maDangKyThuNuoi;
    }

    public String getMoTaViPham() {
        return moTaViPham;
    }

    public void setMoTaViPham(String moTaViPham) {
        this.moTaViPham = moTaViPham;
    }

    public String getNgayGioViPham() {
        return ngayGioViPham;
    }

    public void setNgayGioViPham(String ngayGioViPham) {
        this.ngayGioViPham = ngayGioViPham;
    }

    public String getSoTienDongPhat() {
        return soTienDongPhat;
    }

    public void setSoTienDongPhat(String soTienDongPhat) {
        this.soTienDongPhat = soTienDongPhat;
    }
}
