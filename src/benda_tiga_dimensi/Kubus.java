package benda_tiga_dimensi;
import benda_dua_dimensi.Persegi;

public class Kubus extends Persegi{
    public float volume;
    
    public Kubus(float sisi){
        super(sisi);
        volume();
    }
    
    public void volume(){
        volume = super.luas*super.sisi;
    }
}
