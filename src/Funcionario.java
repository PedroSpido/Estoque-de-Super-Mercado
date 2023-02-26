public abstract class Funcionario {

    private String nome;
    private String cpf;
    private int codFuncionario;


    public Funcionario(String nome, String cpf, int codFuncionario){
        this.nome = nome;
        this.cpf = cpf;
        this.codFuncionario = codFuncionario;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
