
package main;

import benda_dua_dimensi.BelahKetupat;
import benda_dua_dimensi.JajarGenjang;
import benda_dua_dimensi.Layanglayang;
import benda_dua_dimensi.Lingkaran;
import benda_dua_dimensi.Persegi;
import benda_dua_dimensi.PersegiPanjang;
import benda_dua_dimensi.SegiTiga;
import benda_dua_dimensi.Trapesium;
import benda_tiga_dimensi.Bola;
import benda_tiga_dimensi.Kubus;
import benda_tiga_dimensi.LimasPersegi;
import benda_tiga_dimensi.LimasPersegiPanjang;
import benda_tiga_dimensi.PrismaPersegi;
import benda_tiga_dimensi.PrismaPersegiPanjang;
import benda_tiga_dimensi.PrismaSegiTiga;
import benda_tiga_dimensi.Tabung;

public class Main {
    static class MenuPersegi {
        MenuPersegi(){
            double inputSisi = 10;
            double tinggiPersegi = 12;
            
            Persegi persegi = new Persegi (inputSisi);
            System.out.println("\n-----------------------------------------");
            System.out.println("PERSEGI");
            System.out.println("Sisinya: " + persegi.sisi);
            System.out.println("Luas: " + persegi.hitungLuas());
            System.out.println("Keliling: " + persegi.hitungKeliling() + "\n");
            
            Kubus kubus = new Kubus(inputSisi);
            System.out.println("KUBUS");
            System.out.println("Volume: " + kubus.hitungVolumeKubus());
            System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaanKubus() + "\n");
            
            LimasPersegi limasPersegi = new LimasPersegi(inputSisi, tinggiPersegi);
            System.out.println("LIMAS PERSEGI");
            System.out.println("Volume: " + limasPersegi.hitungVolumeLimasPersegi());
            System.out.println("Luas Permukaan: " + limasPersegi.hitungVolumeLimasPersegi() + "\n");
            
            PrismaPersegi prismaPersegi = new PrismaPersegi(inputSisi, tinggiPersegi);
            System.out.println("PRISMA PERSEGI");
            System.out.println("Volume: " + prismaPersegi.hitungVolumePrismaPersegi());
            System.out.println("Luas Permukaan: " + prismaPersegi.hitungLuasPermukaanPrismaPersegi());
        }
    }
    
    static class MenuPersegiPanjang {
        MenuPersegiPanjang(){
            double checkVarPanjang = 8;
            double checkVarLebar = 10;
            double checkVarTinggi = 12;
            
            PersegiPanjang persegiPanjang = new PersegiPanjang (checkVarPanjang, checkVarLebar);
            System.out.println("\n-----------------------------------------");
            System.out.println("PERSEGI PANJANG");
            System.out.println("Panjang: " + persegiPanjang.panjang);
            System.out.println("Lebar: " + persegiPanjang.lebar);
            System.out.println("Luas: " + persegiPanjang.hitungLuas());
            System.out.println("Keliling: " + persegiPanjang.hitungKeliling() + "\n");

            LimasPersegiPanjang limasPP = new LimasPersegiPanjang(checkVarPanjang, checkVarLebar, checkVarTinggi);
            System.out.println("LIMAS PERSEGI PANJANG");
            System.out.println("Volume: " + limasPP.hitungVolumeLimasPersegiPanjang());
            System.out.println("Luas Permukaan: " + limasPP.hitungLuasPermukaanLimasPersegiPanjang() + "\n");
            
            PrismaPersegiPanjang prismaPP = new PrismaPersegiPanjang(checkVarPanjang, checkVarLebar, checkVarTinggi);
            System.out.println("PRISMA PERSEGI PANJANG");
            System.out.println("Volume: " + prismaPP.hitungVolumePrismaPersegiPanjang());
            System.out.println("Luas Permukaan: " + prismaPP.hitungLuasPermukaanPrismaPersegiPanjang());
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
            System.out.println("Luas: " + segiTiga.hitungLuas());
            System.out.println("Keliling: " + segiTiga.hitungKeliling() + "\n");
            
            PrismaSegiTiga prismaST = new PrismaSegiTiga(sisi, tinggi);
            System.out.println("PRISMA PERSEGI");
            System.out.println("Volume: " + prismaST.hitungVolumePrismaSegitiga());
            System.out.println("Luas Permukaan: " + prismaST.hitungLuasPermukaanPrismaSegitiga());
        }
    }

    static class MenuLingkaran {
        MenuLingkaran(){

            Lingkaran lingkaran = new Lingkaran (7);
            System.out.println("\n-----------------------------------------");
            System.out.println("LINGKARAN");
            System.out.println("Jari-jari: " + lingkaran.jari);
            System.out.println("Luas: " + lingkaran.hitungLuas());
            System.out.println("Keliling: " + lingkaran.hitungKeliling() + "\n");

            Tabung tabung = new Tabung (7, 3);
            System.out.println("TABUNG");
            System.out.println("Jari-jari: " + tabung.jari);
            System.out.println("volume: " + tabung.hitungVolumeTabung() );
            System.out.println("Luas Permukaan: " + tabung.hitungLuasPermukaanTabung() + "\n");
            
            Bola bola = new Bola (7);
            System.out.println("BOLA");
            System.out.println("Jari-jari: " + bola.jari);
            System.out.println("volume: " + bola.hitungVolumeBola() );
            System.out.println("Luas Permukaan: " + bola.hitungLuasPermukaanBola() + "\n");
        }
    }

    static class MenuBelahKetupat {
        MenuBelahKetupat(){
            BelahKetupat BelahKetupat = new BelahKetupat(6, 4);
            System.out.println("-----------------------------------------");
            System.out.println("BELAH KETUPAT");
            System.out.println("diagonal: " + BelahKetupat.sisiT +" & "+BelahKetupat.sisiD);
            System.out.println("Luas: " + BelahKetupat.hitungLuas());
            System.out.println("Keliling: " + BelahKetupat.hitungKeliling() + "\n");
        }
        
    }
    static class MenuJajarGenjang {
        MenuJajarGenjang(){
            JajarGenjang JajarGenjang = new JajarGenjang (7,4,6);
            System.out.println("-----------------------------------------");
            System.out.println("JAJAR GENJANG");
            System.out.println("alas: " + JajarGenjang.alas);
            System.out.println("tinggi: " + JajarGenjang.tinggi);
            System.out.println("Luas: " + JajarGenjang.hitungLuas());
            System.out.println("Keliling: " + JajarGenjang.hitungKeliling() + "\n");
        }
        
    }
    static class MenuLayanglayang {
        MenuLayanglayang(){
            Layanglayang Layanglayang = new Layanglayang (5,10,6);
            System.out.println("-----------------------------------------");
            System.out.println("LAYANG LAYANG");
            System.out.println("sisi luar: " + Layanglayang.miring1 + " & "+ Layanglayang.miring2);
            System.out.println("Luas: " + Layanglayang.hitungLuas());
            System.out.println("Keliling: " + Layanglayang.hitungKeliling() + "\n");
        }
        
    }
    static class MenuTrapesium {
        MenuTrapesium(){
            Trapesium Trapesium = new Trapesium (4,6,5);
            System.out.println("-----------------------------------------");
            System.out.println("TRAPESIUM");
            System.out.println("sisi datar: " + Trapesium.sisiA + " & " + Trapesium.sisiB);
            System.out.println("tinggi: " + Trapesium.tinggi);
            System.out.println("Luas: " + Trapesium.hitungLuas());
            System.out.println("Keliling: " + Trapesium.hitungKeliling() + "\n");
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
