import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        // *********************************************************
        // Nome: SAMUEL KLEBER VIEIRA SILVA
        // RA: 12123150
        // Data: 03/04/2025
        // *********************************************************

        // Inicializando o Scanner para ler a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitar os três números ao usuário
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // Ordenando os números em ordem crescente
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        
        if (numero2 > numero3) {
            int temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }
        
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        // Exibindo os números em ordem crescente
        System.out.println("Os números em ordem crescente são: " + numero1 + ", " + numero2 + ", " + numero3);

        // Fechando o scanner
        scanner.close();
    }
}
