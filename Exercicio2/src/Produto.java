public class Produto {

    private String name;
    private float valor;

    public Produto(String name, float valor) {
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
