/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12_truu_tuong;

/**
 *
 * @author Khanh Huyen
 */
public abstract class DongVat {
    private String ten;
    private double canNang;
    private String gioiTinh;

    public DongVat() {
    }

    public DongVat(String ten, double canNang, String gioiTinh) {
        this.ten = ten;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
    }
    
    public abstract String tiengKeu();
    
}
