/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author ngoct
 */
public class SinhVienIT extends SinhVienPoly {
    public double diemJava, diemCss, diemHtml;
    
    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh){
        super (hoTen,nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    
    @Override
    public double getDiem(){
        return (2 * diemJava + diemHtml + diemCss)/4;
    }
}
