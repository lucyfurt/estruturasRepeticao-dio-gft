package Tests;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

int nota;
System.out.println("Escreva a nota:");
nota = scan.nextInt();

while (nota < 0 | nota > 10){
    System.out.println("escreva uma nota válida");
    nota = scan.nextInt();


}



    }
}
