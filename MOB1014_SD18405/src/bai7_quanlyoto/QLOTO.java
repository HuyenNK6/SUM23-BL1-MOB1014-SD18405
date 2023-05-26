/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7_quanlyoto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class QLOTO {

    //toàn cục
    ArrayList<Oto> _lstOto = new ArrayList<>();
    Oto _oto;
    Scanner _sc = new Scanner(System.in);

    public void nhapDS() {
        String tiepTuc;
        do {
            //1. khởi tạo đối tượng
            _oto = new Oto();
            //2. nhập thông tin đối tượng
            System.out.println("Nhap id= ");
            _oto.setId(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap hang= ");
            _oto.setHang(_sc.nextLine());
            System.out.println("Nhap gia= ");
            _oto.setGia(Double.parseDouble(_sc.nextLine()));
            System.out.println("Nhap nam sx= ");
            _oto.setNamSX(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap trang thai(1/2)= ");
            _oto.setTrangThai(Integer.parseInt(_sc.nextLine()));
            //3. thêm đối tượng vào danh sách
            _lstOto.add(_oto);
            //4. hỏi tiếp tục ko?
            System.out.println("Co muon tiep tuc ko (yes/no)? ");
            tiepTuc = _sc.nextLine();
        } while (tiepTuc.equals("yes"));
        //equals: so sánh 2 chuỗi vs nhau, có phân biệt chữ hoa thường
    }

    public void xuatDS() {
        //isEmpty(): kiểm tra danh sách có trống hay ko
        if(_lstOto.isEmpty()){
            System.out.println("Danh sach trong!!");
            return;
        }
        //fore tab
        for (Oto oto : _lstOto) {
            oto.inThongTin();
        }
    }
}
