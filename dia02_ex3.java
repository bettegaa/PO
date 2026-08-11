public class ContaBancaria {
    String nome;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("nao tem saldo");
        }
    }

    void exibirSaldo() {
        System.out.println("nome: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}


public class Principal {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.nome = "Joao";
        c1.saldo = 500.0;

        ContaBancaria c2 = new ContaBancaria();
        c2.nome = "Maria";
        c2.saldo = 1000.0;

        c1.depositar(200.0);
        c1.sacar(100.0);

        c2.sacar(1500.0);
        c2.depositar(300.0);

        c1.exibirSaldo();
        c2.exibirSaldo();
    }
}



