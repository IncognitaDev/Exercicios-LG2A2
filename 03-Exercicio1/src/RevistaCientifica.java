public class RevistaCientifica {
    private String tituloRevista;
    private long issnRevista;
    private String periodoRevista;

    public RevistaCientifica(String tituloRevista, long issnRevista, String periodoRevista){
        this.tituloRevista = tituloRevista;
        this.issnRevista = issnRevista;
        this.periodoRevista = periodoRevista;
    }

    public String getTituloRevista() {
        return tituloRevista;
    }

    public void setTituloRevista(String tituloRevista) {
        this.tituloRevista = tituloRevista;
    }

    public long getIssnRevista() {
        return issnRevista;
    }

    public void setIssnRevista(long issnRevista) {
        this.issnRevista = issnRevista;
    }

    public String getPeriodoRevista() {
        return periodoRevista;
    }

    public void setPeriodoRevista(String periodoRevista) {
        this.periodoRevista = periodoRevista;
    }
}
