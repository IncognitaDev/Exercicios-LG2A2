package transacao;

import java.time.LocalDate;
import perfis.Usuario;

public class Reserva {
    private LocalDate dataRetirada;
    private Usuario usuario;

    public Reserva(LocalDate dataRetirada, Usuario usuario) {
        this.dataRetirada = dataRetirada;
        this.usuario = usuario;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}