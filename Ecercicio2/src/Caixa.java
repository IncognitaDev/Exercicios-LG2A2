import java.time.LocalDate;

public class Caixa {

    private int numeroDeVendas;
    private float caixa;

    public Caixa(int numeroDeVendas, float caixa) {
        this.numeroDeVendas = numeroDeVendas;
        this.caixa = caixa;
    }

    public Nota efetuarVenda(Carrinho carrinho){
        LocalDate data =  LocalDate.now();
        caixa += carrinho.getValorTotal();
        Nota nota = gerarNota(data, carrinho);
        return nota;
    }

    public Nota gerarNota(LocalDate data, Carrinho carrinho){
        float valor = carrinho.getValorTotal();
        Produto[] produtos = carrinho.getProdutos().toArray(new Produto[0]);
        Nota nota = new Nota( valor, produtos , data);
        return nota;
    }

    public int getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }

    public float getCaixa() {
        return caixa;
    }

    public void setCaixa(float caixa) {
        this.caixa = caixa;
    }
}
