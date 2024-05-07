package benda_tiga_dimensi;

import benda_dua_dimensi.PersegiPanjang;

public class LimasPersegiPanjang extends PersegiPanjang{
    public double volumeLimasPersegiPanjang, luasPermukaanLimasPersegiPanjang, tinggi;
    
    public LimasPersegiPanjang(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
        // hitungVolume();
        // hitungLuasPermukaan();
    }
    
    public double hitungVolumeLimasPersegiPanjang(){
        volumeLimasPersegiPanjang = (super.luasPersegiPanjang*tinggi)/3;
        return volumeLimasPersegiPanjang;
    }
    
    public double hitungLuasPermukaanLimasPersegiPanjang(){
        double setengahLebar = super.lebar/2;
        double setengahPanjang = super.panjang/2;
        luasPermukaanLimasPersegiPanjang = super.luasPersegiPanjang + (2*(super.panjang*Math.sqrt(Math.pow(tinggi, 2)+Math.pow(setengahLebar, 2)))) + (2*(super.lebar*Math.sqrt(Math.pow(tinggi, 2)+Math.pow(setengahPanjang, 2))));
        return luasPermukaanLimasPersegiPanjang;
    }
}