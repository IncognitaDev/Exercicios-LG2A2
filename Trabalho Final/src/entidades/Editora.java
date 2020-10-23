package entidades;

public class Editora {
    private String nome;
    private String endereco;
    private String numero;
    private String pais;

    public Editora(String nome, String endereco, String numero, String pais) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}