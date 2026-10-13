package com.mycompany.sistemasuporte;
public class TecnicoHardware extends Tecnico{
    
    public TecnicoHardware(String nome, String especialidade) {
        super(nome, especialidade);
    }

   @Override
    public void realizarAtendimento() {
        System.out.println("Técnico de Hardware " + getNome() + " está realizando manutenção física, limpeza e troca de componentes.");
    }
}
