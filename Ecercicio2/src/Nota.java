import java.time.LocalDate;
import java.util.ArrayList;

public class Nota {

    private float valorTotal;
    private ArrayList<Produto> produtos;
    private LocalDate data;

    public Nota(float valorTotal, ArrayList<Produto> produtos, LocalDate data) {
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

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
