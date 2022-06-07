package Ex02;

/**
 * Receba do usuário 10 números e exiba:
 * • O maior número
 * • O menor número
 * • A média aritmética
 * • Quantos números são acima de 10 e quais são eles
 * • Quantos números são acima de 50 e quais são eles
 * *OBS* O usuário não poderá digitar números repetidos
 */

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        System.out.println("Digite 10 numeros: ");

        Scanner scan = new Scanner(System.in);


        int[] numero = new int[10];
        int maior = 0;
        int menor = 0;
        int maiorDez = 0;
        int maiorCinquenta = 0;
        double soma = 0;

        for (int i = 0; i < numero.length; i++) {
            numero[i] = scan.nextInt();
            if (numero[i] == i) {
                System.out.println("programa encerado nao aceitamos numeros iguais! ");
                break;
            } else if (numero[i] != 0) {
                soma = soma + numero[i];

                if (numero[i] >= maior) {
                    maior = numero[i];
                } else if (numero[i] <= menor) {
                    menor = numero[i];

                } else if (numero[i] > 10) {
                    maiorDez++;
                } else if (numero[i] > 50) {
                    maiorCinquenta++;
                }
            }
        }

        System.out.println("*** Respostas ***");
        System.out.println();
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("Numeros maior que 10: " + maiorDez);
        System.out.println("Numeros maior que 50: " + maiorCinquenta);
        System.out.println("Media Aritimétrica dos numeros digitados: " + (soma / 10));

    }
}