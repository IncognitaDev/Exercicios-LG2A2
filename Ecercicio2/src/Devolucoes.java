import java.time.LocalDate;
import java.util.ArrayList;

public class Devolucoes {

    private int numeroDevolucoes;
    private ArrayList<Produto> produtosDevolvidos = new ArrayList<Produto>();


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
        nota.setProdutos(produtos);
        return produtoDev.getValor();
    }
}
