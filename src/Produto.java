public class Produto {

    private String codBarras;
    private String dataFabricacao;
    private String dataValidade;
    private String nomeProduto;
    private Float preco;

    public Produto(String codBarras, String dataFabricacao, String dataValidade, String nomeProduto, Float preco) {
        this.codBarras = codBarras;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Float getPreco() {
        return preco;
    }

}
