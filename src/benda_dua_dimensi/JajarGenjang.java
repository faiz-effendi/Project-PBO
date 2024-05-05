package benda_dua_dimensi;

public class JajarGenjang implements BendaDuaDimensi{
    public float alas;
    public float tinggi;
    public float sisimiring;
    public float luasJajarGenjang;
    public float kelilingJajarGenjang;
    
    public JajarGenjang(float alas, float tinggi, float sisimiring){
        this.sisimiring = sisimiring;
        this.alas = alas;
        this.tinggi = tinggi;
        luas();
        keliling();
    }
    
    public void luas(){
        luasJajarGenjang = alas*tinggi;
    }
    
    public void keliling(){
        kelilingJajarGenjang = 2*(sisimiring+alas);
    }
}
