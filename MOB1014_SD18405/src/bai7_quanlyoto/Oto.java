/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7_quanlyoto;

/**
 *
 * @author Khanh Huyen
 */
public class Oto {
    //1. thuộc tính
    private int id;
    private String hang;
    private double gia;
    private int namSX;
    private int trangThai;//1-mới, 2- cũ
    
    //2. constructor
    public Oto() {
    }
    public Oto(int id, String hang, double gia, int namSX, int trangThai) {
        this.id = id;
        this.hang = hang;
        this.gia = gia;
        this.namSX = namSX;
        this.trangThai = trangThai;
    }

    //3. Getter & Setter
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    //4. inThongTin()

    @Override
    public String toString() {
        return "Oto{" + "id=" + id + ", hang=" + hang + ", gia=" + gia + ", namSX=" + namSX + ", trangThai=" + trangThai + '}';
    }

    public void inThongTin(){
        System.out.println("Oto{" + "id=" + id + ", hang=" + hang + ", gia=" + gia + ", namSX=" + namSX + ", trangThai=" + trangThai + '}');
    }
}
