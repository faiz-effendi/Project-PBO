package benda_dua_dimensi;

public class SegiTiga implements BendaDuaDimensi{
    public float sisi;
    public float luasSegitiga;
    public float kelilingSegitiga;
    
    public SegiTiga(float sisi){
        this.sisi = sisi;
        luas();
        keliling();
    }
    
    public void luas(){
        luasSegitiga = (float) ((Math.sqrt(3) / 4) * Math.pow(sisi, 2));
    }
    
    public void keliling(){
        kelilingSegitiga = sisi*3;
    }
}
