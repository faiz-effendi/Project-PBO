package benda_dua_dimensi;

public class Persegi implements BendaDuaDimensi{
    public float sisi;
    public float luasPersegi;
    public float kelilingPersegi;
    
    public Persegi(float sisi){
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