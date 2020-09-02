import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Produto p1 = new Produto("Leite", 3.50f);
        Produto p2 = new Produto("Café", 9.50f);
        ArrayList<Produto> prod1 = new ArrayList<Produto>();
        prod1.add(p1);
        prod1.add(p2);
        Estoque e1 = new Estoque(prod1);
        Caixa c1 = new Caixa();
        Devolucoes d1 = new Devolucoes(e1);

        Cliente per1 = new Cliente("Luis", "123456", 50.30f);

        e1.adicionarProduto(p1);
        e1.adicionarProduto(p2);

        per1.pegarProduto(p1, e1);
        per1.pegarProduto(p2, e1);
        System.out.println(per1.getDinheiro());
        per1.passarNoCaixa(c1);
        System.out.println(per1.getDinheiro());
        per1.devolverProduto(d1,p1,0);
        System.out.println(per1.getDinheiro());


    }
}
