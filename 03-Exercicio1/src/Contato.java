public class Contato {

    private long numeroContato;
    private String nomeContato;

    public int registarContato(long numeroContato, String nomeContato){
        this.numeroContato = numeroContato;
        this.nomeContato = nomeContato ;
        System.out.println("Contato " + nomeContato + " " +  numeroContato +  "registrado.");
        return 0;
    }

    public String listarContato(){
        String dados = "nome " +  nomeContato + ". NumeroContato " + numeroContato;
        System.out.println(dados);
        return dados;
    }

    public long consultarContato(String nomeContato){
        System.out.println( "O número do contato " + nomeContato +" é " + numeroContato);
        return numeroContato;
    }

    public long getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(long numeroContato) {
        this.numeroContato = numeroContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }
}
