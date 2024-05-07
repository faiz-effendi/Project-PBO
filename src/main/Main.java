package main;

import benda_dua_dimensi.*;
import benda_tiga_dimensi.*;

public class Main {
    static class MenuPersegi {
        MenuPersegi(){
            float checkVar = 10f;
            
            Persegi persegi = new Persegi (checkVar);
            System.out.println("\n-----------------------------------------");
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
            System.out.println("\n-----------------------------------------");
            System.out.println("PERSEGI PANJANG");
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
    
    static class MenuSegiTiga {
        MenuSegiTiga(){
            double sisi = 8;
            double tinggi = 12;
            
            SegiTiga segiTiga = new SegiTiga(sisi);
            System.out.println("\n-----------------------------------------");
            System.out.println("SEGITIGA ");
            System.out.println("Sisi: " + segiTiga.sisi);
            System.out.println("Luas: " + segiTiga.luasSegitiga);
            System.out.println("Keliling: " + segiTiga.kelilingSegitiga + "\n");
            
            PrismaSegiTiga prismaST = new PrismaSegiTiga(sisi, tinggi);
            System.out.println("PRISMA PERSEGI");
            System.out.println("Volume: " + prismaST.volumePST);
            System.out.println("Luas Permukaan: " + prismaST.luasPermukaanPST);
        }
    }

    static class MenuLingkaran {
        MenuLingkaran(){

            Lingkaran lingkaran = new Lingkaran (7);
            System.out.println("\n-----------------------------------------");
            System.out.println("LINGKARAN");
            System.out.println("Jari-jari: " + lingkaran.jari);
            System.out.println("Luas: " + lingkaran.luasLingkaran);
            System.out.println("Keliling: " + lingkaran.kelilingLingkaran + "\n");

            Tabung tabung = new Tabung (7, 3);
            System.out.println("TABUNG");
            System.out.println("Jari-jari: " + tabung.jari);
            System.out.println("volume: " + tabung.volume );
            System.out.println("Luas Permukaan: " + tabung.luasPermukaan + "\n");
            
            Bola bola = new Bola (7);
            System.out.println("BOLA");
            System.out.println("Jari-jari: " + bola.jari);
            System.out.println("volume: " + bola.volume );
            System.out.println("Luas Permukaan: " + bola.luasPermukaan + "\n");
        }
    }

    static class MenuBelahKetupat {
        MenuBelahKetupat(){
            BelahKetupat BelahKetupat = new BelahKetupat(6, 4);
            System.out.println("-----------------------------------------");
            System.out.println("BELAH KETUPAT");
            System.out.println("diagonal: " + BelahKetupat.sisiT +" & "+BelahKetupat.sisiD);
            System.out.println("Luas: " + BelahKetupat.luasBelahKetupat);
            System.out.println("Keliling: " + BelahKetupat.kelilingBelahKetupat + "\n");
        }
        
    }
    static class MenuJajarGenjang {
        MenuJajarGenjang(){
            JajarGenjang JajarGenjang = new JajarGenjang (7,4,6);
            System.out.println("-----------------------------------------");
            System.out.println("JAJAR GENJANG");
            System.out.println("alas: " + JajarGenjang.alas);
            System.out.println("tinggi: " + JajarGenjang.tinggi);
            System.out.println("Luas: " + JajarGenjang.luasJajarGenjang);
            System.out.println("Keliling: " + JajarGenjang.kelilingJajarGenjang + "\n");
        }
        
    }
    static class MenuLayanglayang {
        MenuLayanglayang(){
            Layanglayang Layanglayang = new Layanglayang (5,10,6);
            System.out.println("-----------------------------------------");
            System.out.println("LAYANG LAYANG");
            System.out.println("sisi luar: " + Layanglayang.miring1 + " & "+ Layanglayang.miring2);
            System.out.println("Luas: " + Layanglayang.luasLayanglayang);
            System.out.println("Keliling: " + Layanglayang.kelilingLayanglayang + "\n");
        }
        
    }
    static class MenuTrapesium {
        MenuTrapesium(){
            Trapesium Trapesium = new Trapesium (4,6,5);
            System.out.println("-----------------------------------------");
            System.out.println("TRAPESIUM");
            System.out.println("sisi datar: " + Trapesium.sisiA + " & " + Trapesium.sisiB);
            System.out.println("tinggi: " + Trapesium.tinggi);
            System.out.println("Luas: " + Trapesium.luasTrapesium);
            System.out.println("Keliling: " + Trapesium.kelilingTrapesium + "\n");
        }
    }

    public static void main(String[] args) {
        new MenuPersegi();
        new MenuPersegiPanjang();
        new MenuSegiTiga();
        new MenuLingkaran();
        new MenuBelahKetupat();
        new MenuJajarGenjang();
        new MenuLayanglayang();
        new MenuTrapesium();

    }
}
