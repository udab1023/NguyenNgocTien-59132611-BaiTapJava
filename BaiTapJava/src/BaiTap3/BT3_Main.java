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
public class BT3_Main {
    public static void main(String[] args){
          SinhVienIT s2 = new SinhVienIT(5.0,6.0,7.0,"Ngoc","IT");
          SinhVienBiz s3 = new SinhVienBiz(8.0,9.0,"Loan","Biz");
          System.out.println(s2.xuat());
          System.out.println(s3.xuat());
    }
}
