package benda_dua_dimensi;

public class Lingkaran implements BendaDuaDimensi{
    public double jari;
    public double luasLingkaran;
    public double kelilingLingkaran;
    
    public Lingkaran(double jari){
        this.jari = jari;
    }
    
    public double hitungLuas(){
        luasLingkaran =Math.PI*jari*jari;
        return luasLingkaran;
    }
    
    public double hitungKeliling(){
        kelilingLingkaran =Math.PI*jari*2;
        return kelilingLingkaran;
    }
}
