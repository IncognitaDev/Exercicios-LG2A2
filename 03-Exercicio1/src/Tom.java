public class Tom {
    private String nomeTom;
    private String arquivoTom;

    public Tom(String nomeTom, String arquivoTom) {
        this.nomeTom = nomeTom;
        this.arquivoTom = arquivoTom;
    }

    public int selecionarTom(){
        System.out.println("Tom " + nomeTom);
        return 0;
    }

    public String  listarTom(){
        String dados = "nome: " + nomeTom + " Arquivo:  " + arquivoTom;
        System.out.println(dados);
        return dados;
    }

    public String getNomeTom() {
        return nomeTom;
    }

    public void setNomeTom(String nomeTom) {
        this.nomeTom = nomeTom;
    }

    public String getArquivoTom() {
        return arquivoTom;
    }

    public void setArquivoTom(String arquivoTom) {
        this.arquivoTom = arquivoTom;
    }
}
