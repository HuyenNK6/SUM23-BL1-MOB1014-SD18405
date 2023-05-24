/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6_arraylist;

/**
 *
 * @author Khanh Huyen
 */
/* * - id: int
 * - ten: string
 * - tuoi: int
 * - loai: string
 * - canNang: double
 * - gioiTinh: bool (true- đực, false- cái)
*/
public class ConMeo {
    //1. thuộc tính
    private int id;
    private String ten;
    private int tuoi;
    private String loai;
    private double canNang;
    private boolean gioiTinh;
    //2. constructor

    public ConMeo() {
    }

    public ConMeo(int id, String ten, int tuoi, String loai, double canNang, boolean gioiTinh) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.loai = loai;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
    }
    //3. Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    //4. InThongTin()

    @Override
    public String toString() {
        return "ConMeo{" + "id=" + id + ", ten=" + ten + ", tuoi=" + tuoi + ", loai=" + loai + ", canNang=" + canNang + ", gioiTinh=" + gioiTinh + '}';
    }
    public void inThongTin(){
        System.out.println("ConMeo{" + "id=" + id 
                + ", ten=" + ten + ", tuoi=" + tuoi 
                + ", loai=" + loai + ", canNang=" + canNang 
                + ", gioiTinh=" + getGioiTinh() + '}');
    }
    public String getGioiTinh(){
        if(gioiTinh){
            return "duc";
        }
        return "cai";
    }
}
