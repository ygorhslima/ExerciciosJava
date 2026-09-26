package com.mycompany.exercicio01livro;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<String> horariosDisponiveis = new ArrayList<>();
    public void adicionarHorario(String horario){
        horariosDisponiveis.add(horario);
    }
    public void mostrarHorariosDisponiveis(){
        for (String horario : horariosDisponiveis){
            System.out.println(horario);
        }
    }
}
