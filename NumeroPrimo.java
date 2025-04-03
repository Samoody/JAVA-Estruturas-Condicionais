import java.util.Scanner;

public class NumeroPrimo {
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

        boolean isPrimo = true;

        // Verificar se o número é primo
        if (numero <= 1) {
            isPrimo = false;  // Números menores ou iguais a 1 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }

        // Exibir o resultado
        if (isPrimo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close();
    }
}
