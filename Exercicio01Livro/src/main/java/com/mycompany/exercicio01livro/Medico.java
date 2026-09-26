package com.mycompany.exercicio01livro;
public class Medico {
    private String nome;
    private String especialidade;
    
    public Medico(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void visualizarAgenda(Agenda agenda){
        System.out.println("Agenda do Dr. " + nome + ":");
        agenda.mostrarHorariosDisponiveis();
    }
    public String getNome(){
        return nome;
    }
}
