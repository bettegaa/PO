public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro", "pedro@gmail.com");
        Cliente cliente2 = new Cliente("Jussara", "jus2@gmail.com");
        
}

    Produto   produto1 = new Produto("Camiseta", 50.0);
    Produto   produto2 = new Produto("Calça", 100.0);


    Pedido  pedido1 = new Pedido(cliente1, produto1, 2);
    Pedido  pedido2 = new Pedido(cliente2, produto2, 1);


    pedido1.resumo();
    pedido2.resumo();

}