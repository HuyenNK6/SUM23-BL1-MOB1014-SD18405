/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5_oop_luyentap;

/**
 *
 * @author Khanh Huyen
 */
public class MayTinh {
//    * - ma: string
//    * - hang: string
//    * - namSX: int
//    * - inch: double
//    * - trangThai: int (1- mới, 2- cũ)
    //1. thuộc tính
    private String ma;
    private String hang;
    private int namSX;
    private double inch;
    private int trangThai;
    
    //2. constructor
    public MayTinh() {
    }

    public MayTinh(String ma, String hang, int namSX, double inch, int trangThai) {
        this.ma = ma;
        this.hang = hang;
        this.namSX = namSX;
        this.inch = inch;
        this.trangThai = trangThai;
    }
    //3. Getter & Setter
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    //4. phương thức inThongTin()
    @Override
    public String toString() {
        return "MayTinh{" + "ma=" + ma + ", hang=" + hang + ", namSX=" + namSX + ", inch=" + inch + ", trangThai=" + trangThai + '}';
    }
    
    public void inThongTin(){
        System.out.println("MayTinh{" + "ma=" + ma + ", hang=" + hang + ", namSX=" + namSX + ", inch=" + inch + ", trangThai=" + (trangThai ==1 ? "Moi" : "cu") + '}');
    }
}
