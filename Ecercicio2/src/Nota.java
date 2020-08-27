import java.time.LocalDate;

public class Nota {

    private float valorTotal;
    private Produto[] produtos;
    private LocalDate data;

    public Nota(float valorTotal, Produto[] produtos, LocalDate data) {
        this.valorTotal = valorTotal;
        this.produtos = produtos;
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
