package benda_tiga_dimensi;
import benda_dua_dimensi.Lingkaran;

public class Kerucut extends Lingkaran {
    public double volume, luasPermukaan, tinggi;

    public Kerucut(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
        hitungvolume();
        hitungLuasPermukaan();
    }
    
    public void hitungvolume(){
        volume = (1.0/3.0) * Math.PI * Math.pow(jari, 2) * tinggi;
    }

    public void hitungLuasPermukaan(){
        luasPermukaan =  Math.PI*jari*(jari+Math.sqrt(Math.pow(jari, 2) + Math.pow(tinggi, 2)));
    }
}