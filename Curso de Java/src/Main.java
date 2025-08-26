import java.util.Arrays;
import java.util.Scanner;

import POO.Carro;
import POO.Moto;

public class Main {
    public static void main(String[] args) {
     
        Carro carro = new Carro();
        carro.acelerar("O carro esta em movimento...");
        carro.frear("Velocidade foi reduzida");

        Moto moto = new Moto();
        moto.acelerar("A moto esta em movimento...");
        moto.frear("Velocidade reduzida");

        System.out.println();
    }
}
