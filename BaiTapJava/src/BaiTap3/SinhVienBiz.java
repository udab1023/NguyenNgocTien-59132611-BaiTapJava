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
public class SinhVienBiz extends SinhVienPoly {
    public double diemMarketing,diemSales;
    
    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen, String nganh){
        super (hoTen,nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem(){
        return (2* diemMarketing + diemSales)/3;
    }
}
