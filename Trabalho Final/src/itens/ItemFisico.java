package itens;

import entidades.Editora;
import perfis.Pessoa;
import perfis.Usuario;
import transacao.Emprestimo;
import transacao.Reserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public abstract class ItemFisico extends Item{
    protected Reserva reserva;
    protected boolean circulacao = false;
    protected boolean disponivel = false;
    protected ArrayList<Emprestimo> emprestimo = new ArrayList<Emprestimo>();

    public ItemFisico(String titulo, String subtitulo, String assunto, Date ano, Pessoa[] autor, Editora editora, boolean circulacao) {
        super(titulo, subtitulo, assunto, ano, autor, editora);
        this.reserva = null;
    }

    public void criarReserva(LocalDate data, Usuario usuario){
        this.reserva = new Reserva(data, usuario);
        this.disponivel = false;
    }

    public void removerReserva(){
        setReserva(null);
        setDisponivel(true);
    }

    public void registartDevolucao(){
        Emprestimo emp = this.getUltimoEmprestimo();
        LocalDate data = LocalDate.now();
        emp.setDataEntrega(data);
        this.setDisponivel(true);
    }

    public void criarEmpestimo(Usuario usuario){
        LocalDate data = LocalDate.now();
        Emprestimo emp = new Emprestimo(data,this,usuario);
    }

    public void liberarCirculacao(){
        setCirculacao(true);
    }
    public void restringirCirculacao(){
        setCirculacao(false);
        setDisponivel(false);
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public void setCirculacao(boolean circulacao) {
        this.circulacao = circulacao;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Emprestimo getUltimoEmprestimo(){
        int tam = emprestimo.size();
        return emprestimo.get(tam-1);
    }

}
