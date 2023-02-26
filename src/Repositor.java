public class Repositor extends Funcionario {

    public Repositor(String nome, String cpf, int codFuncionario){
        super(nome, cpf, codFuncionario);
    }

    public void repoeProduto(int idPrateleira, Produto produto) {
        Sistema.repoeProduto(idPrateleira, produto);
    }
}
