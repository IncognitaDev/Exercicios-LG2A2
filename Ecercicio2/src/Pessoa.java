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

    public void PassarNoCaixa(Carrinho carrinho, Caixa caixa){
        if(carrinho.getValorTotal() < this.dinheiro){
            notas.add(caixa.efetuarVenda(carrinho));
        }
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
