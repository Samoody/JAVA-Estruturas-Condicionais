/**
 * Autor: SAMUEL KLEBER VIEIRA SILVA
 * RA: 12123150
 * Data: 04/04/2025
 * 
 * Programa que lê quatro números inteiros e os exibe em ordem crescente.
 * Suponha que os números informados sejam diferentes.
 */

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];
        
        // Entrada de dados
        System.out.println("Digite quatro números diferentes:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Ordenação
        Arrays.sort(numeros);
        
        // Exibição dos números em ordem crescente
        System.out.println("\nNúmeros em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
