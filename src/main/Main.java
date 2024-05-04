package main;
import benda_dua_dimensi.*;
import benda_tiga_dimensi.*;

public class Main {
    
    static class MainMenu {
        MainMenu(){
            Kubus kubus = new Kubus(10);
            System.out.println("Sisinya: "+ kubus.sisi);
            System.out.println("Luas: "+ kubus.luasPersegi);
            System.out.println("Keliling: " + kubus.kelilingPersegi);
            System.out.println("Volume: " + kubus.volumeKubus);

        }
    }
    
    public static void main(String[] args) {
        MainMenu run = new MainMenu();
    }
}
