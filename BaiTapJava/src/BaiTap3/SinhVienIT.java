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
    @Override
    public double getDiem(){
        return (2 * diemJava + diemHtml + diemCss)/4;
    }
    @Override
        public String xuat(){
        return hoTen+"\n"+nghanh+"\n"+diemJava+"\n"+diemCss+"\n"+diemHtml+"\n"+getHocLuc()+"\n";
    }
}
