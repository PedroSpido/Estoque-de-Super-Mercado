import java.util.ArrayList;

public abstract class Estocavel {
    private ArrayList<Produto> produtos = new ArrayList<>();


    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionaProduto(Produto produto){
        this.produtos.add(produto);
    }
}
