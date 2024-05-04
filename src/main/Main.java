package main;
import benda_dua_dimensi.*;
import benda_tiga_dimensi.*;

public class Main {
    
    static class MainMenu {
        MainMenu(){
            Kubus kubus = new Kubus(10);
            System.out.println("Sisinya: "+ kubus.sisi);
            System.out.println("Luas: "+ kubus.luas);
            System.out.println("Keliling: " + kubus.keliling);
            System.out.println("Volume: " + kubus.volume);

        }
    }
    
    public static void main(String[] args) {
        MainMenu run = new MainMenu();
    }
}
