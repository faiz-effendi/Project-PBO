package benda_dua_dimensi;
import static java.lang.Math.*;

public class Layanglayang implements BendaDuaDimensi{
    public float miring1; //sisi luar 1
    public float miring2; //sisi luar 2
    public float diagonalSimetri; //sisi simetri 
    public float luasLayanglayang;
    public float kelilingLayanglayang;
    
    public Layanglayang(float miring1, float miring2, float diagonalSimetri){
        this.miring1 = miring1;
        this.miring2 = miring2;
        this.diagonalSimetri = diagonalSimetri;
        luas();
        keliling();
    }
    
    public void luas(){
        float diagonalTegak = (float) (sqrt(pow(miring1, 2) - pow(diagonalSimetri / 2, 2)) + sqrt(pow(miring2, 2) - pow(diagonalSimetri / 2, 2)));
        luasLayanglayang = diagonalTegak * diagonalSimetri /2;
    }
    
    public void keliling(){
        kelilingLayanglayang = 2*(miring1+miring2);
    }
}
