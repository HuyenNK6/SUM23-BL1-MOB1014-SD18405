/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6_arraylist;

import java.util.ArrayList;

/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        ConMeo meo1= new ConMeo(1, "titi", 3, "vn", 5, true);
        ConMeo meo2= new ConMeo(2, "titi", 3, "vn", 5, false);
        ConMeo meo3= new ConMeo(3, "titi", 3, "vn", 5, false);
        ConMeo meo4= new ConMeo(4, "titi", 3, "vn", 5, true);
        ConMeo meo5= new ConMeo(5, "titi", 3, "vn", 5, true);
        
        //1. tạo list mèo
        ArrayList <ConMeo> lstMeo= new ArrayList<>();
        //2. thêm đối tượng vào list
        lstMeo.add(meo1);
        lstMeo.add(meo2);
        lstMeo.add(meo3);
        lstMeo.add(meo4);
        lstMeo.add(meo5);
        //3. truy xuất
        System.out.println(lstMeo.get(1));
        System.out.println(lstMeo.get(1).getTen());
        lstMeo.get(1).inThongTin();
        //4. duyệt list 
        //-> lstMeo.get(i): lấy ra đối tượng trong danh sách
        for (int i = 0; i < lstMeo.size(); i++) {
            lstMeo.get(i).inThongTin();
        }
        for (ConMeo conMeo : lstMeo) {
            conMeo.inThongTin();
        }
    }
}
/*BTVN
 * P1. Tạo class DieuHoa gồm các thuộc tính
 * - id: int
 * - hang: string
 * - congSuat: int
 * - gia: double
 * - xuatXu: string
 * => private tất cả thuộc tính, 
 * tạo constructor ko tham số và có tham số,
 * có đầy đủ Getter & Setter, tạo phương thức inThongTin()
 * 
 * tạo phương thức kiemTra(): boolean 
 * => kiểm tra nếu gia > 20,000,000 và công suất >=3000 trả về đúng, và ngược lại
 * 
 * bổ sung vào thêm phương thức inThongTin():
 * in ra "Hàng Chất Lượng Cao"
 * nếu kiemTra() trả về kết quả đúng

 * P2.
 * - tạo 4 đối tượng bằng ctor có tham số
 * - tạo 1 đối tượng bằng ctor không tham số -> nhập thông tin từ bàn phím
 * - tạo ArrayList<DieuHoa> chứa tất cả 5 đối tượng trên
 * - sau đó in thông tin ra màn hình 
 */