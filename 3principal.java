Public Class Principal {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Augusto", "Brasileiro");
        Autor autor2 = new Autor("Luquinhas", "Brasileiro");

        Livro livro1 = new Livro("Java Skills", autor1, LocalDate.of(2023, 6, 15), false);

        Livro livro2 = new Livro("Python Skills", autor1, LocalDate.of(2023, 6, 15), false);

        Livro livro3 = new Livro("Java Skills", autor2, LocalDate.of(2023, 6, 15), false);


        livro1.exibirFicha();
        livro2.exibirFicha();
        livro3.exibirFicha(); 
        livro3.emprestar():

    }


}


