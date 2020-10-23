package itens;
import entidades.Editora;
import perfis.Pessoa;
import java.util.Date;

public class TrabalhoAcademico extends ItemDigital{
    private Date dataDefesa;
    private String areaConhecimento;
    private Pessoa orientador;
    private String tipo;

    public TrabalhoAcademico(String titulo, String subtitulo, String assunto, Date ano, Pessoa[] autor, Editora editora, String dao, Date dataDefesa, String areaConhecimento, Pessoa orientador, String tipo) {
        super(titulo, subtitulo, assunto, ano, autor, editora, dao);
        this.dataDefesa = dataDefesa;
        this.areaConhecimento = areaConhecimento;
        this.orientador = orientador;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(Date dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public Pessoa getOrientador() {
        return orientador;
    }

    public void setOrientador(Pessoa orientador) {
        this.orientador = orientador;
    }
}