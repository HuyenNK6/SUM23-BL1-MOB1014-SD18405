/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5_oop;

/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        //1. khai báo đối tượng
        SinhVien sv;
        //2. khởi tạo đối tượng
        sv = new SinhVien();
        //2.1 constructor ko tham số
        SinhVien svPoly = new SinhVien();
        //2.2 constructor có tham số
        SinhVien svFPT= new SinhVien("PH12345", "Linh", 2004, 9, 1);
        
        //3. gán giá trị cho svPoly => Setter
        svPoly.setMsv("PH56789");
        svPoly.setTen("Quang");
        svPoly.setNamSinh(2000);
        svPoly.setDiem(10);
        svPoly.setGioiTinh(0);
        
        svFPT.setDiem(5);
        
        System.out.println("Xin chao "+ svPoly.getTen());
        
        //4. gọi phương thức inThongTin()
        svFPT.inThongTin();
        svPoly.inThongTin();
        /////////
        SinhVien svNEU= new SinhVien();
        //nhập tất cả thông tin từ bàn phím
        //in thông tin
        
    }
}
/* BTVN
 * 
 * 1. Tạo class MayTinh gồm các thuộc tính
 * - ma: string
 * - hang: string
 * - namSX: int
 * - inch: double
 * - trangThai: int (1- mới, 2- cũ)
 * 2. Tạo class ConMeo gồm các thuộc tính
 * - id: int
 * - ten: string
 * - tuoi: int
 * - loai: string
 * - canNang: double
 * - gioiTinh: bool (true- đực, false- cái)
 * 
 * Đối với mỗi class, thực hiện các yêu cầu sau
 * => private tất cả thuộc tính, 
 * tạo constructor ko tham số và có tham số,
 * có đầy đủ Getter & Setter, tạo phương thức inThongTin()
 * => sang Main(): 
 * - tạo 2 đối tượng bằng ctor có tham số 
 * - tạo 1 đối tượng bằng ctor không tham số 
 * và nhập thông tin từ bàn phím cho đối tượng đó
 * - in toàn bộ thông tin ra màn hình bằng phương thức inThongTin()
 *
*/