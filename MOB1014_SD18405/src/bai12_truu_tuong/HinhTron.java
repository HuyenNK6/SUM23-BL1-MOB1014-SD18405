/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12_truu_tuong;

/**
 *
 * @author Khanh Huyen
 */
public class HinhTron extends Hinh{
    private double r;

    public HinhTron() {
    }

    public HinhTron(double r) {
        this.r = r;
    }

    public HinhTron(double r, String ten) {
        super(ten);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
//bắt lớp con phải thực hiện lại các phương thức trừu tượng của lớp cha trừu tượng
    @Override
    public double tinhChuVi() {
        return 2*3.14*r;
    }

    @Override
    public double tinhDienTich() {
       return 3.14*r*r;
    }
    
}
