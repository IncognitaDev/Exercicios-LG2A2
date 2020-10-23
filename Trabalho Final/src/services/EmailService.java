package services;

import transacao.Emprestimo;

import java.time.LocalDate;
import java.util.Observable;
import java.util.Observer;

public class EmailService implements Observer {

    @Override
    public void update(Observable empresitmoSubject, Object ob) {

        if(empresitmoSubject instanceof Emprestimo){
            Emprestimo emp =(Emprestimo) empresitmoSubject;
            if(LocalDate.now() == emp.getDataRetirada())
                notificaRetirada(emp);
        }
    }

    public void notificaAtraso(Emprestimo emprestimo){
        String email = emprestimo.getUsuario().getEmail();
        //aqui enviaria o email
    };

    public void notificaRetirada(Emprestimo emprestimo){
        String email = emprestimo.getUsuario().getEmail();
        String content = "Empestimo do " +  emprestimo.getItem().getTitulo() + " efetuado com sucesso! \n Voce deve devolve-lo dia " + emprestimo.getDataLimite() + "\n Boa Leitura";
        //aqui enviaria o email
    };

    public void notificaDevolucao(Emprestimo emprestimo){

        String email = emprestimo.getUsuario().getEmail();
        String content = "o Item " + emprestimo.getItem().getTitulo() + " foi devolvido na data" + emprestimo.getDataEntrega() ;
        //aqui enviaria o email
    };

    public void enviaNoticia(String mensagem){
        //aqui enviaria o email
    };
}