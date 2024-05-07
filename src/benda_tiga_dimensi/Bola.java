package benda_tiga_dimensi;
import benda_dua_dimensi.Lingkaran;

public class Bola extends Lingkaran {
    public double volumeBola, luasPermukaanBola;

    public Bola(double jari){
        super(jari);
    }
    
    public double hitungVolumeBola(){
        volumeBola =  (4.0 / 3.0) * Math.PI * Math.pow(super.jari, 3);
        return volumeBola;
    }

    public double hitungLuasPermukaanBola(){
        luasPermukaanBola = 4 * Math.PI * Math.pow(super.jari, 2);
        return luasPermukaanBola;
    }
}