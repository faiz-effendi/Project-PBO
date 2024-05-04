package benda_dua_dimensi;

public class Persegi implements BendaDuaDimensi{
    public float sisi;
    public float luas;
    public float keliling;
    
    public Persegi(float sisi){
        this.sisi = sisi;
        luas();
        keliling();
    }
    
    public void luas(){
        luas = sisi*sisi;
    }
    
    public void keliling(){
        keliling = sisi*4;
    }
}
