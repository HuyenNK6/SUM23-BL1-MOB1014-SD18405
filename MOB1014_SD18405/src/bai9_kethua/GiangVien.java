/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai9_kethua;

/**
 *
 * @author Khanh Huyen
 */
//LỚP CHA: Nguoi
//LỚP CON: GiangVien
//GV kế thừa từ Người = từ khóa extends
//Con có thể kế thừa tất cả thuộc tính và phương thức của Cha
//trừ constructor
public class GiangVien extends Nguoi{
    //bổ sung thêm thuộc tính riêng
    private String account;
    private String mailFE;
    //ctrl cách enter 3 lần

    public GiangVien() {
    }

    public GiangVien(String account, String mailFE) {
        this.account = account;
        this.mailFE = mailFE;
    }
    //this: biến tham chiếu tới đối tượng của lớp hiện tại
    //super: biến tham chiếu tới đối tượng của lớp cha
    public GiangVien(String account, String mailFE, String ten, int namSinh, int gioiTinh) {
        super(ten, namSinh, gioiTinh);
        this.account = account;
        this.mailFE = mailFE;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getMailFE() {
        return mailFE;
    }

    public void setMailFE(String mailFE) {
        this.mailFE = mailFE;
    }
    //override: ghi đè phương thức
    //click chuột phải -> Insert code 
    //-> Override Method -> tích chọn method -> inThongTin()

    @Override
    public String toString() {
        return "GiangVien{" + "account=" + account + ", mailFE=" + mailFE + '}';
    }
    
    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("GiangVien{" + "account=" + account + ", mailFE=" + mailFE + '}');
    }
    
}
