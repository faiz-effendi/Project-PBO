package benda_tiga_dimensi;
import benda_dua_dimensi.Persegi;

public class Kubus extends Persegi{
    public double volumeKubus;
    public double luasPermukaanKubus;
    
    public Kubus(double sisi){
        super(sisi);
    }
    
    public double hitungVolumeKubus(){
        volumeKubus = super.luasPersegi*super.sisi;
        return volumeKubus;
    }
   
    public double hitungLuasPermukaanKubus(){
        luasPermukaanKubus = super.luasPersegi*6;
        return volumeKubus;
    }
}