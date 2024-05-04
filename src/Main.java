import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(2500.00);

        int operacao = 1;

        while (operacao != 4) {
            System.out.println("Operações" + "\n \n" + "1- Consultar saldo" + "\n" + "2- Receber valor" + "\n" + "3- Transferir valor" + "\n" + "4- Sair");

            Scanner scannerOperacao = new Scanner(System.in);
            operacao = scannerOperacao.nextInt();

            if (operacao == 1) {
                System.out.println("\n\nSaldo: " + OperacoesService._obterSaldo(conta));
            } else if (operacao == 2) {
                double valorRecebido = 0.00;

                System.out.println("Valor Recebido: ");
                Scanner scannerValorRecebido = new Scanner(System.in);
                valorRecebido = scannerValorRecebido.nextDouble();

                double newValor = OperacoesService._operacaoReceber(conta, valorRecebido);
                conta.setSaldo(newValor);
                System.out.println("\n\nNovo saldo: " + OperacoesService._obterSaldo(conta) + "\n");
            } else if (operacao == 3) {
                double valorTransferido = 0.00;

                System.out.println("Valor Transferido: ");
                Scanner scannerValorTransferido = new Scanner(System.in);
                valorTransferido = scannerValorTransferido.nextDouble();

                double newValor = OperacoesService._operacaoTransferir(conta, valorTransferido);

                if (newValor < 0) {
                    System.out.println("\n\nSaldo insuficiente," + "saldo atual: " + OperacoesService._obterSaldo(conta));
                } else {
                    conta.setSaldo(newValor);
                    System.out.println("\n\nNovo saldo: " + OperacoesService._obterSaldo(conta) + "\n");
                }
            } else {
                if (operacao == 4) {
                    return;
                }

                System.out.println("\n\n###Operação inválida###\nTente novamente!\n");
            }
        }
    }
}