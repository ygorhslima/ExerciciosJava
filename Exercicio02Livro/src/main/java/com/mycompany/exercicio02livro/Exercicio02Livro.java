package com.mycompany.exercicio02livro;
public class Exercicio02Livro {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.atacar();
        jogador.carregarTextura();
        jogador.ganharExperiencia(20);
        jogador.posicaoX = 5;
        jogador.exibirStatus();
    }
}
