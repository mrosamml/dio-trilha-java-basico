import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta! ");
        int conta = in.nextInt();
        System.out.println("Por favor, digite o número da Agência! ");
        String agencia = in.next();
        System.out.println("Por favor, digite o nome Cliente! ");
        String nome = in.next();
        nome = nome.concat(" ").concat(in.next());
        in.nextLine();
        System.out.println("Por favor, deposite um valor! ");
        double saldo = Double.parseDouble(in.next().replace(',', '.'));
        System.out.println("........................Conta Aberta........................");
        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
                + "sua agência é %s, conta %d e seu saldo R$%.2f está disponível"
                + " para saque.", nome.toUpperCase(), agencia, conta, saldo );
        in.close();
    }
}