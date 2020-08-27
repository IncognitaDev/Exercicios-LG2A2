import java.util.ArrayList;

public class Carrinho implements AcoesProdutos {

    private ArrayList<Produto> produtos;
    private float valorTotal;

    public Carrinho() {
        this.produtos = new ArrayList<Produto>();
        this.valorTotal = 0.f;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
