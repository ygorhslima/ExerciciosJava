package com.mycompany.sistemasuporte;

import java.util.Scanner;

public class SistemaSuporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computador computador1 = new Computador("PAT-2026-001", "Dell latitude 5420", "Windows 11", true);
        Computador computador2 = new Computador("PAT-2026-002", "Lenovo ThinkPad", "Windows 10", true);
        
        Tecnico tecnico1 = new TecnicoSoftware("Ana Beatriz", "Desenvolvimento Full Stack");
        Tecnico tecnico2 = new TecnicoHardware("Carlos Eduardo", "Infraestrutura e Redes");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n--- Cadastrando Chamado " + i + " de 3 ---");
            
            int numeroChamado = 0;
            boolean entradaValida = false;
            
            while (!entradaValida) {
                try {
                    System.out.print("Informe o número do chamado (apenas números inteiros): ");
                    numeroChamado = Integer.parseInt(scanner.nextLine());
                    entradaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("[Erro de Segurança] Valor inválido! Por favor, digite apenas números inteiros.");
                }
            }

            System.out.print("Informe a descrição do problema: ");
            String descricao = scanner.nextLine();

            System.out.print("Informe o status do chamado (Ex: Aberto, Em Andamento): ");
            String status = scanner.nextLine();

            // Criando o objeto Chamado (o construtor incrementa automaticamente o atributo estático totalChamados)
            Chamado chamado = new Chamado(numeroChamado, descricao, status);
            
            // Associando os recursos criados anteriormente (alternando entre eles para demonstração)
            if (i % 2 != 0) {
                chamado.setComputador(computador1);
                chamado.setTecnico(tecnico1);
            } else {
                chamado.setComputador(computador2);
                chamado.setTecnico(tecnico2);
            }

            System.out.println("\n-> Resumo do Chamado Cadastrado:");
            chamado.exibirInformacoesChamado();
            System.out.println("----------------------------------------");
        }

        // 3. Apresentando o total de chamados cadastrados ao final usando o método estático
        System.out.println("\n==========================================");
        System.out.println(" RELATÓRIO FINAL DE SEGURANÇA E REGISTRO ");
        System.out.println("Total de chamados cadastrados: " + Chamado.getTotalChamados());
        System.out.println("==========================================");

        scanner.close();
    }
}