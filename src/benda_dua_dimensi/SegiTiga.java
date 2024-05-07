package benda_dua_dimensi;

public class SegiTiga implements BendaDuaDimensi{
    public double sisi;
    public double luasSegitiga;
    public double kelilingSegitiga;
    
    public SegiTiga(double sisi){
        this.sisi = sisi;
        hitungLuas();
        hitungKeliling();
    }
    
    public void hitungLuas(){
        luasSegitiga = (Math.sqrt(3) / 4) * Math.pow(sisi, 2);
    }
    
    public void hitungKeliling(){
        kelilingSegitiga = sisi*3;
    }
}