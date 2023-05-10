/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_khai_bao_bien;

/**
 *
 * @author Khanh Huyen
 */
public class B2_Ep_Kieu {

    /*
         * P1: Ép kiểu - Chuyển đổi từ kiểu dữ liệu số sang dạng số khác - Không đổ kiểu dữ liệu lớn về bé mà chỉ bé lên lớn ví dụ int lớn hơn byte hoặc long nhất trong số nguyên. Ngoài ra các bạn có thể tham khảo lại trong bảng kích thước kiểu dữ liệu.
         *
         * Công thức ép kiểu tường minh:
         *        (<kiểu dữ liệu>) <biến cần ép kiểu>;
         *
         * P2: Ép kiểu từ string về số
         *  
     */
    public static void main(String[] args) {
        //PHẦN 1: ép kiểu giữa các số
        //ép kiểu ngầm định
        int a = 10;
        double b = a;
        System.out.println("b= " + b);
        //ép kiểu tường minh
        double c = 7.4;
        int d = (int) c;
        System.out.println("d= " + d);

        //PHẦN 2: ép kiểu từ String về số
        String num1 = "4";
        String num2 = "6";
        String sum = num1 + num2;//cộng chuỗi
        System.out.println("sum= " + sum);
        //ép kiểu từ string về int
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int tong = n1 + n2;
        System.out.println("tong= " + tong);
        //ép kiểu từ string về double
        double so1= Double.parseDouble(num1);
        double so2= Double.parseDouble(num2);
        double result= so1+so2;
        System.out.println("result= "+ result);
        
        Integer i= 1;
        /* Lớp bao- Wrapper
        Đối vs mỗi kiểu dữ liệu nguyên thủy,
        => 1 lớp bao tương ứng
        int => Integer
        double => Double
        float => Float
        char => Character
        boolean => Boolean.....
        */
    }
}
