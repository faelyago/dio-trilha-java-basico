import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner sc = new Scanner(System.in);

        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();

        try {
            contar(numeroUm, numeroDois);
        }
        catch (ParametrosInvalidosException Erro) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        sc.close();
    }
    public static void contar (int numeroUm, int numeroDois) throws ParametrosInvalidosException {

        if (numeroDois < numeroUm) {
            throw new ParametrosInvalidosException();
        }

        int contagem = numeroDois - numeroUm;

        for (int contador = 0; contador < contagem; contador++){
            System.out.println("Imprimindo o número " + (contador+1));
        }

    }
}
