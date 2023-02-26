public class Prateleira extends Estocavel{

    private int id;

    public Prateleira(int id) {
        this.id = id;
        Sistema.adicionarPrateleira(this);
    }

    public int getId() {
        return id;
    }

    public void exibeProdutos() {


        for (Produto produto: this.getProdutos()
             ) {
            System.out.println(produto.getNomeProduto() + ", " + produto.getDataValidade() + " R$" + produto.getPreco());
        }
    }
    public void recebeProduto(Produto produto){
        this.getProdutos().add(produto);
    }
}