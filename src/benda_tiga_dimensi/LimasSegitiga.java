package benda_tiga_dimensi;
import benda_dua_dimensi.SegiTiga;

public class LimasSegitiga extends SegiTiga {
    public double volumeLimasSegitiga;
    public double luasPermukaanLimasSegitiga;
    
    public LimasSegitiga(double sisi){
        super(sisi);
        // hitungVolume();
        // hitungLuasPermukaan();
    }
    
    public double hitungVolumeLimasSegitiga(){
        volumeLimasSegitiga = super.luasSegitiga*super.sisi;
        return volumeLimasSegitiga;
    }
   
    public double hitungLuasPermukaanLimasSegitiga(){
        luasPermukaanLimasSegitiga = super.luasSegitiga*6;
        return luasPermukaanLimasSegitiga;
    }
}