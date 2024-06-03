import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.next();
        
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo: ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
        " sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está diponível para saque");
    }
}
