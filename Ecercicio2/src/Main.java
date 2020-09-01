import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        Produto p1 = new Produto("Leite", 3.50f);
        Produto p2 = new Produto("Café", 9.50f);
        Caixa c1 = new Caixa();
        Devolucoes d1 = new Devolucoes();

        Pessoa per1 = new Pessoa("Luis", "123456", 50.30f);

        per1.pegarCarrinho();
        per1.pegarProduto(p1);
        per1.pegarProduto(p2);
        System.out.println(per1.getDinheiro());
        per1.passarNoCaixa(c1);
        System.out.println(per1.getDinheiro());
        per1.devolverProduto(d1,p1,0);
        System.out.println(per1.getDinheiro());


    }
}
