package navio;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mathe
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de tripulantes do Navio Mercante:");
        int numTripulantesMercante = scanner.nextInt();
        System.out.println("Digite o nome do Navio Mercante:");
        scanner.nextLine(); // Consumir a quebra de linha
        String nomeMercante = scanner.nextLine();
        System.out.println("Digite a capacidade de carga do Navio Mercante:");
        double capacidadeCarga = scanner.nextDouble();
        System.out.println("Digite a carga do Navio Mercante:");
        double carga = scanner.nextDouble();
        NavioMercante mercante = new NavioMercante(numTripulantesMercante, nomeMercante, capacidadeCarga, carga);

        System.out.println("Digite o número de tripulantes do Navio de Guerra:");
        int numTripulantesGuerra = scanner.nextInt();
        System.out.println("Digite o nome do Navio de Guerra:");
        scanner.nextLine();
        String nomeGuerra = scanner.nextLine();
        System.out.println("Digite a blindagem do Navio de Guerra:");
        double blindagemGuerra = scanner.nextDouble();
        System.out.println("Digite o ataque do Navio de Guerra:");
        double ataqueGuerra = scanner.nextDouble();
        NavioDeGuerra guerra = new NavioDeGuerra(numTripulantesGuerra, nomeGuerra, blindagemGuerra, ataqueGuerra);

        System.out.println("Digite o número de tripulantes do Cruzador:");
        int numTripulantesCruzador = scanner.nextInt();
        System.out.println("Digite o nome do Cruzador:");
        scanner.nextLine();
        String nomeCruzador = scanner.nextLine();
        System.out.println("Digite a blindagem do Cruzador:");
        double blindagemCruzador = scanner.nextDouble();
        System.out.println("Digite o ataque do Cruzador:");
        double ataqueCruzador = scanner.nextDouble();
        System.out.println("Digite o número de canhões do Cruzador:");
        int numCanhoes = scanner.nextInt();
        Cruzador cruzador = new Cruzador(numTripulantesCruzador, nomeCruzador, blindagemCruzador, ataqueCruzador, numCanhoes);

        System.out.println("Digite o número de tripulantes do Porta-Aviões:");
        int numTripulantesPortaAvioes = scanner.nextInt();
        System.out.println("Digite o nome do Porta-Aviões:");
        scanner.nextLine();
        String nomePortaAvioes = scanner.nextLine();
        System.out.println("Digite a blindagem do Porta-Aviões:");
        double blindagemPortaAvioes = scanner.nextDouble();
        System.out.println("Digite o ataque do Porta-Aviões:");
        double ataquePortaAvioes = scanner.nextDouble();
        System.out.println("Digite o número de aviões do Porta-Aviões:");
        int numAvioes = scanner.nextInt();
        PortaAvioes portaAvioes = new PortaAvioes(numTripulantesPortaAvioes, nomePortaAvioes, blindagemPortaAvioes, ataquePortaAvioes, numAvioes);

        System.out.println(" Testando Navio Mercante ");
        mercante.carregamento();
        
        System.out.println("\n Testando Navio de Guerra ");
        guerra.exibirArmas();
        guerra.poderDeFogo();

        System.out.println("\n Testando Cruzador");
        cruzador.exibirArmas();
        cruzador.poderDeFogo();

        System.out.println("\n Testando Porta Aviões ");
        portaAvioes.exibirArmas();
        portaAvioes.poderDeFogo();

        scanner.close();
    


   
    }
}

