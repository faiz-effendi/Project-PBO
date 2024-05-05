package benda_tiga_dimensi;

import benda_dua_dimensi.Persegi;
import java.lang.Math;

public class LimasPersegi extends Persegi{
    public double volumeLimasPersegi, luasPermukaanLimasPersegi, tinggi;
    
    public LimasPersegi(double sisi, double tinggi){
        super(sisi);
        this.tinggi = tinggi;
        volumeLimasPersegi();
        luasPermukaanLimasPersegi();
    }
    
    public void volumeLimasPersegi(){
        volumeLimasPersegi = (super.luasPersegi*tinggi)/3;
    }
    
    public void luasPermukaanLimasPersegi(){
        double setengahSisi = super.sisi/2;
        luasPermukaanLimasPersegi = super.luasPersegi + ((super.sisi * Math.sqrt(Math.pow(tinggi, 2) + Math.pow(setengahSisi, 2)) )/2)*4;
    }
   
}
