import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        // Cabeçalho
        System.out.println("*********************************************************");
        System.out.println("Nome: SAMUEL KLEBER VIEIRA SILVA");
        System.out.println("RA: 12123150");
        System.out.println("Data: 03/04/2025");
        System.out.println("*********************************************************");

        Scanner scanner = new Scanner(System.in);

        // Solicitar a senha
        System.out.print("Digite a senha: ");
        int senha = scanner.nextInt();

        // Verificar se a senha está correta
        if (senha == 4531) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        scanner.close();
    }
}
