package benda_tiga_dimensi;
import benda_dua_dimensi.Persegi;

public class Kubus extends Persegi{
    public double volumeKubus;
    public double luasPermukaanKubus;
    
    public Kubus(double sisi){
        super(sisi);
        hitungVolume();
        hitungLuasPermukaan();
    }
    
    public void hitungVolume(){
        volumeKubus = super.luasPersegi*super.sisi;
    }
   
    public void hitungLuasPermukaan(){
        luasPermukaanKubus = super.luasPersegi*6;
    }
}