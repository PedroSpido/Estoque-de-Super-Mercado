import java.util.ArrayList;

public class Estoque extends Estocavel {


    public Estoque() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("123", "06/10/2022", "08/10/2023", "Pao", Float.valueOf(10)));
        produtos.add(new Produto("123", "06/10/2022", "05/10/2021", "Pao de forma", Float.valueOf(13)));
        produtos.add(new Produto("123", "06/10/2022", "06/10/2002", "Batata", Float.valueOf(20)));


        produtos.forEach(p -> this.getProdutos().add(p));

    }

    public boolean removeProduto(Produto produto) {
        if (!this.getProdutos().remove(produto)) {
            System.out.println("Produto nao existe no estoque");
            return false;
        }
        return true;
    }

}
