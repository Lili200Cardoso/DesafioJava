import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("********************************");
        System.out.println("  SEJA BEM VINDO AO NOSSO BANCO  ");
        System.out.println("********************************");

        System.out.println("Digite o seu nome, por favor: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o nÚmero da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número de sua conta: ");
        long conta = scanner.nextLong();

        System.out.println("Digite o valor do seu saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + " " + sobrenome + ", obrigada por criar uma conta em nosso banco,");
        System.out.print("sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível!");

        System.out.println();
        System.out.println("********************************");
        System.out.println("  OBRIGADA E ATÉ BREVE!  ");
        System.out.println("********************************");

        
   
    }
}
