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
public class XeNoiThanh extends ChuyenXe{
    public int soTuyen, soKmDiDuoc;
    public double DoanhThu;
    
    public XeNoiThanh(String msChuyen, String hoTenTaiXe, String soXe, int soTuyen, int soKmDiDuoc, double DoanhThu){
        super(msChuyen,hoTenTaiXe,soXe);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
        this.DoanhThu = DoanhThu;
    }
}