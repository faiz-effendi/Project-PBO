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
    
    public double hitungLuas(){
        luasSegitiga = (Math.sqrt(3) / 4) * Math.pow(sisi, 2);
        return luasSegitiga;
    }
    
    public double hitungKeliling(){
        kelilingSegitiga = sisi*3;
        return kelilingSegitiga;
    }
}