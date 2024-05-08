import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, informe o seu nome.");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência.");  
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da conta.");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, informe o saldo.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco. Sua agência é " 
        + agencia + ", conta " + numeroConta + " e o seu saldo de R$" + saldo + " já está disponivel para saque.");

    }
}
