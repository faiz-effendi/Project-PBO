package benda_tiga_dimensi;

import benda_dua_dimensi.Persegi;

public class LimasPersegi extends Persegi{
    public double volumeLimasPersegi, luasPermukaanLimasPersegi, tinggiPersegi;
    
    public LimasPersegi(double sisiPersegi, double tinggi){
        super(sisiPersegi);
        this.tinggiPersegi = tinggi;
    }
    
    public double hitungVolumeLimasPersegi(){
        volumeLimasPersegi = (super.luasPersegi*tinggiPersegi)/3;
        return volumeLimasPersegi;
    }
    
    public double hitungLuasPermukaanLimasPersegi(){
        double setengahSisi = super.sisi/2;
        luasPermukaanLimasPersegi = super.luasPersegi + ((super.sisi * Math.sqrt(Math.pow(tinggiPersegi, 2) + Math.pow(setengahSisi, 2)) )/2)*4;
        return luasPermukaanLimasPersegi;
    }

   
}