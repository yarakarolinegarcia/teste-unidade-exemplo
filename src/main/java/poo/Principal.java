package poo;

import java.util.Random;

public class Principal {


    public static void main(String[] args) {

        Random semSementeFixa = new Random();


        System.out.println("Imprimindo 5 números aleatórios com random sem semente fixa");
        for (int i = 0; i < 5; i++) {
            System.out.println("["+i+"]: " + semSementeFixa.nextInt(100));
        }



        Random comSementeFixa = new Random(123456);

        System.out.println("\nImprimindo 5 números aleatórios com random com semente fixa");
        for (int i = 0; i < 5; i++) {
            System.out.println("["+i+"]: " + comSementeFixa.nextInt(100));
        }

    }
}
