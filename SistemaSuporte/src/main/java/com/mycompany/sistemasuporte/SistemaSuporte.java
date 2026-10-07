package com.mycompany.sistemasuporte;

public class SistemaSuporte {
    public static void main(String[] args) {
       Computador computador = new Computador("PAT-2026-001","Dell latitude 5420", "Windows 11", true);
       Tecnico tecnico = new Tecnico("Ygor", "Suporte de TI");
       Chamado chamado = new Chamado(1, "Resolvendo problema de rede", "Em Andamento");
       
       chamado.setComputador(computador);
       chamado.setTecnico(tecnico);
       chamado.exibirInformacoesChamado();
    }
}
