import java.util.ArrayList;

public class Estoque implements AcoesProdutos{

    private ArrayList<Produto> produtos;

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public Estoque(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public boolean disponivel(Produto produto){
        if(produtos.contains(produto)){
            return true;
        }
        return false;
    }
}
