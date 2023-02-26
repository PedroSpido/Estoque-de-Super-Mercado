public class Gerente extends Funcionario implements Autenticavel {

    private String usuario;
    private String senha;

    public Gerente(String nome, String cpf, int codFuncionario, String usuario, String senha) {
        super(nome, cpf, codFuncionario);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
    @Override
    public boolean alteraPrecoProduto(String nomeProd, Float novoPreco) {

        return Sistema.administrativo(this.usuario, this.senha).
                alteraPrecoProduto(nomeProd,novoPreco);
    }

    public void adicionaProduto(Produto produto){
        Sistema.getEstoque().adicionaProduto(produto);
    }
}
