import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saque, saldo = 0;
        boolean continuar = true;
        
        while (continuar) {
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    saldo += scanner.nextDouble();
                    System.out.println("Saldo atual: "+ saldo);
                    break;
                case 2:
                    saque = scanner.nextDouble();
                    if (saldo >= saque){
                    saldo -= saque;
                    System.out.println("Saldo atual: "+saldo);
                    } else System.out.println("Saldo insuficiente.");
                    break;
                case 3:
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}