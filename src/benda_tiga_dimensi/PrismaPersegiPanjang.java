package benda_tiga_dimensi;

import benda_dua_dimensi.PersegiPanjang;

public class PrismaPersegiPanjang extends PersegiPanjang{
    public double volumePrismaPersegiPanjang, luasPermukaanPrismaPersegiPanjang, tinggi;
    
    public PrismaPersegiPanjang(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
        // hitungVolume();
        // hitungLuasPermukaan();
    };
    
    public double hitungVolumePrismaPersegiPanjang(){
        volumePrismaPersegiPanjang = super.luasPersegiPanjang*tinggi;
        return volumePrismaPersegiPanjang;
    }
    
    public double hitungLuasPermukaanPrismaPersegiPanjang(){
        luasPermukaanPrismaPersegiPanjang = (super.luasPersegiPanjang*2) + (super.lebar*tinggi*2) + (super.panjang*tinggi*2);
        return luasPermukaanPrismaPersegiPanjang;
    }

}