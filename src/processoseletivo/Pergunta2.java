package processoseletivo;

import java.util.Scanner;

public class Pergunta2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero1 = 0, numero2 = 1, numero3 = 0, i;

        System.out.println("Digite um número para verificar: ");
        i = scan.nextInt();

        while (i > numero3) {
            numero3 = numero1 + numero2;
            numero1 = numero2;
            numero2 = numero3;

        }

        if (i == numero3) {
            System.out.println("O número " + i + " está na sequência de Fibonacci.");

        } else {
            System.out.println("Este número não faz parte da sequência de Fibonacci");
        }

    }

}
