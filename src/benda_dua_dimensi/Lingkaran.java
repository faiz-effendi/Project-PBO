package benda_dua_dimensi;

public class Lingkaran implements BendaDuaDimensi{
    public double jari;
    public double luasLingkaran;
    public double kelilingLingkaran;
    
    public Lingkaran(double jari){
        this.jari = jari;
        luas();
        keliling();
    }
    
    public void luas(){
        luasLingkaran =(double) Math.PI*jari*jari;
    }
    
    public void keliling(){
        kelilingLingkaran = (double) Math.PI*jari*2;
    }
}
