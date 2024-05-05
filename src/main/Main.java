package main;
// import benda_dua_dimensi.Persegi;
// import benda_dua_dimensi.SegiTiga;
import benda_dua_dimensi.*;
// import benda_tiga_dimensi.Kubus;
// import benda_tiga_dimensi.LimasSegitiga;
import benda_tiga_dimensi.*;

public class Main {
    
    static class MainMenu {
        MainMenu(){

            Persegi persegi = new Persegi (8);
            System.out.println("Persegi");
            System.out.println("Sisinya: " + persegi.sisi);
            System.out.println("Luas: " + persegi.luasPersegi);
            System.out.println("Keliling: " + persegi.kelilingPersegi + "\n");
            
            PersegiPanjang pPanjang = new PersegiPanjang(10, 5);
            System.out.println("Persegi Panjang");
            // System.out.println("Sisinya: " + pPanjang.sisi);
            System.out.println("Luas: " + pPanjang.luasPersegiPanjang);
            System.out.println("Keliling: " + pPanjang.kelilingPersegiPanjang + "\n");

            SegiTiga segitiga = new SegiTiga (4);
            System.out.println("Segitiga sama sisi");
            System.out.println("Sisinya: " + segitiga.sisi);
            System.out.println("Luas: " + segitiga.luasSegitiga);
            System.out.println("Keliling: " + segitiga.kelilingSegitiga + "\n");
            
            Lingkaran lingkaran = new Lingkaran (7);
            System.out.println("Lingkaran");
            System.out.println("Jari-jari: " + lingkaran.jari);
            System.out.println("Luas: " + lingkaran.luasLingkaran);
            System.out.println("Keliling: " + lingkaran.kelilingLingkaran + "\n");

            BelahKetupat BelahKetupat = new BelahKetupat(6, 4);
            System.out.println("Belah Ketupat");
            // System.out.println("Jari-jari: " + BelahKetupat.jari);
            System.out.println("Luas: " + BelahKetupat.luasBelahKetupat);
            System.out.println("Keliling: " + BelahKetupat.kelilingBelahKetupat + "\n");

            JajarGenjang JajarGenjang = new JajarGenjang (7,4,6);
            System.out.println("Jajar Genjang");
            // System.out.println("Jari-jari: " + JajarGenjang.jari);
            System.out.println("Luas: " + JajarGenjang.luasJajarGenjang);
            System.out.println("Keliling: " + JajarGenjang.kelilingJajarGenjang + "\n");

            Trapesium Trapesium = new Trapesium (4,6,5);
            System.out.println("Trapesium");
            // System.out.println("Jari-jari: " + Trapesium.jari);
            System.out.println("Luas: " + Trapesium.luasTrapesium);
            System.out.println("Keliling: " + Trapesium.kelilingTrapesium + "\n");

            Layanglayang Layanglayang = new Layanglayang (8,6);
            System.out.println("Layanglayang");
            // System.out.println("Jari-jari: " + Layanglayang.jari);
            System.out.println("Luas: " + Layanglayang.luasLayanglayang);
            System.out.println("Keliling: " + Layanglayang.kelilingLayanglayang + "\n");

            Kubus kubus = new Kubus(10);
            System.out.println("Kubus");
            System.out.println("Volume: " + kubus.volumeKubus);
            System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaanKubus + "\n");
  
        }
    }
    
    public static void main(String[] args) {
        MainMenu run = new MainMenu();
    }
}
