import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do Titular da Conta:");
        String cliente = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta Bancária:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Qual é o seu saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Olá, " + cliente + "! Obrigado por criar uma conta em nosso banco.");
        System.out.println("A sua agência é: " + agencia + " e a sua conta é: " + conta + "."); 
        System.out.println("Seu saldo " + saldoInicial + " já está disponível para saque.");
        }
}
