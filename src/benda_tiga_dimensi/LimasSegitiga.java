package benda_tiga_dimensi;
import benda_dua_dimensi.SegiTiga;

public class LimasSegitiga extends SegiTiga {
    public float volumeLimasSegitiga;
    public float luasPermukaanLimasSegitiga;
    
    public LimasSegitiga(float sisi){
        super(sisi);
        volumeLimasSegitiga();
        luasPermukaanLimasSegitiga();
    }
    
    public void volumeLimasSegitiga(){
        volumeLimasSegitiga = super.luasSegitiga*super.sisi;
    }
   
    public void luasPermukaanLimasSegitiga(){
        luasPermukaanLimasSegitiga = super.luasSegitiga*6;
    }
}
