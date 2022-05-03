package Tests;

import java.util.Scanner;

public class nameIdade {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String name;
            int idade;
            while (true) {
                System.out.println("Nome:");
                name = scan.next();
                if(name.equals("0")) break;
                System.out.println("Idade:");
                idade = scan.nextInt();

            }
            System.out.println("continua...");
        }
        }
