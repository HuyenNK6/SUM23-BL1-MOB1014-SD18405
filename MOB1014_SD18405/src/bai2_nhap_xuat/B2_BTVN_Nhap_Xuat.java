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
public class B2_BTVN_Nhap_Xuat {

    public static void main(String[] args) {
        /* BTVN:
        nhập và xuất thông tin về Trà sữa NYC thích:
        - hãng TS: string
        - vị: string
        - topping: string
        - giá: int
        - số lượng: int
        - size: char (S, M, L)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("======Nhap======");
        System.out.println("Nhap ten NYC: ");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi NYC: ");
//        int tuoi= sc.nextInt(); ///////////////
//        sc.nextLine(); //loại bỏ các ký tự thừa còn lại
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap hang TS: ");
        String hang = sc.nextLine();///////////////
        System.out.println("Nhap vi TS: ");
        String vi = sc.nextLine();
        System.out.println("Nhap topping: ");
        String top = sc.nextLine();
        System.out.println("Nhap gia: ");
        // int gia = Integer.parseInt(sc.nextLine());
        double gia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap size(S,M,L): ");
        //char size = sc.next().charAt(0);
        char size = sc.nextLine().charAt(0);
        //next(): đọc dữ liệu cho đến dấu cách đầu tiên
        //nextLine(): đọc cả dòng dữ liệu

        System.out.println("======Xuat======");
        System.out.println("Ten NYC: " + ten);
        System.out.println("Tuoi NYC= " + tuoi);
        System.out.println("Hang TS: " + hang);
        System.out.println("Vi TS: " + vi);
        System.out.println("Topping: " + top);
        System.out.println("Gia: " + gia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Size: " + size);
        
    }
}
