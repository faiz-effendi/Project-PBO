package main;
import benda_dua_dimensi.*;
import benda_tiga_dimensi.*;

public class Main {
    
    static class MainMenu {
        MainMenu(){
            float checkVar = 8.2f;
            
            Persegi persegi = new Persegi (checkVar);
            System.out.println("Sisinya: " + persegi.sisi);
            System.out.println("Luas: " + persegi.luasPersegi);
            System.out.println("Keliling: " + persegi.kelilingPersegi);
            System.out.println();
            
            Kubus kubus = new Kubus(checkVar);
            System.out.println("Volume: " + kubus.volumeKubus);
            System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaanKubus);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        new MainMenu();
    }
}
