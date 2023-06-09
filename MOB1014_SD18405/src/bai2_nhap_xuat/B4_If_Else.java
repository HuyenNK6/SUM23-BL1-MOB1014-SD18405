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
public class B4_If_Else {
     /*
	* 1. CẤU TRÚC IF
	*	if (điều kiện){
	*		//thực hiện công việc
	*	}
	* 2. CẤU TRÚC IF-ELSE
	*	if (điều kiện){
	*		//thực hiện công việc 1
	*	}else{
	*		//thực hiện công việc 2
	*	}
	* 3. CẤU TRÚC IF-ELSE IF
	*	if (điều kiện 1){
	*		//thực hiện công việc 1
	*	}else if(điều kiện 2){
	*		//thực hiện công việc 2
	*	}else if(điều kiện 3){
	*		//thực hiện công việc 3
	*	}else{
	* 		//thực hiện công việc n
	*	}
	*/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //sout  tab
        System.out.println("Nhap so tien ban co: ");
        int tien= Integer.parseInt(sc.nextLine());
        //>=15: roll royce
        //10-15: may bach
        //5-10: porsche
        //còn lại: kia morning
        
        if (tien >= 15 ){
            System.out.println("Mua roll royce");
        }else if (tien >= 10){
            System.out.println("Mua may bach");
        }else if (tien >= 5){
            System.out.println("Mua porsche");
        }else{
            System.out.println("Mua kia morning");
        }  
        
        System.out.println("Nhap gioi tinh: ");
        int gioiTinh = Integer.parseInt(sc.nextLine());
        System.out.println("Gioi tinh: "+ (gioiTinh == 1 ? "Duc": "Cai"));
    }
}
/* 
 * Nhập xuất thông tin của Con Chó
 * - id : int
 * - tên: string
 * - cân nặng: double
 * - loài: string
 * - giới tính: int (1- đực/2- cái)
 * Đánh giá cân nặng:
 * nếu cân nặng >= 20 => béo phì
 * nếu cân nặng 10-20 => chó đẹp dáng xinh
 * nếu cân nặng 5-10 => cần tăng cân
 * còn lại => suy dinh dưỡng
*/
