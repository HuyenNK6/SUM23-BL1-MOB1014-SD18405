/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3_vong_lap;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class B2_Menu {
    public static void main(String[] args) {
        menu();
        System.out.println("To be continue....");
    }
    public static void menu(){
        Scanner sc= new Scanner(System.in);
        int chon;
        do {
            System.out.println("--------MENU-------");
            System.out.println("1. Goi ga mang cut");
            System.out.println("2. Lau ech mang cay");
            System.out.println("3. Oc huong sot trung muoi");
            System.out.println("4. Bun dau mam tom");
            System.out.println("0. Thoat CT");
            System.out.println("-------------------");
            System.out.println("Moi chon: ");
            chon = Integer.parseInt(sc.nextLine());
            //sw tab
            switch (chon) {
                case 1:
                    //System.out.println("1. Goi ga mang cut");
                    //break;
                case 2:
                    System.out.println("2. Lau ech mang cay");
                    break;
                case 3:
                    System.out.println("3. Oc huong sot trung muoi");
                    break;
                case 4:
                    System.out.println("4. Bun dau mam tom");
                    break;
                case 0:
                    System.out.println("0. Thoat CT");
                    System.exit(0);
                    //break;
                default:
                    System.out.println("Moi chon lai!!!!!!");
                    break;
            }
        } while (chon != 0);
    }
    public static void checkNgayTrongThang(){
        //sử dụng switch -case
        //in ra số ngày trong tháng
    }
    //nếu ai quan tâm:
    //nhập ngày hiện tại 
    //=> ngày hôm trước và ngày hôm sau
}
