package benda_tiga_dimensi;
import benda_dua_dimensi.Lingkaran;

public class Bola extends Lingkaran {
    public double volume, luasPermukaan;

    public Bola(double jari){
        super(jari);
        hitungVolume();
        hitungLuasPermukaan();
    }
    
    public void hitungVolume(){
        volume =  (4.0 / 3.0) * Math.PI * Math.pow(super.jari, 3);
    }

    public void hitungLuasPermukaan(){
        luasPermukaan = 4 * Math.PI * Math.pow(super.jari, 2);
    }
}