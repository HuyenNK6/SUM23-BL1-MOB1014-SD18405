/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4_mang;

import java.util.Arrays;

/**
 *
 * @author Khanh Huyen
 */
public class B1_Array {
    /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
   */
    public static void main(String[] args) {
        //1. khai báo mảng
        int[] arrSo;
        int arrSo1[];
        //2. khởi tạo mảng
        //khởi tạo 1 mảng số nguyên gồm 4 phần tử
        arrSo = new int[]{5,2,4,9};
         //khởi tạo 1 mảng điểm gồm 3 phần tử
        double[] arrDiem= new double[]{8.2, 7.4,9.6};
        //khởi tạo 1 mảng chuỗi có kích thước = 5
        String[] arrTen = new String[5];
        
        System.out.println("length= "+ arrTen.length);
        //3. Gán giá trị
        arrTen[0] = "Linh";
        arrTen[1] = "Thu";
        arrTen[2] = "Huyen";
        arrTen[3] = "Tra";
        arrTen[4] = "Xanh";
        //arrTen[5] = "Chi";
        
        //4. truy xuất phần tử
        System.out.println("arrDiem[1]= "+ arrDiem[1]);
        //5. duyệt mảng
        //cách 1: for i => for tab
        for (int i = 0; i < arrTen.length; i++) {
            System.out.println("arrTen["+i+"]= "+ arrTen[i]);
        }
        //cách 2: for each => fore tab
         /*
            Cách gõ: fore + tab

            Công thức:  
            for (String arg : args) {

                }
            String arg: Kiểu dữ liệu và tên biến, tên biến sẽ đại diện là 1 giá trị
            args: Là Collection hoặc là 1 Array
             */
        for (String ten : arrTen) {
            System.out.println(ten);
        }
        for (var ten : arrTen) {
            System.out.println(ten);
        }
        
        //////////////////
        System.out.println("Sort: sap xep tang dan");
        //{8.2, 7.4,9.6};
        Arrays.sort(arrDiem);
        for (double d : arrDiem) {
            System.out.println(d);
        }
        //reverse => ArrayList
        //{5,2,4,9};
        //binarySearch thuật toán tìm kiếm nhị phân
        // => phải sort trước khi tìm kiếm
        //index= 0 1 2 3  (vị trí)
        //value= 2 4 5 9  (giá trị)
        Arrays.sort(arrSo);
        int viTri= Arrays.binarySearch(arrSo, 2);
        System.out.println("vi tri= "+ viTri);
        
    }
}
