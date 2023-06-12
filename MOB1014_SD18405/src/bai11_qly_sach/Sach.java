/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11_qly_sach;

/**
 *
 * @author Khanh Huyen
 */
public class Sach {
    private String code;
    private String ten;
    private String theLoai;
    private int namXuatBan;
    private double gia;

    public Sach() {
    }

    public Sach(String code, String ten, String theLoai, int namXuatBan, double gia) {
        this.code = code;
        this.ten = ten;
        this.theLoai = theLoai;
        this.namXuatBan = namXuatBan;
        this.gia = gia;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Sach{" + "code=" + code + ", ten=" + ten + ", theLoai=" + theLoai + ", namXuatBan=" + namXuatBan + ", gia=" + gia + '}';
    }
    
    public void inThongTin(){
        System.out.println("Sach{" + "code=" + code + ", ten=" + ten + ", theLoai=" + theLoai + ", namXuatBan=" + namXuatBan + ", gia=" + gia + '}');
    }
}
