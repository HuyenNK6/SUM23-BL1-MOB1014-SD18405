/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11_qly_sach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class SachService {

    ArrayList<Sach> _lstSachs = new ArrayList<>();
    Sach _sach;
    Scanner _sc = new Scanner(System.in);

    public SachService() {
        _lstSachs.add(new Sach("S00001", "Hat giong tam hon", "Self-help", 2019, 90000));
        _lstSachs.add(new Sach("S00002", "Phan tich ky thuat", "Khoa hoc", 2021, 120000));
        _lstSachs.add(new Sach("S00003", "The Discoverers", "Khoa hoc", 2015, 150000));
        _lstSachs.add(new Sach("S00004", "Rua va tho", "Truyen", 2010, 50000));
        _lstSachs.add(new Sach("S00005", "Vu tru", "Khoa hoc", 2023, 80000));
        _lstSachs.add(new Sach("S00006", "Dac nhan tam", "Self-help", 2022, 100000));
    }

    public String kiemTraDauVao(String msg, String regex) {
        String input;
        do {
            System.out.println("Nhap " + msg + ": ");
            input = _sc.nextLine();
            if (!input.matches(regex)) {
                System.out.println("Moi nhap lai!!");
            }
        } while (!input.matches(regex));
        return input;
    }

    public void nhapDS() {
        String tiepTuc;
        do {
            //1. khởi tạo đt
            _sach = new Sach();
            //2. nhập tt
            //code chỉ được là số hoặc chữ và gồm 6 ký tự -> nếu sai nhập lại
//            System.out.println("Nhap code: ");
//            _sach.setCode(_sc.nextLine());
            _sach.setCode(kiemTraDauVao("code", "^[a-zA-Z0-9]{6}$"));
            System.out.println("Nhap ten: ");
            _sach.setTen(_sc.nextLine());
            System.out.println("Nhap the loai: ");
            _sach.setTheLoai(_sc.nextLine());
            System.out.println("Nhap nam xuat ban: ");
            _sach.setNamXuatBan(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap gia: ");
            _sach.setGia(Double.parseDouble(_sc.nextLine()));
            //3. thêm đối tượng ds
            _lstSachs.add(_sach);
            //4. hỏi tiếp tục
            System.out.println("Co muon tiep tuc ko? ");
            tiepTuc = _sc.nextLine();
        } while (tiepTuc.equals("co"));
    }

    public void xuatDS() {
        if (_lstSachs.isEmpty()) {
            System.out.println("Danh sach trong!!");
            return;
        }
        for (Sach s : _lstSachs) {
            s.inThongTin();
        }
    }

//    3. Xuất danh sách Sách có giá trong khoảng người dùng nhập
//    4. Sắp xếp giảm dần theo năm xuất bản
//    5. Tìm kiếm sách theo Code => equals SACH001 => SACH00111 => trả về đối tượng
//    6. Xóa Sách theo code
//    7. Sắp xếp tăng dần theo tên
//    8. Sắp xếp giảm dần theo giá
//    9. Xuất danh sách các Sach được xuất bản sau năm 2000
//    10. Tìm tất cả Sách có thể loại chính xác là Sách khoa học => equals 
//    11. Tìm tất cả Sách có tên gần đúng (tên chứa) được nhập từ bàn phím
    public void dsSachTheoTenGanDung() {
        //danh sách nhiều
        System.out.println("Nhap ten can tim: ");
        String input = _sc.nextLine();
        int count = 0;
        for (int i = 0; i < _lstSachs.size(); i++) {
            if (_lstSachs.get(i).getTen().contains(input)) {
                _lstSachs.get(i).inThongTin();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay!!!!!");
        }
    }
//    12. Xuất thông tin của Sách có giá lớn nhất và bé nhất
//    13. Đếm xem có tất cả bao nhiêu Sách có giá ngoài khoảng người dùng nhập
    //nếu làm void thì ko sao cả

    public int demGiaNgoaiKhoang() {
        int dem = 0;
        System.out.println("Nhap gia min= ");
        double min = Double.parseDouble(_sc.nextLine());
        System.out.println("Nhap gia max= ");
        double max = Double.parseDouble(_sc.nextLine());
        for (int i = 0; i < _lstSachs.size(); i++) {
            if (_lstSachs.get(i).getGia() < min
                    || _lstSachs.get(i).getGia() > max) {
                _lstSachs.get(i).inThongTin();
                dem++;
            }
        }
        /// kiểm tra đếm.....thông báo
        return dem;
    }

//    14. Tìm tất cả sách có mã bắt đầu bằng "SGK" => startwith
    public ArrayList<Sach> getDSTheoMaBatDau() {
        ArrayList <Sach> list= new ArrayList<>();
        for (int i = 0; i < _lstSachs.size(); i++) {
            if (_lstSachs.get(i).getCode().startsWith("SGK")) {
               //thêm đối tượng Sách vào trong list nếu bđ bằng SGK
               list.add(_lstSachs.get(i));
            }
        }
       return list;
    }
    public void inDSTheoMaBatDau(){
        ArrayList <Sach> listResult= getDSTheoMaBatDau();
        if(listResult.isEmpty()){
            System.out.println("Khong tim thay sach co ma bdau bang SGK!!");
            return;
        }
        System.out.println("DS Sach co ma bd bang SGK:");
        for (Sach sach : listResult) {
            sach.inThongTin();
        }
    }
    
}
