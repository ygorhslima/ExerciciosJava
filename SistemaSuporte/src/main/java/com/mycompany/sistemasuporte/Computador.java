package com.mycompany.sistemasuporte;
public class Computador {
    private String patrimonio;
    private String modelo;
    private String sistemaOperacional;
    private boolean ligado;

    public Computador(String patrimonio, String modelo, String sistemaOperacional, boolean ligado) {
        this.patrimonio = patrimonio;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.ligado = ligado;
    }

    
    
    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public void ligar(){
        this.ligado = true;
    }
    
    public void desligar(){
        this.ligado = false;
    }
    
    public void exibirInformacoes(){
        System.out.println("Patrimônio: " + this.patrimonio);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Sistema Operacional: " + this.sistemaOperacional);
        System.out.println("está ligado?: " + (this.ligado ? "sim":"não"));        
    }
}
