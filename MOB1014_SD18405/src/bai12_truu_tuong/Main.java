/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12_truu_tuong;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HinhTron ht = new HinhTron();
        //try-catch -> dùng để bắt lỗi
        /* try{
                //câu lệnh có thể xảy ra lỗi
            }
        catch{
            //thông báo lỗi
        }
         */
        try {
            System.out.println("Nhap ban kinh: ");
            ht.setR(Double.parseDouble(sc.nextLine()));
        } catch (Exception e) {
//            Exception ex = new Exception("ERRORR!!!!!!!!!!!");
//            throw ex; //quăng lỗi
            System.out.println("Loi mat roi!!!!");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
        //try-catch-finally
    }
}
