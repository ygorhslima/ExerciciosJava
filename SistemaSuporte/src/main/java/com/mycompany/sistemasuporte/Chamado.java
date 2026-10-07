package com.mycompany.sistemasuporte;
public class Chamado {
    private int numero;
    private String descricao;
    private String status;
    private Computador computador;
    private Tecnico tecnico;

    public Chamado(int numero, String descricao, String status) {
        this.numero = numero;
        this.descricao = descricao;
        this.status = status;
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    public void exibirInformacoesChamado(){
        System.out.println("Numero: " + this.numero);
        System.out.println("descricao: " + this.descricao);
        System.out.println("status: " + this.status);
        System.out.println("------------ INFORMAÇÕES DO COMPUTADOR ---------------");
        this.computador.exibirInformacoes();
        System.out.println("------------  INFORMAÇÕES DO TÉCNICO    ---------------");
        this.tecnico.exibirInformacoes();
    }
    
}
