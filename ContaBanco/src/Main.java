import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        System.out.println("Por favor, digite o número da Conta: ");
        conta.setNumero(sc.nextInt());
        sc.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        conta.setAgencia(sc.nextLine());
        System.out.println("Por favor, digite o nome do titular: ");
        conta.setTitular(sc.nextLine());
        System.out.println("Por favor, digite o saldo: ");
        conta.setSaldo(sc.nextDouble());

        System.out.println("Olá " + conta.getTitular() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já esta disponível para saque.");
    }
}