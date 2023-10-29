public class Usuario {

    private String nome;
    private String cpf;
    private String sobrenome;

    public Usuario(String nome, String cpf, String sobrenome){
        this.nome = nome;
        this.cpf = cpf;
        this.sobrenome = sobrenome;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getSobrenome() {
        return sobrenome;
    }
}
