package itens;

import entidades.Editora;
import perfis.Pessoa;

import java.util.Date;

public class Livro extends ItemFisico{
    protected String isnb;

    public Livro(String titulo, String subtitulo, String assunto, Date ano, Pessoa[] autor, Editora editora, boolean circulacao, String isnb) {
        super(titulo, subtitulo, assunto, ano, autor, editora, circulacao);
        this.isnb = isnb;
    }

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }
}