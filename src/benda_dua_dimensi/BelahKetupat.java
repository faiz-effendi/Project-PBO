package benda_dua_dimensi;
public class BelahKetupat implements BendaDuaDimensi{
    public double sisiT; //sisi tegak
    public double sisiD; //sisi datar
    public double luasBelahKetupat;
    public double kelilingBelahKetupat;
    
    public BelahKetupat(double sisiT, double sisiD){
        this.sisiT = sisiT;
        this.sisiD = sisiD;
    }
    
    public double hitungLuas(){
        luasBelahKetupat = sisiT*sisiD/2;
        return luasBelahKetupat;
    }
    
    public double hitungKeliling(){
        double sisimiring;
        sisimiring = Math.sqrt(Math.pow(sisiT, 2) + Math.pow (sisiD, 2));
        kelilingBelahKetupat = 4*sisimiring;
        return kelilingBelahKetupat;
    }
}