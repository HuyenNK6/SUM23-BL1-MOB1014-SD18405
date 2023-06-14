/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12_truu_tuong;

/**
 *
 * @author Khanh Huyen
 */
public class ConCho extends DongVat{
    private String loai;

    public ConCho() {
    }

    public ConCho(String loai) {
        this.loai = loai;
    }

    public ConCho(String loai, String ten, double canNang, String gioiTinh) {
        super(ten, canNang, gioiTinh);
        this.loai = loai;
    }

    @Override
    public String tiengKeu() {
        return "mewmew";
    }
    
    
    
}
