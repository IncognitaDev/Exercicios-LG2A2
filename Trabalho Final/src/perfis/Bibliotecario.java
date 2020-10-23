package perfis;

import itens.ItemFisico;
import transacao.Emprestimo;

import java.time.LocalDate;


public class Bibliotecario  implements Papel {
    protected static int prazoEntrega;

    public static void setPrazoEntrega(int prazoEntrega){};

    public static int getPrazoEntrega() {
        return prazoEntrega;
    }
}
