package com.mycompany.sistemasuporte;
public class TecnicoSoftware extends Tecnico{
    
    public TecnicoSoftware(String nome, String especialidade) {
        super(nome, especialidade);
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Técnico de Software " + getNome() + " está analisando código, corrigindo bugs e atualizando sistemas.");
    }
}
