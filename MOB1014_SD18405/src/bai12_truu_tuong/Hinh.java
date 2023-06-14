/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12_truu_tuong;

/**
 *
 * @author Khanh Huyen
 */
public abstract class Hinh {
    //vì lớp chứa phương thức trừu tượng 
    //=> lớp này trở thành lớp trừu tượng => abstract class
    private String ten;

    public Hinh() {
    }

    public Hinh(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    //đều có chu và diện tích ?
    //phương thức không có phần thân xử lý
    // => phương thức trừu tượng => abstract methods
    public abstract double tinhChuVi();
    
    public abstract double tinhDienTich();
    
}
