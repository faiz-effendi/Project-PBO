package benda_dua_dimensi;

public class SegiTiga implements BendaDuaDimensi{
    public double sisi;
    public double luasSegitiga;
    public double kelilingSegitiga;
    
    public SegiTiga(double sisi){
        this.sisi = sisi;
        luas();
        keliling();
    }
    
    public void luas(){
        luasSegitiga = (Math.sqrt(3) / 4) * Math.pow(sisi, 2);
    }
    
    public void keliling(){
        kelilingSegitiga = sisi*3;
    }
}