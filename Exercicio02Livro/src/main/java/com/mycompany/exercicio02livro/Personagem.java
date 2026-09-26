package com.mycompany.exercicio02livro;
public class Personagem {
    private int energia = 100;
    int posicaoX = 0;
    protected int experiencia = 0;
    
    public void atacar(){
        System.out.println("O personagem atacou!");
        energia -= 10;
    }
    
    protected void ganharExperiencia(int pontos){
        experiencia += pontos;
        System.out.println("Ganhou " + pontos + " pontos de experiência");
    }
    
    void carregarTextura(){
        System.out.println("Textura carregada com sucesso");
    }
    
    private void regenerarEnergia(){
        energia = 100;
        System.out.println("Energia regenerada");
    }
    
    public void exibirStatus(){
        System.out.printf("Energia: %d\n", energia);
        System.out.printf("Experiência: %d\n",experiencia);
    }
}
