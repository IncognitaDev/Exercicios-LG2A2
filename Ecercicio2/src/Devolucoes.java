import java.time.LocalDate;

public class Devolucoes {

    private int numeroDevolucoes;


    public void fazerDevolucao(Nota nota, Produto produto){
        LocalDate data = nota.getData();

        if(verificaData(data)) {
            receberDevolução(nota, produto);
        };
    }

    private boolean verificaData(LocalDate data){
        LocalDate dataAtual =  LocalDate.now();
        LocalDate dataMaxima = data.plusWeeks(1);

        if(dataMaxima.compareTo(dataAtual) > 0){
            return true;
        }
        return  false;
    }

    private void receberDevolução(Nota nota, Produto produto){
        nota.getProdutos();
    }
}
