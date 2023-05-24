/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5_oop_luyentap;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khởi tạo đối tượng 
        MayTinh mt1 = new MayTinh("xn12", "HP", 2022, 23, 1);
      
        MayTinh mtHP = new MayTinh();
        System.out.println("======Nhap thong tin======");
        System.out.println("Nhap ma: ");
        mtHP.setMa(sc.nextLine());
        System.out.println("Nhap hang: ");
        mtHP.setHang(sc.nextLine());
        System.out.println("Nhap nam san xuat: ");
        mtHP.setNamSX(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap inch: ");
        mtHP.setInch(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap trang thai: ");
        mtHP.setTrangThai(Integer.parseInt(sc.nextLine()));
        
        System.out.println("======Xuat thong tin======");
        mtHP.inThongTin();
        ////////////
        
        
    }
}
