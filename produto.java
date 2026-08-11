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