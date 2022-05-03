package Tests;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada;
        System.out.println("Tabuada:");
        tabuada = scan.nextInt();

        System.out.println("tabuada de " + tabuada);

        for(int i=1; i<=10;i++){
            System.out.println(tabuada + "x" + i + "=" + (tabuada*i));
        }
    }

}
