package transacao;

import java.time.LocalDate;
import java.util.Observable;
import itens.ItemFisico;
import perfis.Usuario;

public class Emprestimo extends Observable {

    private ItemFisico item;
    private Usuario usuario;
    private final LocalDate dataRetirada;
    private LocalDate dataLimite;
    private LocalDate dataEntrega;

    public Emprestimo(LocalDate dataRetirada, ItemFisico item, Usuario usuario ) {

        this.usuario = usuario;
        this.dataRetirada = dataRetirada;
        this.item = item;
        setChanged();
        notifyObservers();
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ItemFisico getItem() {
        return item;
    }

    public void setItem(ItemFisico item) {
        this.item = item;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
        setChanged();
        notifyObservers();
    }
}
  