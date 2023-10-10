import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o numero da Conta");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o numero da agência");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o valor do saldo");
        float saldoCliente = scanner.nextFloat();

    System.out.println("Olá " +nomeCliente + ", obrigado por criar uma " +
                "conta em nosso banco, sua agência é "+ agencia
            + ", conta " + numeroConta + " e seu saldo " +
            saldoCliente + " já está disponível para saque");
    }

}
