/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_nhap_xuat;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class B1_Nhap_Xuat {

    public static void main(String[] args) {
        //Lớp Scanner: 
        //lớp hỗ trợ việc nhập xuất dữ liệu từ bàn phím
        //khởi tạo đối tượng sc từ lớp Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("======Nhap======");
        System.out.println("Nhap ten NYC: ");
        //sc.nextLine(): đọc 1 dòng dữ liệu từ bàn phím
        String ten = sc.nextLine();
        //sc.next(): đọc đến dấu cách đầu tiên
        //String ten= sc.next();

        System.out.println("Nhap tuoi NYC:");
        //cách 1:
        //int tuoi= sc.nextInt();
        //cách 2:
        int tuoi = Integer.parseInt(sc.nextLine());

        System.out.println("======Xuat======");
        System.out.println("Ten NYC: " + ten);
        System.out.println("Tuoi NYC: " + tuoi);
    }
}
/* BTVN:
nhập và xuất thông tin về Trà sữa NYC thích:
- hãng TS: string
- vị: string
- topping: string
- giá: int
- số lượng: int
- size: char (S, M, L)

*/
