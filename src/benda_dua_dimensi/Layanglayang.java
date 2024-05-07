package benda_dua_dimensi;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Layanglayang implements BendaDuaDimensi{
    public double miring1; //sisi luar 1
    public double miring2; //sisi luar 2
    public double diagonalSimetri; //sisi simetri 
    public double luasLayanglayang;
    public double kelilingLayanglayang;
    
    public Layanglayang(double miring1, double miring2, double diagonalSimetri){
        this.miring1 = miring1;
        this.miring2 = miring2;
        this.diagonalSimetri = diagonalSimetri;
        // hitungLuas();
        // hitungKeliling();
    }
    
    public double hitungLuas(){
        double diagonalTegak = (sqrt(pow(miring1, 2) - pow(diagonalSimetri / 2, 2)) + sqrt(pow(miring2, 2) - pow(diagonalSimetri / 2, 2)));
        luasLayanglayang = diagonalTegak * diagonalSimetri /2;
        return luasLayanglayang;
    }
    
    public double hitungKeliling(){
        kelilingLayanglayang = 2*(miring1+miring2);
        return kelilingLayanglayang;
    }
}
