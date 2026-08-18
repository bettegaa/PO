Public Class Consulta {
    Paciente paciente;
    LocalDate data;
    double valor;


    Consulta(Paciente paciente, LocalDate data, double valor) {
        this.paciente = paciente;
        this.data = data;
        this.valor = valor;
    }

    void exibirComprovante() {
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Telefone: " + paciente.telefone);
        System.out.println("Data da consulta: " + data);
        System.out.println("Valor da consulta: " + valor);
    }
}