package benda_tiga_dimensi;

import benda_dua_dimensi.Persegi;
import java.lang.Math;

public class LimasPersegi extends Persegi{
    public double volumeLimasPersegi, luasPermukaanLimasPersegi, tinggi;
    
    public LimasPersegi(double sisiPersegi, double tinggi){
        super(sisiPersegi);
        this.tinggi = tinggi;
        hitungVolume();
        hitungLuasPermukaan();
    }
    
    public void hitungVolume(){
        volumeLimasPersegi = (super.luasPersegi*tinggi)/3;
    }
    
    public void hitungLuasPermukaan(){
        double setengahSisi = super.sisi/2;
        luasPermukaanLimasPersegi = super.luasPersegi + ((super.sisi * Math.sqrt(Math.pow(tinggi, 2) + Math.pow(setengahSisi, 2)) )/2)*4;
    }
   
}