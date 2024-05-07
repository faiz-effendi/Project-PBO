package benda_dua_dimensi;

public class JajarGenjang implements BendaDuaDimensi{
    public double alas;
    public double tinggi;
    public double sisimiring;
    public double luasJajarGenjang;
    public double kelilingJajarGenjang;
    
    public JajarGenjang(double alas, double tinggi, double sisimiring){
        this.sisimiring = sisimiring;
        this.alas = alas;
        this.tinggi = tinggi;
        hitungLuas();
        hitungKeliling();
    }
    
    public void hitungLuas(){
        luasJajarGenjang = alas*tinggi;
    }
    
    public void hitungKeliling(){
        kelilingJajarGenjang = 2*(sisimiring+alas);
    }
}
