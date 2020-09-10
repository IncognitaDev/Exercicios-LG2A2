public class Livrros {

    private String tituloLivro;
    private int anoLivro;
    private int edicaoLivro;
    private int paginasLivro;
    private long isbnLivro;

    public int consultarLivro(){
        System.out.println("Titulo "+ tituloLivro + " edição " +  edicaoLivro + "ano " + anoLivro + " paginasLivro " + paginasLivro + " isbn " + isbnLivro );
        return 0;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public int getAnoLivro() {
        return anoLivro;
    }

    public void setAnoLivro(int anoLivro) {
        this.anoLivro = anoLivro;
    }

    public int getEdicaoLivro() {
        return edicaoLivro;
    }

    public void setEdicaoLivro(int edicaoLivro) {
        this.edicaoLivro = edicaoLivro;
    }

    public int getPaginasLivro() {
        return paginasLivro;
    }

    public void setPaginasLivro(int paginasLivro) {
        this.paginasLivro = paginasLivro;
    }

    public long getIsbnLivro() {
        return isbnLivro;
    }

    public void setIsbnLivro(long isbnLivro) {
        this.isbnLivro = isbnLivro;
    }
}
