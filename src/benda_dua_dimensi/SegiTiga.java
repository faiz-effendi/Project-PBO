package benda_dua_dimensi;
import benda.Benda;

public class SegiTiga implements Benda{
    public double alas;
    public double tinggi;
    public double luas;
    public double keliling;
    
    public void luas(double a, double t){
        alas = a;
        tinggi = t;
        luas = alas*tinggi;
        keliling = alas + tinggi + (Math.sqrt(alas));
    }
    
    public void keliling(){
        System.out.println("keliling segitiga");
    }
}
