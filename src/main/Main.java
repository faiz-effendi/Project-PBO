package main;
import benda_dua_dimensi.*;
import benda_tiga_dimensi.*;

public class Main {
    
    static class MenuPersegi {
        MenuPersegi(){
            float checkVar = 8f;
            
            Persegi persegi = new Persegi (checkVar);
            System.out.println("PERSEGI");
            System.out.println("Sisinya: " + persegi.sisi);
            System.out.println("Luas: " + persegi.luasPersegi);
            System.out.println("Keliling: " + persegi.kelilingPersegi + "\n");
            
            Kubus kubus = new Kubus(checkVar);
            System.out.println("KUBUS");
            System.out.println("Volume: " + kubus.volumeKubus);
            System.out.println("Luas Permukaan: " + kubus.luasPermukaanKubus + "\n");
            
            float tinggi = 12;
            
            LimasPersegi limasPersegi = new LimasPersegi(checkVar, tinggi);
            System.out.println("LIMAS");
            System.out.println("Volume: " + limasPersegi.volumeLimasPersegi);
            System.out.println("Luas Permukaan: " + limasPersegi.luasPermukaanLimasPersegi + "\n");
            
            PrismaPersegi prismaPersegi = new PrismaPersegi(checkVar, tinggi);
            System.out.println("PRISMA");
            System.out.println("Volume: " + prismaPersegi.volumePrismaPersegi);
            System.out.println("Luas Permukaan: " + prismaPersegi.luasPermukaanPrismaPersegi);
        }
    }
    
    public static void main(String[] args) {
        new MenuPersegi();
    }
}
