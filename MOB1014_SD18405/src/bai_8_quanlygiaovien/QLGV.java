/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_8_quanlygiaovien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class QLGV {
    ArrayList<GiaoVien> _lstGV = new ArrayList<>();
    GiaoVien _gv;
    Scanner _sc= new Scanner(System.in);
    public void nhapDS(){
        String tiepTuc;
        do {
            _gv= new GiaoVien();
            System.out.println("Nhap id= ");
            _gv.setId(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap ten= ");
            _gv.setTen(_sc.nextLine());
            System.out.println("Nhap so gio day= ");
            _gv.setSoGioDay(Double.parseDouble(_sc.nextLine()));
            _lstGV.add(_gv);
            System.out.println("Co tiep tuc k? (co/ko) ");
            tiepTuc= _sc.nextLine();
        } while (tiepTuc.equals("co"));
    }
    
    public void xuatDS(){
        for (GiaoVien giaoVien : _lstGV) {
            giaoVien.inThongTin();
        }
    }
    
    public void timKiemTheoId(){
        System.out.println("Nhap ID can tim: ");
        int id = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < _lstGV.size(); i++) {
            //tìm kiếm
            //_lstGV.get(i):  đối tượng GV tại vị trí i
            //_lstGV.get(i).getId(): lấy ra ID của đối tượng GV đó
            if(_lstGV.get(i).getId() == id){
                _lstGV.get(i).inThongTin();//1 kết quả 
                return;//tìm thấy và thoát luôn
            }
        }
        System.out.println("Khong tim thay!!!!");
    }
    public void timKiemTheoKhoang(){
        
    }
    public void xoa(){
        
    }
    public void sua(){
        
    }
    public void sapXep(){
        
    }
}
