/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8_quanlygiaovien;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc= new Scanner(System.in);
        QLGV ql= new QLGV();
        int chon;
        do {
            System.out.println("-------MENU----------");
            System.out.println("1. Nhap DS");
            System.out.println("2. Xuat DS");
            System.out.println("3. Tim kiem theo id");
            System.out.println("4. Tim kiem theo khoang");
            System.out.println("5. Xoa");
            System.out.println("6. Sua");
            System.out.println("7. Sap xep");
            System.out.println("8. Ke thua");
            System.out.println("0. Thoat CT");
            System.out.println("---------------------");
            System.out.println("-----Moi chon:");
            chon= Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    ql.nhapDS();
                    break;
                case 2:
                    ql.xuatDS();
                    break;
                case 3:
                    ql.timKiemTheoId();
                    break;
                case 4:
                    ql.timKiemTheoKhoang();
                    break;
                case 5:
                    ql.xoa();
                    break;
                case 6:
                    ql.sua();
                    break;
                case 7:
                    ql.sapXep();
                    break;
                case 8:
                    ql.keThua();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap lai!!!!!!");
            }
        } while (chon!=0);
    }
}
