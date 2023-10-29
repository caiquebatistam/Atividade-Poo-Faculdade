import java.util.Scanner;

public class Main {
    /**
     * Classe principal que inicia o programa do Banco Juros Vorazes
     *
     * @author Batista, C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaService contaService = new ContaService();

        System.out.println("\nBem vindos ao Banco Juros Vorazes");

        System.out.println("\nDigite o primeiro nome :");
        String nome = scanner.next();

        scanner.nextLine();

        System.out.println("\nDigite o sobrenome :");
        String sobrenome = scanner.nextLine();

        System.out.println("\nDigite seu cpf");
        String cpf = scanner.next();

        Usuario usuario = new Usuario(nome, cpf, sobrenome);

        Conta conta = new Conta(usuario);

        System.out.println("Cadastro realizado com sucesso");
        System.out.println("###############################");

        contaService.opcoesCliente(conta);

        System.out.println("Muito obrigado por utilizar nosso sistema: ");

        scanner.close();

    }

}
