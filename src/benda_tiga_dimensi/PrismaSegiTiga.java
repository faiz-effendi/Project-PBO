package benda_tiga_dimensi;

import benda_dua_dimensi.SegiTiga;

public class PrismaSegiTiga extends SegiTiga{
    public double volumePrismaSegitiga, luasPermukaanPrismaSegitiga, tinggi;
    
    public PrismaSegiTiga(double sisiSegitiga, double tinggi){
        super(sisiSegitiga);
        this.tinggi = tinggi;
    }
    
    public double hitungVolumePrismaSegitiga(){
        volumePrismaSegitiga = super.luasSegitiga * tinggi;
        return volumePrismaSegitiga;
    }
    
    public double hitungLuasPermukaanPrismaSegitiga(){
        luasPermukaanPrismaSegitiga = (super.luasSegitiga*2) + (super.sisi*tinggi*3);
        return luasPermukaanPrismaSegitiga;
    }
}