package benda_tiga_dimensi;
import benda_dua_dimensi.Lingkaran;

public class Kerucut extends Lingkaran {
    public double volumeKerucut, luasPermukaanKerucut, tinggi;

    public Kerucut(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
    }
    
    public double hitungvolumeKerucut(){
        volumeKerucut = (1.0/3.0) * Math.PI * Math.pow(jari, 2) * tinggi;
        return volumeKerucut;
    }

    public double hitungLuasPermukaanKerucut(){
        luasPermukaanKerucut =  Math.PI*jari*(jari+Math.sqrt(Math.pow(jari, 2) + Math.pow(tinggi, 2)));
        return luasPermukaanKerucut;
    }
}