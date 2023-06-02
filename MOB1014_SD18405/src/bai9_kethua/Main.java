/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai9_kethua;

/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        //ctor có tham số
        GiangVien gv= new GiangVien("DungNA29", "dungna29@fe.edu.vn",
                            "Anh Dung", 2000, 1);
        gv.inThongTin();
        //ctor không tham số
        GiangVien gvFpt= new GiangVien();
        gvFpt.setAccount("MinhDQ8");
        gvFpt.setMailFE("minhdq8@fe.edu.vn");
        gvFpt.setTen("Quang Minh");
        gvFpt.setNamSinh(2001);
        gvFpt.setGioiTinh(1);
        gvFpt.inThongTin();
        
        Nguoi gvpoly= new GiangVien();
        Nguoi sv= new SinhVien();
        Nguoi nv= new NhanVien();
       
        
    }
}
