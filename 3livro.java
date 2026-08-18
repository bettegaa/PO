Public Class Livro {
    String Titulo;
    Autor autor;
    LocalDate dataPublicacao;
    Boolean emprestado;



    Livro(String Titulo, Autor autor, LocalDate dataPublicacao, Boolean emprestado) {
        this Titulo = Titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.emprestado = emprestado;
    }

    void exibirFicha() {
        System.out.println("Titulo: " + Titulo);
        System.out.println("Autor: " + autor.nome);
        System.out.println("Data de publicação: " + dataPublicacao);
    }

    void emprestar() {
        if (emprestado) {
            System.out.println("O livro já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso.");
        }
    }

}