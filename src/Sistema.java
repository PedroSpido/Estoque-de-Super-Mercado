import java.util.ArrayList;

public abstract class Sistema {

    private static Estoque estoque = new Estoque();
    private static SistemaAdmin admin = new SistemaAdmin();
    private static ArrayList<Prateleira> prateleiras = new ArrayList<>();


    public static void listaEstoque(){
        for (Produto produto: estoque.getProdutos()
             ) {
            System.out.println(produto.getNomeProduto() + ", " + produto.getDataFabricacao() + ", " + produto.getDataValidade() + " R$" + produto.getPreco() );
        }
    }

    private static boolean estaVencido(String d1, String d2){

        String[] d1Separado;
        String[] d2Separado;
        d1Separado = d1.split("/");
        d2Separado = d2.split("/");

        if(Integer.parseInt(d1Separado[2]) < Integer.parseInt(d2Separado[2])){
            return false;
        }
        if(Integer.parseInt(d1Separado[2]) == Integer.parseInt(d2Separado[2])){
            if(Integer.parseInt(d1Separado[1]) < Integer.parseInt(d2Separado[1])){
                return false;
            }
            if(Integer.parseInt(d1Separado[1]) == Integer.parseInt(d2Separado[1])){
                if(Integer.parseInt(d1Separado[0]) <= Integer.parseInt(d2Separado[0])){
                    return false;
                }
            }
        }

        return true;
    }

    public static void listaVencidos(String dataAtual){

        ArrayList<Produto> temp = new ArrayList<>();

        for (Produto produto: estoque.getProdutos()
             ) {
            if(estaVencido(dataAtual, produto.getDataValidade())){
                temp.add(produto);
            }
        }
        System.out.println("\nProdutos vencidos no dia" + " " + dataAtual + ":");
        temp.forEach(produto -> System.out.println(produto.getNomeProduto() + ", validade: " + produto.getDataValidade() + " R$" + produto.getPreco() ));
    }

    public static void adicionarPrateleira(Prateleira prateleira){
        prateleiras.add(prateleira);
    }

    public static void repoeProduto(int idPrateleira, Produto produto){
        if(estoque.removeProduto(produto)){
            for (Prateleira prateleira: prateleiras
                 ) {
                if (prateleira.getId() == idPrateleira){
                    prateleira.recebeProduto(produto);
                }
            }
        }else {
            System.out.println("produto inexistente");
        }
    }

    public static void adicionaGerente(Gerente g){
        admin.adicionaGerente(g);
    }

    public static SistemaAdmin administrativo(String user, String senha){
        if(admin.autentica(user, senha)){
            return admin;
        }
        return null;
    }

    public static Estoque getEstoque() {
        return estoque;
    }
}
