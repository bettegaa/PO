public class Filme {
    String titulo;
    int duracao;
    double nota;
    boolean assistido;

    void exibirFicha() {
        System.out.println("titulo: " + titulo);
        System.out.println("duracao: " + duracao);
        System.out.println("nota: " + nota);
        System.out.println("Assistido: " + assistido);
    }

    void marcarAssistido() {
        assistido = true;
    }

    void avaliar(double novaNota) {
        nota = novaNota;
    }
}



public class Principal {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.titulo = "Sherek 1";
        f1.duracao = 136;
        f1.nota = 8.7;
        f1.assistido = false;

        Filme f2 = new Filme();
        f2.titulo = "Shrek 2";
        f2.duracao = 90;
        f2.nota = 7.9;
        f2.assistido = false;

        Filme f3 = new Filme();
        f3.titulo = "Sherek 3";
        f3.duracao = 195;
        f3.nota = 7.8;
        f3.assistido = false;

        f1.marcarAssistido();
        f2.avaliar(9.5);

        f1.exibirFicha();
        f2.exibirFicha();
        f3.exibirFicha();
    }
}


