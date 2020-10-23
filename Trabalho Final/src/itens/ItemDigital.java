package itens;

import entidades.Editora;
import perfis.Pessoa;

import java.util.Date;

public abstract class ItemDigital  extends  Item{

    protected String dao;

    public ItemDigital(String titulo, String subtitulo, String assunto, Date ano, Pessoa[] autor, Editora editora, String dao) {
        super(titulo, subtitulo, assunto, ano, autor, editora);
        this.dao = dao;
    }

    public String getDao() {
        return dao;
    }

    public void setDao(String dao) {
        this.dao = dao;
    }
}
