package benda_dua_dimensi;

public class PersegiPanjang implements BendaDuaDimensi{
    public double panjang;
    public double lebar;
    public double luasPersegiPanjang;
    public double kelilingPersegiPanjang;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        hitungLuas();
    }
    
    public double hitungLuas(){
        luasPersegiPanjang = panjang*lebar;
        return luasPersegiPanjang;

    }
    
    public double hitungKeliling(){
        kelilingPersegiPanjang = 2*(panjang+lebar);
        return kelilingPersegiPanjang;
    }
}
