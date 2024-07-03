import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        if (saque <= saldo || saque <= saldo + 500) {
            System.out.println("Transacao realizada com sucesso" + (saque > saldo ? " utilizando o cheque especial.": "."));
        } else {
        System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }  
        scanner.close();
    }
}
