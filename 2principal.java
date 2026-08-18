public class Principal {

    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Augusto", "5599322334");
        Consulta consulta1 = new Consulta(paciente1, LocalDate.now(), 500.0);
        consulta1.exibirComprovante();

    }

    Paciente paciente2 = new Paciente("Luquinhas", "5599335567");
    Consulta consulta2 = new Consulta(paciente2, LocalDate.now(), 340.0);
    consulta2.exibirComprovante();
}




