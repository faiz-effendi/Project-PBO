package main;
import benda_dua_dimensi.*;

public class Main {
    
    static class MainMenu {
        MainMenu(){
            SegiTiga x = new SegiTiga();
//            x.luas(double a, double t);
            x.keliling();
        }
    }
    
    public static void main(String[] args) {
        MainMenu run = new MainMenu(); 
    }
}
