package com.mycompany.sistemasuporte;
public class Chamado {
    private int numero;
    private String descricao;
    private String status;
    private Computador computador;
    private Tecnico tecnico;
    
    // criando o atributo estático para o total de chamados
    private static int totalChamados = 0;

    public Chamado(int numero, String descricao, String status) {
        this.numero = numero;
        this.descricao = descricao;
        this.status = status;
        // toda vez que um chamado for criado, será incrementado mais um na variável
        totalChamados++;
    }
    
    
    // Método estático para retornar o total de chamados
    public static int getTotalChamados() {
        return totalChamados;
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
        if(this.computador != null){
            this.computador.exibirInformacoes();
        }
        
        System.out.println("------------  INFORMAÇÕES DO TÉCNICO    ---------------");
        if(this.tecnico != null){
            this.tecnico.exibirInformacoes();
        }
    }
    
}
