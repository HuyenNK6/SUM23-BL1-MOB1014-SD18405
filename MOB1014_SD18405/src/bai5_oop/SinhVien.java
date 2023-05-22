/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5_oop;

/**
 *
 * @author Khanh Huyen
 */
public class SinhVien {

    //1. thuộc tính
    //phải private tất cả thuộc tính
    //-> t/c đóng gói
    private String msv;
    private String ten;
    private int namSinh;
    private double diem;
    private int gioiTinh; //0-nam, 1-nu

    //2. constructor - hàm tạo => tạo đối tượng
    //Cách 1: Click chuột phải -> Insert Code -> Constructor
    //- bỏ trống -> Generate
    //- Select All -> Geneate
    //Cách 2: ctrl + cách + enter (x2 lần)
    //2.1 ctor ko tham số
    public SinhVien() {
        System.out.println("Day la Sinh Vien");
        namSinh = 2004; //tạo giá trị mặc đinh
    }

    //2.2 ctor có tham số
    //this: biến tham chiếu tới đối tượng của lớp hiện tại
    public SinhVien(String msv, String ten, int namSinh, double diem, int gioiTinh) {
        this.msv = msv;
        this.ten = ten;
        this.namSinh = namSinh;
        this.diem = diem;
        this.gioiTinh = gioiTinh;
    }

    //3. Getter - setter
    //vì thuộc tính bị private
    //Click chuột phải -> Insert Code 
    //-> Getter & Setter -> Select All-> Generate
    
    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    //4. Phương thức inThongTin()
    //toString()
    // Click chuột phải -> Insert Code -> toString() -> Generate

    @Override
    public String toString() {
        return "SinhVien{" + "msv=" + msv + ", ten=" + ten + ", namSinh=" + namSinh + ", diem=" + diem + ", gioiTinh=" + gioiTinh + '}';
    }
    
    public void inThongTin(){
        //sout tab
        System.out.println("SinhVien{" + "msv=" + msv + ", ten=" + ten + ", namSinh=" + namSinh + ", diem=" + diem + ", gioiTinh=" + gioiTinh + '}');
    }
    
}
