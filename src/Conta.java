import java.util.Random;

public class Conta {

    private String numeroConta;
    private int saldo;

    private Usuario usuario;

    public Conta(Usuario usuario){
        String numeroAleatorio = this.numeroAleatorio();

        this.numeroConta = numeroAleatorio;
        this.usuario = usuario;
    }

    /**
     * Gera um número aleatório
     *
     * @author Batista, C.
     * @return
     */
    private String numeroAleatorio(){
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100000);

        String numeroFormatado = String.format("%05d", numeroAleatorio);

        int ultimoDigito = random.nextInt(10);

        String numeroFinal = numeroFormatado + "-" + ultimoDigito;

        return numeroFinal;
    }

    /**
     * Exibe as informações da Conta.
     *
     * @author Batista, C.
     */
    public void exibirDados(){
        System.out.println("NOME: " + this.usuario.getNome() + " " + this.usuario.getSobrenome());
        System.out.println("CPF: " + this.usuario.getCpf());
        System.out.println("CONTA: " + this.numeroConta);
    }

    /**
     * Simula um saque na conta.
     * @param valor - a ser retirado da conta.
     * @return o valor do saque caso disponivel
     *
     * @author Batista, C.
     */
    public boolean sacar(int valor){
        boolean sucesso = (valor > 0) && (this.saldo >= valor);
        System.out.println(sucesso ? "Saque de R$ " + valor + " realizado com sucesso" : (valor > 0 ? "Você não tem saldo suficiente para sacar R$ " + valor : "Valor de saque inválido"));
        if (sucesso) {
            this.saldo -= valor;
        }
        return sucesso;
    }

    /**
     * Realiza um depósito na conta.
     *
     * @param valor O valor a ser depositado. Deve ser maior que zero.
     *
     * @author Batista, C.
     */
    public void depositar(int valor){
        System.out.println((valor > 0) ? ("Depósito realizado com sucesso no valor de R$: " + (this.saldo += valor)) : "Valor inválido");
    }
    public int getSaldo() {
        return saldo;
    }
}
