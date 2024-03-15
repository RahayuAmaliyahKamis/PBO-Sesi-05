/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class BangunData {
    int p, l, s;
    BangunData(int s){
        this.s =s;
    }
    
    BangunData (int p,  int l){
        this.p = p;
        this.l = l;
    }
    
    void setPL (int p, int l){
        this.p = p;
        this.l = l;
    }
    
    void setSisi (int s){
        this.s = s;
    }
    
    int getP(){
        return p;
    }

    int getS() {
        return s;
    }
    
    int getL(){
        return l;
    }
}
