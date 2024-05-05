package main;
import benda_dua_dimensi.Persegi;
import benda_dua_dimensi.SegiTiga;
import benda_tiga_dimensi.Kubus;
import benda_tiga_dimensi.LimasSegitiga;

public class Main {
    
    static class MainMenu {
        MainMenu(){

            Lingkaran lingkaran = new Lingkaran (7);
            System.out.println("Lingkaran");
            System.out.println("Jari-jari: " + lingkaran.jari);
            System.out.println("Luas: " + lingkaran.luasLingkaran);
            System.out.println("Keliling: " + lingkaran.kelilingLingkaran + "\n");

            Tabung tabung = new Tabung (7, 3);
            System.out.println("tabung");
            System.out.println("Jari-jari: " + tabung.jari);
            System.out.println("volume: " + tabung.volume );
            System.out.println("Luas Permukaan: " + tabung.luasPermukaan + "\n");
            
            Bola bola = new Bola (7);
            System.out.println("bola");
            System.out.println("Jari-jari: " + bola.jari);
            System.out.println("volume: " + bola.volume );
            System.out.println("Luas Permukaan: " + bola.luasPermukaan + "\n");
        }
    }
    
    public static void main(String[] args) {
        MainMenu run = new MainMenu();
    }
}
