package itens;

import entidades.Editora;
import perfis.Pessoa;

import java.util.Date;

public class Ebook extends ItemDigital{
    private String isnb;

    public Ebook(String titulo, String subtitulo, String assunto, Date ano, Pessoa[] autor, Editora editora, String dao, String isnb) {
        super(titulo, subtitulo, assunto, ano, autor, editora, dao);
        this.isnb = isnb;
    }

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }
}
