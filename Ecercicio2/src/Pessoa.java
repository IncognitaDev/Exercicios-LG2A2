import java.util.ArrayList;

public class Pessoa {

    private String name;
    private String cpf;
    private float dinheiro;
    private ArrayList<Nota> notas;
    private Carrinho carrinho;

    public Pessoa(String name, String cpf, float dinheiro) {
        this.name = name;
        this.cpf = cpf;
        this.dinheiro = dinheiro;
        this.notas = new ArrayList<Nota>();
    }

    public void pegarCarrinho() {
        if(this.carrinho == null ){
            carrinho = new Carrinho();
        }
    }

    public void pegarProduto(Produto produto, Estoque estoque){
        if (estoque.disponivel(produto)) {
            this.carrinho.adicionarProduto(produto);
            estoque.removerProduto(produto);
        }else {
            System.out.println("Produto não disponivel");
        }
    }


    public void passarNoCaixa( Caixa caixa){
        if(this.carrinho.getValorTotal() < this.dinheiro){
            this.setDinheiro(this.dinheiro - this.carrinho.getValorTotal());
            notas.add(caixa.efetuarVenda(this.carrinho));
            setCarrinho(null);
        }
    }

    public void devolverProduto(Devolucoes devolucoes, Produto produto,int index){
        float troco = devolucoes.fazerDevolucao(notas.get(index), produto);
        setDinheiro(this.dinheiro + troco );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
