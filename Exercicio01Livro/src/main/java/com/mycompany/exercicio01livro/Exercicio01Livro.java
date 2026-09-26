package com.mycompany.exercicio01livro;
public class Exercicio01Livro {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("joão silva","123.456.789");
        Medico medico = new Medico("Dra.Ana", "Cardiologia");
        Consulta consulta = new Consulta("20/05/2025", "14:30", paciente, medico);
        consulta.confirmar();
        Agenda agenda = new Agenda();
        agenda.adicionarHorario("14:30");
        agenda.adicionarHorario("15:30");
        medico.visualizarAgenda(agenda);
        paciente.agendarConsulta(consulta);
    }
}
