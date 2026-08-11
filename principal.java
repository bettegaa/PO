public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Camiseta";
        p1.preco = 29.90;
        p1.estoque = 10;

        p1.exibirInfo();
        p1.vender(3);
        p1.exibirInfo();
    }

}