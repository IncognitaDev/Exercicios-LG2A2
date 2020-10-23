package itens;
import entidades.Editora;
import perfis.Pessoa;

import java.util.Date;

public class Artigo extends TrabalhoAcademico {
    private Date dataAceitacao;

    public Artigo(String titulo, String subtitulo, String assunto, Date ano, Pessoa[] autor, Editora editora, String dao, Date dataDefesa, String areaConhecimento, Pessoa orientador, String tipo, Date dataAceitacao) {
        super(titulo, subtitulo, assunto, ano, autor, editora, dao, dataDefesa, areaConhecimento, orientador, tipo);
        this.dataAceitacao = dataAceitacao;
    }

    public Date getDataAceitacao() {
        return dataAceitacao;
    }

    public void setDataAceitacao(Date dataAceitacao) {
        this.dataAceitacao = dataAceitacao;
    }
}