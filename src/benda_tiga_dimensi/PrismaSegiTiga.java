package benda_tiga_dimensi;

import benda_dua_dimensi.SegiTiga;

public class PrismaSegiTiga extends SegiTiga{
    public double volumePST, luasPermukaanPST, tinggi;
    
    public PrismaSegiTiga(double sisi, double tinggi){
        super(sisi);
        this.tinggi = tinggi;
        volumePST();
        luasPermukaanPST();
    }
    
    public void volumePST(){
        this.volumePST = super.luasSegitiga * tinggi;
    }
    
    public void luasPermukaanPST(){
        this.luasPermukaanPST = (super.luasSegitiga*2) + (super.sisi*tinggi*3);
    }
}
