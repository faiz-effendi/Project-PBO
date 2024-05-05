package benda_dua_dimensi;

public class Persegi implements BendaDuaDimensi{
    public double sisi;
    public double luasPersegi;
    public double kelilingPersegi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
        luas();
        keliling();
    }
    
    public void luas(){
        luasPersegi = sisi*sisi;
    }
    
    public void keliling(){
        kelilingPersegi = sisi*4;
    }
}