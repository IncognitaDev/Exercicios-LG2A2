import java.time.LocalDate;
import java.util.ArrayList;

public class Caixa {

    private int numeroDeVendas;
    private float caixa;

    public Caixa() {
        this.numeroDeVendas = 0;
        this.caixa = 0f;
    }

    public Nota efetuarVenda(Carrinho carrinho){
        LocalDate data =  LocalDate.now();
        caixa += carrinho.getValorTotal();
        setNumeroDeVendas(numeroDeVendas + 1);
        Nota nota = gerarNota(data, carrinho);
        return nota;
    }

    public Nota gerarNota(LocalDate data, Carrinho carrinho){
        float valor = carrinho.getValorTotal();
        ArrayList<Produto> produtos = carrinho.getProdutos();
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
