package benda_dua_dimensi;

public class Persegi implements BendaDuaDimensi{
    public double sisi;
    public double luasPersegi;
    public double kelilingPersegi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
        // hitungLuas();
    }
    
    public double hitungLuas(){
        luasPersegi = sisi*sisi;
        return luasPersegi;
    }
    
    public double hitungKeliling(){
        kelilingPersegi = sisi*4;
        return luasPersegi;
    }
}
