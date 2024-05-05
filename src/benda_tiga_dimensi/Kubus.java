package benda_tiga_dimensi;
import benda_dua_dimensi.Persegi;

public class Kubus extends Persegi{
    public float volumeKubus;
    public float luasPermukaanKubus;
    
    public Kubus(float sisi){
        super(sisi);
        // this.sisi= super.sisi;
        volumeKubus();
        luasPermukaanKubus();
    }
    
    public void volumeKubus(){
        volumeKubus = super.luasPersegi*super.sisi;
    }
   
    public void luasPermukaanKubus(){
        luasPermukaanKubus = super.luasPersegi*6;
    }
}
