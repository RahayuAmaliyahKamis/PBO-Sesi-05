
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class HitungBangunData {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Persegi Panjang");
        System.out.println("--- Isilah Pilihan ---");
        
        int pilihan = sc.nextInt();
        if(pilihan==1){
            System.out.println("Silahkan isi nilai sisi = ");
            int s = sc.nextInt();
            BujurSangkar bs = new BujurSangkar(s);
//            int luas = bs.hitungLuas();
//            int keliling = bs.hitungKeliling();
            
            System.out.println(bs);
//            System.out.println("Keliling Bujur Sangkar : " + keliling);
        }
        else if(pilihan==2){
            System.out.println("Silahkan Isi nilai Panjang = ");
            int p = sc.nextInt();
            
            System.out.println("Silahkan isi nilai lebar");
            int l = sc.nextInt();
            PersegiPanjang pp = new PersegiPanjang (p,l);
            System.out.println(pp);
        }
    }
    
}
