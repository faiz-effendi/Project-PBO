package benda_tiga_dimensi;

import benda_dua_dimensi.Persegi;

public class PrismaPersegi extends Persegi{
    public double volumePrismaPersegi, luasPermukaanPrismaPersegi, tinggi;
    
    public PrismaPersegi(double sisiPersegi, double tinggi){
        super(sisiPersegi);
        this.tinggi = tinggi;
        volumePrismaPersegi();
        luasPermukaanPrismaPersegi();
    }
    
    public void volumePrismaPersegi(){
        volumePrismaPersegi = super.luasPersegi * tinggi;
    }
    
    public void luasPermukaanPrismaPersegi(){
        luasPermukaanPrismaPersegi = (super.luasPersegi*2) + ((super.sisi*tinggi)*4);
    }
}
