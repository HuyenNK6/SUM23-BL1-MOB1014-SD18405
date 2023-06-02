/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8_quanlygiaovien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class QLGV {
    ArrayList<GiaoVien> _lstGV = new ArrayList<>();
    GiaoVien _gv;
    Scanner _sc= new Scanner(System.in);
    
    //fake Data - ko có điểm
    //ctrl cách enter

    public QLGV() {
        _lstGV.add(new GiaoVien(1, "Dung", 42));
        _lstGV.add(new GiaoVien(2, "Tien", 30));
        _lstGV.add(new GiaoVien(3, "Khanh", 50));
        _lstGV.add(new GiaoVien(4, "Linh", 24));
        _lstGV.add(new GiaoVien(5, "Phong", 36));
    }
    
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
        System.out.println("Nhap so gio day min: ");
        double min = Double.parseDouble(_sc.nextLine());
        System.out.println("Nhap so gio day max: ");
        double max = Double.parseDouble(_sc.nextLine());
        int count = 0;
        for (int i = 0; i < _lstGV.size(); i++) {
            if(_lstGV.get(i).getSoGioDay() >= min &&
                    _lstGV.get(i).getSoGioDay() <= max){
                _lstGV.get(i).inThongTin();
                count++;//tìm thấy thì tăng count 1 đơn vị
            }
        }
        if(count==0){
            System.out.println("Khong tim thay!!!");
        }else{
            System.out.println("So GV co so gio day thoa man: "+ count);
        }
    }
    public void xoa(){
        System.out.println("Nhap ID can xoa: ");
        int id = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < _lstGV.size(); i++) {
            if(_lstGV.get(i).getId() == id){
                _lstGV.get(i).inThongTin();//1 kết quả 
                ///xóa đối tượng GV tại vị trí i
                _lstGV.remove(i);
                System.out.println("Xoa thanh cong!!!!");
                return;//tìm thấy và thoát luôn
            }
        }
//        for (GiaoVien gv : _lstGV) {
//            if(gv.getId() == id){
//                _lstGV.remove(gv);
//                return;
//            }
//        }
        System.out.println("Khong tim thay!!!!");
    }
    public void sua(){
        //sửa số giờ dạy
         System.out.println("Nhap ID can sua thong tin: ");
        int id = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < _lstGV.size(); i++) {
           if(_lstGV.get(i).getId() == id){
               //trước
                _lstGV.get(i).inThongTin();
                System.out.println("Nhap so gio day moi:");
                double gioMoi= Double.parseDouble(_sc.nextLine());
                _lstGV.get(i).setSoGioDay(gioMoi);
                //sau
                System.out.println("Sua thanh cong!!!");
                _lstGV.get(i).inThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay!!!!");
    }
    public void sapXep(){
        //Collections.sort(_lstGV);
        //Collections.sort(_lstGV, (a,b) -> (int)(a.getId()- b.getId()));
        Collections.sort(_lstGV, new Comparator<GiaoVien>() {
            @Override
            public int compare(GiaoVien o1, GiaoVien o2) {
                return -o1.getTen().compareTo(o2.getTen());
                //return o1.getTen().compareTo(o2.getTen());
                //return -Double.compare(o1.getSoGioDay(), o2.getSoGioDay());
                //return Double.compare(o1.getSoGioDay(), o2.getSoGioDay());
                //return o1.getSoGioDay() > o2.getSoGioDay() ? 1:-1;
            }
        });
        xuatDS();
    }
    
    public void keThua(){
        GiaoVienPoly gv = new GiaoVienPoly("PTPM", 6, "Huyennk6", 30);
        gv.inThongTin();
    }
}
