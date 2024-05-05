package benda_dua_dimensi;

public class Lingkaran implements BendaDuaDimensi{
    public float jari;
    public float luasLingkaran;
    public float kelilingLingkaran;
    
    public Lingkaran(float jari){
        this.jari = jari;
        luas();
        keliling();
    }
    
    public void luas(){
        luasLingkaran =(float) Math.PI*jari*jari;
    }
    
    public void keliling(){
        kelilingLingkaran = (float) Math.PI*jari*2;
    }
}
