package benda_dua_dimensi;

public class PersegiPanjang implements BendaDuaDimensi{
    public float panjang;
    public float lebar;
    public float luasPersegiPanjang;
    public float kelilingPersegiPanjang;
    
    public PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        luas();
        keliling();
    }
    
    public void luas(){
        luasPersegiPanjang = panjang*lebar;
    }
    
    public void keliling(){
        kelilingPersegiPanjang = 2*(panjang+lebar);
    }
}
