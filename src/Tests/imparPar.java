package Tests;

import java.util.Scanner;

public class imparPar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;
        int count = 0;

        System.out.println("escreva quantidade de numeros");
          quantNumeros = scan.nextInt();

        do{
            System.out.println("numero:");
            numero = scan.nextInt();
            if(numero % 2 == 0) quantPares++;

            else quantImpares++;
            count++;


        }while(count < quantNumeros);
        System.out.println("Total de números ímpares:" + quantImpares);
        System.out.println("Total de números pares:" + quantPares);

    }

}
