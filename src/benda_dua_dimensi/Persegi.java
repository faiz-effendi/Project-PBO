package benda_dua_dimensi;

public class Persegi implements BendaDuaDimensi{
    public double sisi;
    public double luasPersegi;
    public double kelilingPersegi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
        hitungLuas();
        hitungKeliling();
    }
    
    public void hitungLuas(){
        luasPersegi = sisi*sisi;
    }
    
    public void hitungKeliling(){
        kelilingPersegi = sisi*4;
    }
}
