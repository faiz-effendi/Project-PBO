package benda_tiga_dimensi;

import benda_dua_dimensi.PersegiPanjang;
import java.lang.Math;

public class LimasPersegiPanjang extends PersegiPanjang{
    public double volumeLimasPersegiPanjang, luasPermukaanLimasPersegiPanjang, tinggi;
    
    public LimasPersegiPanjang(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
        volumeLimasPersegiPanjang();
        luasPermukaanLimasPersegiPanjang();
    }
    
    public void volumeLimasPersegiPanjang(){
        volumeLimasPersegiPanjang = (super.luasPersegiPanjang*tinggi)/3;
    }
    
    public void luasPermukaanLimasPersegiPanjang(){
        double setengahLebar = super.lebar/2;
        double setengahPanjang = super.panjang/2;
        luasPermukaanLimasPersegiPanjang = super.luasPersegiPanjang + (2*(super.panjang*Math.sqrt(Math.pow(tinggi, 2)+Math.pow(setengahLebar, 2)))) + (2*(super.lebar*Math.sqrt(Math.pow(tinggi, 2)+Math.pow(setengahPanjang, 2))));
    }
}
