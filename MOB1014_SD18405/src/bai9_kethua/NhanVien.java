/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai9_kethua;

/**
 *
 * @author Khanh Huyen
 */
public class NhanVien extends Nguoi{
    private String mnv;
    private String chucVu;

    public NhanVien() {
    }

    public NhanVien(String mnv, String chucVu) {
        this.mnv = mnv;
        this.chucVu = chucVu;
    }

    public NhanVien(String mnv, String chucVu, String ten, int namSinh, int gioiTinh) {
        super(ten, namSinh, gioiTinh);
        this.mnv = mnv;
        this.chucVu = chucVu;
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    
}
