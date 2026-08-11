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


  public class Produto {
    String nome;
    Double preco;
    int estoque;



    void exibirInfo() {
        System.out.println ("Produto" + nome + "Preço:" + preco);
        System.out.println ("Estoque:" + estoque);
    }


        void vender( int quant) {
            estoque = estoque - quant;
            System.out.println ("Venda realizada, foi reduzido em " + quant + "do estoque" + 
                " O estoque atual é de " + estoque);

            
        }
}
