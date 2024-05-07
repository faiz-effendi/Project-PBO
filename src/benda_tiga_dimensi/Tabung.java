package benda_tiga_dimensi;
import benda_dua_dimensi.Lingkaran;

public class Tabung extends Lingkaran {
    public double volumeTabung, luasPermukaanTabung, tinggi;

    public Tabung(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
    }
    
    public double hitungVolumeTabung(){
        volumeTabung = super.luasLingkaran*tinggi;
        return volumeTabung;
    }

    public double hitungLuasPermukaanTabung(){
        luasPermukaanTabung = super.luasLingkaran*2+(super.kelilingLingkaran*tinggi);
        return luasPermukaanTabung;
    }
}