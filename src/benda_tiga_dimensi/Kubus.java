package benda_tiga_dimensi;
import benda_dua_dimensi.Persegi;

public class Kubus extends Persegi{
    public float volumeKubus;
    public float luasKubus;
    
    public Kubus(float sisi){
        super(sisi);
        volumeKubus();
    }
    
    public void volumeKubus(){
        volumeKubus = super.luasPersegi*super.sisi;
    }
   
}
