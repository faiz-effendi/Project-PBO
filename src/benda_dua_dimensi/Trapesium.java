package benda_dua_dimensi;

public class Trapesium implements BendaDuaDimensi{
    public float sisiA;
    public float sisiB;
    public float tinggi;
    public float luasTrapesium;
    public float kelilingTrapesium;
    
    public Trapesium(float sisiA, float sisiB, float tinggi){
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.tinggi = tinggi;
        luas();
        keliling();
    }
    
    public void luas(){
        luasTrapesium = (sisiA + sisiB)/2 * tinggi;
    }
    
    public void keliling(){
        float sisimiring;
        sisimiring = (float) Math.sqrt(Math.pow((sisiB-sisiA), 2) + Math.pow(tinggi, 2));
        kelilingTrapesium = 2*sisimiring + sisiA + sisiB;
    }
}
