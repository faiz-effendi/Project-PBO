package benda_dua_dimensi;

public class Lingkaran implements BendaDuaDimensi{
    public double jari;
    public double luasLingkaran;
    public double kelilingLingkaran;
    
    public Lingkaran(double jari){
        this.jari = jari;
        hitungLuas();
        hitungKeliling();
    }
    
    public void hitungLuas(){
        luasLingkaran =Math.PI*jari*jari;
    }
    
    public void hitungKeliling(){
        kelilingLingkaran =Math.PI*jari*2;
    }
}
