import java.sql.Time;
import java.util.Date;

public class Mensagem {
    private long numeroMensagem;
    private int tipoMensagem;
    private String textoMensagem;
    private Date datamMensagem;
    private Time horaMensagem;
    private Tom tomMensagem;

    public int enviarMensagem(long numeroDestino, String textoMensagem){
        System.out.println("Menssagem " + textoMensagem + " enviada para " + numeroDestino);
        return 0;
    }

    public int receberMensagem(long numeroOrigem, String textoMensagem){
        System.out.println("Menssagem " + textoMensagem + " recebida para " + numeroOrigem);
        return 0;
    }

}