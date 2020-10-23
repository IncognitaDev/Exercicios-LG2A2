package itens;
import entidades.Editora;
import perfis.Pessoa;

import java.util.Date;

public class Revista extends ItemFisico{
    private String issn;
    private Date data;

    public Revista(String titulo, String subtitulo, String assunto, Date ano, Pessoa[] autor, Editora editora, boolean circulacao, String issn, Date data) {
        super(titulo, subtitulo, assunto, ano, autor, editora, circulacao);
        this.issn = issn;
        this.data = data;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
