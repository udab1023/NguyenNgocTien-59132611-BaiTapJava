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
    @Override
    public double getDiem(){
        return (2* diemMarketing + diemSales)/3;
    }
    @Override
    public String xuat(){
    return hoTen+"\n"+nghanh+"\n"+diemMarketing+"\n"+diemSales+"\n"+getHocLuc()+"\n";
    }
}
