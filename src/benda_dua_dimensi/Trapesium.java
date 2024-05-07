package benda_dua_dimensi;

public class Trapesium implements BendaDuaDimensi{
    public double sisiA;
    public double sisiB;
    public double tinggi;
    public double luasTrapesium;
    public double kelilingTrapesium;
    
    public Trapesium(double sisiA, double sisiB, double tinggi){
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.tinggi = tinggi;
        hitungLuas();
        hitungKeliling();
    }
    
    public void hitungLuas(){
        luasTrapesium = (sisiA + sisiB)/2 * tinggi;
    }
    
    public void hitungKeliling(){
        double sisimiring;
        sisimiring = Math.sqrt(Math.pow((sisiB-sisiA), 2) + Math.pow(tinggi, 2));
        kelilingTrapesium = 2*sisimiring + sisiA + sisiB;
    }
}
