package Ex04;

import java.util.Random;
import java.util.Scanner;

/**
 * Gere um número inteiro aleatório entre 0 e 10 a cada execução do
 * programa(Biblioteca Random tanto em Java como C#) e pergunte ao usuário um
 * número. Se o usuário errar, peça para ele entrar com outro número até que acerte o
 * número gerado aleatoriamente.
 */

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Informe um número inteiro que poderá ser igual ao aleatório: ");
        int numeroAleatorio = random.nextInt(10);

        // teste do Randdom
        // System.out.println("Número inteiro aleatório de 0 até 10: " + numeroAleatorio);

        int numero = 0;
        while (numero != numeroAleatorio) {
            numero = scan.nextInt();
            if (numero != numeroAleatorio) {
                System.out.println("Tente novamente!!");
            }else {
                System.out.println("Parabéns você acertou o número aleátorio!! ");
                break;
            }
        }
    }
}
