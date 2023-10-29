import java.util.Scanner;

/**
 * Reune toda a lógica necessária para simular ações no banco.
 *
 * @author Batista, C.
 */
public class ContaService {
    Scanner scanner = new Scanner(System.in);

    /**
     * Reune a lógica que simula as opções de uma interface
     * no banco Juros Vorazes.
     *
     * @author Batista, C.
     */
    public void opcoesCliente(Conta conta) {
        boolean sair = false;

        while (!sair) {
            System.out.println("\nDigite a opção desejada : "+
                    "\n 1 - Consultar saldo"+
                    "\n 2 - Depósito"+
                    "\n 3 - Sacar"+
                    "\n 4 - Consultar informações da conta"+
                    "\n 5 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é : " + conta.getSaldo());
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito :");
                    int deposito = scanner.nextInt();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.println("Digite o valor do saque :");
                    int saque = scanner.nextInt();
                    conta.sacar(saque);
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar nosso Sistema :");
                    sair = true;
                    break;
                default:
            }
        }
    }
}
