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
    
    public XeNoiThanh(String msChuyen, String hoTenTaiXe, String soXe, double DoanhThu, int soTuyen, int soKmDiDuoc){
        super(msChuyen,hoTenTaiXe,soXe,DoanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
    public int getsoTuyen(){
        return soTuyen;
    }
    public void setsoTuyen(int soTuyen){
        this.soTuyen = soTuyen;
    }
    
    public int getsoKmDiDuoc(){
        return soKmDiDuoc;
    }
    public void setsoKmDiDuoc(int soKmDiDuoc){
        this.soKmDiDuoc = soKmDiDuoc;
    }
}
