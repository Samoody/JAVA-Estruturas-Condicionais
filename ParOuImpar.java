import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        // Cabeçalho
        System.out.println("*********************************************************");
        System.out.println("Nome: SAMUEL KLEBER VIEIRA SILVA");
        System.out.println("RA: 12123150");
        System.out.println("Data: 03/04/2025");
        System.out.println("*********************************************************");

        Scanner scanner = new Scanner(System.in);

        // Solicitar um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificar se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}
