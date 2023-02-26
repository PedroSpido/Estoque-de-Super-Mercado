public class Main {

    public static void main(String[] args) {

        Prateleira[] vetPrateleiras = new Prateleira[3];

        for (int i = 0; i < 3; i++) {
            vetPrateleiras[i] = new Prateleira(i);
        }

        Gerente g1 = new Gerente("Alexandre", "000000000-00", 1, "alexandre", "fatec");
        Repositor r1 = new Repositor("Pedro", "000000000-01", 2);
        Sistema.adicionaGerente(g1);
        System.out.println("\nEstoque original: ");
        Sistema.listaEstoque();
        Sistema.listaVencidos("06/10/2022");

        g1.alteraPrecoProduto("Pao", 50F);
        System.out.println("\nEstoque apos alterar preco");
        Sistema.listaEstoque();


        r1.repoeProduto(0, Sistema.getEstoque().getProdutos().get(2));
        System.out.println("\nEstoque apos reposicao da prateleira 1:");
        Sistema.listaEstoque();
        System.out.println("\nPrateleira 1");
        vetPrateleiras[0].exibeProdutos();

        r1.repoeProduto(1, Sistema.getEstoque().getProdutos().get(1));
        System.out.println("\nEstoque apos reposicao da prateleira 2:");
        Sistema.listaEstoque();
        System.out.println("\nPrateleira 2");
        vetPrateleiras[1].exibeProdutos();

        r1.repoeProduto(2, Sistema.getEstoque().getProdutos().get(0));
        System.out.println("\nEstoque apos reposicao da prateleira 3:");
        Sistema.listaEstoque();
        System.out.println("\nPrateleira 3");
        vetPrateleiras[2].exibeProdutos();

        g1.adicionaProduto(new Produto("24241", "01/01/2001", "11/12/2022", "Arroz", 25F));
        System.out.println("\nEstoque apos adicionar produto:");
        Sistema.listaEstoque();
    }

}
