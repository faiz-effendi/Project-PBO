package benda_tiga_dimensi;
import benda_dua_dimensi.Lingkaran;

public class Tabung extends Lingkaran {
    public double volume, luasPermukaan, tinggi;

    public Tabung(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
        volume();
        luasPermukaan();
    }
    
    public void volume(){
        volume = super.luasLingkaran*tinggi;
    }

    public void luasPermukaan(){
        luasPermukaan = super.luasLingkaran*2+(super.kelilingLingkaran*tinggi);
    }
}
