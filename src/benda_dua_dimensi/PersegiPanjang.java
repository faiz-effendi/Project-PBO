package benda_dua_dimensi;

public class PersegiPanjang implements BendaDuaDimensi{
    public double panjang;
    public double lebar;
    public double luasPersegiPanjang;
    public double kelilingPersegiPanjang;
    
    public PersegiPanjang(double panjang, double lebar){
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