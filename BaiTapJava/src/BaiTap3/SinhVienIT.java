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
    public String gethoTen(){
        return hoTen;
    }
    @Override
    public void sethoTen(String hoTen){
        this.hoTen=hoTen;
    }
    
    @Override
    public String getnghanh(){
        return nganh;
    }
    @Override
    public void setnghanh(String nghanh){
        this.nganh = nghanh;
    }
    
    public double getdiemJava(){
        return diemJava;
    }
    public void setdiemJava(double diemJava){
        this.diemJava = diemJava;
    }
            
    public double getdiemCss(){
        return diemCss;
    }
    public void setdiemCss(double diemCss){
        this.diemCss = diemCss;
    }
    
    public double getdiemHtml(){
        return diemHtml;
    }
    public void setdiemHtml(double diemHtml){
        this.diemHtml = diemHtml;
    }
            
    @Override
    public double getDiem(){
        return (2 * diemJava + diemHtml + diemCss)/4;
    }
}
