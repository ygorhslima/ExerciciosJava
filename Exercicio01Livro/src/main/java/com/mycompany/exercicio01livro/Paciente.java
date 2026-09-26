package com.mycompany.exercicio01livro;
public class Paciente {
    private String nome;
    private String cpf;
  
    public Paciente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

 
    public void agendarConsulta(Consulta consulta){
        System.out.println("Consulta agendada para o paciente" + nome);
    }
}
