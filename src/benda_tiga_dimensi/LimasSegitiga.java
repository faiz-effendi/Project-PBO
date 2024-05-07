package benda_tiga_dimensi;
import benda_dua_dimensi.SegiTiga;

public class LimasSegitiga extends SegiTiga {
    public double volumeLimasSegitiga;
    public double luasPermukaanLimasSegitiga;
    
    public LimasSegitiga(double sisi){
        super(sisi);
        hitungVolume();
        hitungLuasPermukaan();
    }
    
    public void hitungVolume(){
        volumeLimasSegitiga = super.luasSegitiga*super.sisi;
    }
   
    public void hitungLuasPermukaan(){
        luasPermukaanLimasSegitiga = super.luasSegitiga*6;
    }
}