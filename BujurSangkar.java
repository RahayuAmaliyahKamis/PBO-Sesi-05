/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class BujurSangkar extends BangunData {
    BujurSangkar (int s){
        super(s);
    }
    
    int hitungLuas (){
        int s = super.getS();
        return s*s;
    }
    
    int hitungKeliling(){
        int s = super.getS();
        return 4*s;
    }
    public String toString(){
        String hasil = " Luas BujurSangkar :"+ hitungLuas()+ "\n"+ "Keliling Bujur Sangkar :" + hitungKeliling();
        return hasil;
    }
}
