package benda_dua_dimensi;

public class Layanglayang implements BendaDuaDimensi{
    public float sisiT; //sisitegak
    public float sisiD; //sisidatar
    public float luasLayanglayang;
    public float kelilingLayanglayang;
    
    public Layanglayang(float sisiT, float sisiD){
        this.sisiT = sisiT;
        this.sisiD = sisiD;
        luas();
        keliling();
    }
    
    public void luas(){
        luasLayanglayang = sisiT*sisiD/2;
    }
    
    public void keliling(){
        kelilingLayanglayang = 0;
    }
}
