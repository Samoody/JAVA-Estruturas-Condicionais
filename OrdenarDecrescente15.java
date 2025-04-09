/**
 * Autor: SAMUEL KLEBER VIEIRA SILVA
 * RA: 12123150
 * Data: 04/04/2025
 * 
 * Programa que lê três números inteiros e os exibe em ordem decrescente.
 * Suponha que os números informados sejam diferentes.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numeros = new Integer[3];
        
        // Entrada de dados
        System.out.println("Digite três números diferentes:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Ordenação em ordem decrescente
        Arrays.sort(numeros, Collections.reverseOrder());
        
        // Exibição dos números em ordem decrescente
        System.out.println("\nNúmeros em ordem decrescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
