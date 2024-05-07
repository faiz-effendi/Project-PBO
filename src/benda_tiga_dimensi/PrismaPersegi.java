package benda_tiga_dimensi;

import benda_dua_dimensi.Persegi;

public class PrismaPersegi extends Persegi{
    public double volumePrismaPersegi, luasPermukaanPrismaPersegi, tinggi;
    
    public PrismaPersegi(double sisiPersegi, double tinggi){
        super(sisiPersegi);
        this.tinggi = tinggi;
    }
    
    public double hitungVolumePrismaPersegi(){
        volumePrismaPersegi = super.luasPersegi * tinggi;
        return volumePrismaPersegi;
    }
    
    public double hitungLuasPermukaanPrismaPersegi(){
        luasPermukaanPrismaPersegi = (super.luasPersegi*2) + ((super.sisi*tinggi)*4);
        return luasPermukaanPrismaPersegi;
    }
}