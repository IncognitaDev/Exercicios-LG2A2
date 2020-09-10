import java.util.Date;

public class Edicao {
    private int  numeroEdicao;
    private int voluemEdicao;
    private Date dataEdicao;
    private int triagemEdicao;

    public Edicao(int numeroEdicao, int voluemEdicao, Date dataEdicao, int triagemEdicao) {
        this.numeroEdicao = numeroEdicao;
        this.voluemEdicao = voluemEdicao;
        this.dataEdicao = dataEdicao;
        this.triagemEdicao = triagemEdicao;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public int getVoluemEdicao() {
        return voluemEdicao;
    }

    public void setVoluemEdicao(int voluemEdicao) {
        this.voluemEdicao = voluemEdicao;
    }

    public Date getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(Date dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public int getTriagemEdicao() {
        return triagemEdicao;
    }

    public void setTriagemEdicao(int triagemEdicao) {
        this.triagemEdicao = triagemEdicao;
    }
}
