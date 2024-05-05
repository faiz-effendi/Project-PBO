package benda_dua_dimensi;

public class BelahKetupat implements BendaDuaDimensi{
    public float sisiT; //sisi tegak
    public float sisiD; //sisi datar
    public float luasBelahKetupat;
    public float kelilingBelahKetupat;
    
    public BelahKetupat(float sisiT, float sisiD){
        this.sisiT = sisiT;
        this.sisiD = sisiD;
        luas();
        keliling();
    }
    
    public void luas(){
        luasBelahKetupat = sisiT*sisiD/2;
    }
    
    public void keliling(){
        float sisimiring;
        sisimiring = (float) Math.sqrt(Math.pow(sisiT, 2) + Math.pow(sisiD, 2));
        kelilingBelahKetupat = 4*sisimiring;
    }
}
