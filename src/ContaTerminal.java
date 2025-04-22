import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os numeros");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da Agencia");
        scanner.nextLine();
        String agencia = scanner.nextLine();


        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o seu nome");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + "," + "Obrigado por criar uma conta no nosso banco, sua agencia é " + agencia + "," + "conta " + numero + " e seu saldo é " + saldo);
    }
}
