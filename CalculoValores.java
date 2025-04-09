/*
 * Autor: SAMUEL KLEBER VIEIRA SILVA
 * RA: 12123150
 * Data: 04/04/2025
 * CÓDIGO EM C
 * Programa que lê dois valores inteiros A e B. 
 * Se forem iguais, soma os dois. Caso contrário, multiplica A por B.
 * O resultado é armazenado na variável C e exibido ao final.
 */

#include <stdio.h>

int main() {
    int A, B, C;
    
    // Entrada de dados
    printf("Digite o valor de A: ");
    scanf("%d", &A);
    
    printf("Digite o valor de B: ");
    scanf("%d", &B);
    
    // Cálculo conforme a condição
    if (A == B) {
        C = A + B;
    } else {
        C = A * B;
    }
    
    // Exibição dos resultados
    printf("\nValores informados:\n");
    printf("A = %d\n", A);
    printf("B = %d\n", B);
    printf("C = %d\n", C);
    
    return 0;
}




CÓDIGO EM JAVA


/**
 * Autor: SAMUEL KLEBER VIEIRA SILVA
 * RA: 12123150
 * Data: 04/04/2025
 * 
 * Programa que lê dois valores inteiros A e B. 
 * Se forem iguais, soma os dois. Caso contrário, multiplica A por B.
 * O resultado é armazenado na variável C e exibido ao final.
 */

import java.util.Scanner;

public class CalculoValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();
        
        int C;
        
        // Cálculo conforme a condição
        if (A == B) {
            C = A + B;
        } else {
            C = A * B;
        }
        
        // Exibição dos resultados
        System.out.println("\nValores informados:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        
        scanner.close();
    }
}

