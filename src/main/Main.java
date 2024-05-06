package main;
import benda_dua_dimensi.*;
import benda_tiga_dimensi.*;

public class Main {
    
    static class MenuPersegi {
        MenuPersegi(){
            float checkVar = 10f;
            
            Persegi persegi = new Persegi (checkVar);
            System.out.println("\nPERSEGI");
            System.out.println("Sisinya: " + persegi.sisi);
            System.out.println("Luas: " + persegi.luasPersegi);
            System.out.println("Keliling: " + persegi.kelilingPersegi + "\n");
            
            Kubus kubus = new Kubus(checkVar);
            System.out.println("KUBUS");
            System.out.println("Volume: " + kubus.volumeKubus);
            System.out.println("Luas Permukaan: " + kubus.luasPermukaanKubus + "\n");
            
            float tinggi = 12;
            
            LimasPersegi limasPersegi = new LimasPersegi(checkVar, tinggi);
            System.out.println("LIMAS PERSEGI");
            System.out.println("Volume: " + limasPersegi.volumeLimasPersegi);
            System.out.println("Luas Permukaan: " + limasPersegi.luasPermukaanLimasPersegi + "\n");
            
            PrismaPersegi prismaPersegi = new PrismaPersegi(checkVar, tinggi);
            System.out.println("PRISMA PERSEGI");
            System.out.println("Volume: " + prismaPersegi.volumePrismaPersegi);
            System.out.println("Luas Permukaan: " + prismaPersegi.luasPermukaanPrismaPersegi);
        }
    }
    
    static class MenuPersegiPanjang {
        MenuPersegiPanjang(){
            double checkVarPanjang = 8f;
            double checkVarLebar = 10f;
            double checkVarTinggi = 12f;
            
            PersegiPanjang persegiPanjang = new PersegiPanjang (checkVarPanjang, checkVarLebar);
            System.out.println("\nPERSEGI PANJANG");
            System.out.println("Panjang: " + persegiPanjang.panjang);
            System.out.println("Lebar: " + persegiPanjang.lebar);
            System.out.println("Luas: " + persegiPanjang.luasPersegiPanjang);
            System.out.println("Keliling: " + persegiPanjang.kelilingPersegiPanjang + "\n");

            LimasPersegiPanjang limasPP = new LimasPersegiPanjang(checkVarPanjang, checkVarLebar, checkVarTinggi);
            System.out.println("LIMAS PERSEGI PANJANG");
            System.out.println("Volume: " + limasPP.volumeLimasPersegiPanjang);
            System.out.println("Luas Permukaan: " + limasPP.luasPermukaanLimasPersegiPanjang + "\n");
            
            PrismaPersegiPanjang prismaPP = new PrismaPersegiPanjang(checkVarPanjang, checkVarLebar, checkVarTinggi);
            System.out.println("PRISMA PERSEGI PANJANG");
            System.out.println("Volume: " + prismaPP.volumePrismaPersegiPanjang);
            System.out.println("Luas Permukaan: " + prismaPP.luasPermukaanPrismaPersegiPanjang);
        }
    }
    
    public static void main(String[] args) {
        new MenuPersegi();
        new MenuPersegiPanjang();
    }
}
