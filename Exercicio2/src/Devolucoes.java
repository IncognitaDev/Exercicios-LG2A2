import java.time.LocalDate;
import java.util.ArrayList;

public class Devolucoes {

    private Estoque estoque;
    private int numeroDevolucoes;
    private ArrayList<Produto> produtosDevolvidos = new ArrayList<Produto>();

    public Devolucoes(Estoque estoque) {
        this.estoque = estoque;
    }

    public float fazerDevolucao(Nota nota, Produto produto){
        LocalDate data = nota.getData();

        if(verificaData(data)) {
            return receberDevolução(nota, produto);
        };
        return 0f;
    }

    private boolean verificaData(LocalDate data){
        LocalDate dataAtual =  LocalDate.now();
        LocalDate dataMaxima = data.plusWeeks(1);

        if(dataMaxima.compareTo(dataAtual) > 0){
            return true;
        }
        return  false;
    }

    private float receberDevolução(Nota nota, Produto produtoDev){

        ArrayList<Produto> produtos =  nota.getProdutos();
        produtos.remove(produtoDev);
        produtosDevolvidos.add(produtoDev);
        estoque.adicionarProduto(produtoDev);
        nota.setProdutos(produtos);
        return produtoDev.getValor();
    }
}
