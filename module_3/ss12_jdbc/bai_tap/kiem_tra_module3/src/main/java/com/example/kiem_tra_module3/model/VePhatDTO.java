package com.example.kiem_tra_module3.model;

public class VePhatDTO {
    private int ma;
    private String maVePhat;
    private String tenTaiKhoan;
    private String soDKThuNuoi;
    private String moTaViPham;
    private String ngayGioViPham;
    private String soTienDongPhat;

    public VePhatDTO(int ma, String maVePhat, String tenTaiKhoan, String soDKThuNuoi, String moTaViPham, String ngayGioViPham, String soTienDongPhat) {
        this.ma = ma;
        this.maVePhat = maVePhat;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDKThuNuoi = soDKThuNuoi;
        this.moTaViPham = moTaViPham;
        this.ngayGioViPham = ngayGioViPham;
        this.soTienDongPhat = soTienDongPhat;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMaVePhat() {
        return maVePhat;
    }

    public void setMaVePhat(String maVePhat) {
        this.maVePhat = maVePhat;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getSoDKThuNuoi() {
        return soDKThuNuoi;
    }

    public void setSoDKThuNuoi(String soDKThuNuoi) {
        this.soDKThuNuoi = soDKThuNuoi;
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
