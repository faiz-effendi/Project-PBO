package benda_tiga_dimensi;
import benda_dua_dimensi.Lingkaran;

public class Tabung extends Lingkaran {
    public double volume, luasPermukaan, tinggi;

    public Tabung(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
        hitungVolume();
        hitungLuasPermukaan();
    }
    
    public void hitungVolume(){
        volume = super.luasLingkaran*tinggi;
    }

    public void hitungLuasPermukaan(){
        luasPermukaan = super.luasLingkaran*2+(super.kelilingLingkaran*tinggi);
    }
}