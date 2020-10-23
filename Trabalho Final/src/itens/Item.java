package itens;

import java.util.Date;
import perfis.Pessoa;
import entidades.Editora;

public abstract class Item {
    protected String titulo;
    protected String subtitulo;
    protected String registro;
    protected String assunto;
    protected Date ano;
    protected Pessoa[] autor;
    protected Editora editora;

    public Item(String titulo, String subtitulo, String assunto, Date ano, Pessoa[] autor, Editora editora) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.assunto = assunto;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public Pessoa[] getAutor() {
        return autor;
    }

    public void setAutor(Pessoa[] autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
