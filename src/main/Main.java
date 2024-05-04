package main;
import benda_dua_dimensi.Persegi;
import benda_dua_dimensi.SegiTiga;
import benda_tiga_dimensi.Kubus;
import benda_tiga_dimensi.LimasSegitiga;

public class Main {
    
    static class MainMenu {
        MainMenu(){

            Persegi persegi = new Persegi (8);
            System.out.println("Sisinya: " + persegi.sisi);
            System.out.println("Luas: " + persegi.luasPersegi);
            System.out.println("Keliling: " + persegi.kelilingPersegi);
            System.out.println();
            
            SegiTiga segitiga = new SegiTiga (4);
            System.out.println("Sisinya: " + segitiga.sisi);
            System.out.println("Luas: " + segitiga.luasSegitiga);
            System.out.println("Keliling: " + segitiga.kelilingSegitiga);
            System.out.println();
            
            Kubus kubus = new Kubus(10);
            System.out.println("Volume: " + kubus.volumeKubus);
            System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaanKubus);
            System.out.println();

            LimasSegitiga limasSegitiga = new LimasSegitiga(4);
            System.out.println("Volume: " + limasSegitiga.volumeLimasSegitiga);
            System.out.println("Luas Permukaan limasSegitiga: " + limasSegitiga.luasPermukaanLimasSegitiga);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        MainMenu run = new MainMenu();
    }
}
