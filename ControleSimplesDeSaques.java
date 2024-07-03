import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {

        double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; 
            } else if (valorSaque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; 
            } else {
                limiteRestante -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteRestante);
            }
        }
        scanner.close();
    }
}