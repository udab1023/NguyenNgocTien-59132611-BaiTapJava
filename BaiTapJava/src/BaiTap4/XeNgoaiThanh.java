/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author ngoct
 */
public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDiDuoc;
    double DoanhThu;
    
    public XeNgoaiThanh(String msChuyen, String hoTenTaiXe, String soXe, String noiDen, int soNgayDiDuoc, double DoanhThu){
        super(msChuyen,hoTenTaiXe,soXe);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
        this.DoanhThu = DoanhThu;
    }
}
