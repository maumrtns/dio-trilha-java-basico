import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);    

       System.out.println("Por favor, digite o número da Agência!");
       String agencia = scanner.nextLine();

       System.out.println("Por favor, digite seu nome!");
       String nomeCliente = scanner.nextLine();

       System.out.println("Por favor, digite o número da conta!");
       int numeroConta = scanner.nextInt();
    
       System.out.println("Por favor, digite o saldo da conta:");
       double saldo = scanner.nextDouble();

       System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
