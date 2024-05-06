package benda_tiga_dimensi;

import benda_dua_dimensi.PersegiPanjang;

public class PrismaPersegiPanjang extends PersegiPanjang{
    public double volumePrismaPersegiPanjang, luasPermukaanPrismaPersegiPanjang, tinggi;
    
    public PrismaPersegiPanjang(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
        volumePrismaPersegiPanjang();
        luasPermukaanPrismaPersegiPanjang();
    };
    
    public void volumePrismaPersegiPanjang(){
        volumePrismaPersegiPanjang = super.luasPersegiPanjang*tinggi;
    }
    
    public void luasPermukaanPrismaPersegiPanjang(){
        luasPermukaanPrismaPersegiPanjang = (super.luasPersegiPanjang*2) + (super.lebar*tinggi*2) + (super.panjang*tinggi*2);
    }

}
