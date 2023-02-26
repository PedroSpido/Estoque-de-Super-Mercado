import java.util.ArrayList;

public class SistemaAdmin implements Autenticavel{

    private ArrayList<Gerente> administradores = new ArrayList<>();

    public boolean autentica(String usuario, String senha){
        for (Gerente g: administradores
             ) {
            if(g.getUsuario().equals(usuario) && g.getSenha().equals(senha))
                return true;
        }
        return false;
    }

    public void adicionaGerente(Gerente g){
        this.administradores.add(g);
    }

    @Override
    public boolean alteraPrecoProduto(String nomeProd, Float novoPreco){

        for (Produto produto: Sistema.getEstoque().getProdutos()
             ) {
            if(nomeProd.equals(produto.getNomeProduto())){
                produto.setPreco(novoPreco);
                return true;
            }
        }
        return false;
    }

}
