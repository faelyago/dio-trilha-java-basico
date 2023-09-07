import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.next();
        String agenciaFormatada = agencia.substring(0, 3) + "-" + agencia.charAt(3); // Precisei pesquisar para saber como formatar a String.


        System.out.println("Por favor, digite o número da Conta!");
        int conta = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, digite o nome do titular da Conta!");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o Saldo inicial!");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agenciaFormatada, conta, saldo);

        sc.close();
    }
}
