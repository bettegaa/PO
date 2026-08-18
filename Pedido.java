public class Pedido {
    Cliente cliente;
    Produto produto;
    int quantidade;
    
    Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto= produto;
        this.quantidade = quantidade;
    }


    void resumo() {
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Produto: " + produto.nome);
        System.out.println("Valor total: " + produto.preco* quantidade );
    }
}


