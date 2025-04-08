/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package navio;



// Classe base
class Navio {
    protected int numTripulantes;
    protected String nome;

    public Navio(int numTripulantes, String nome) {
        this.numTripulantes = numTripulantes;
        this.nome = nome;
    }

    public void exibirInfoGeral() {
        System.out.println("Nome: " + nome + ", Tripulantes: " + numTripulantes);
    }
}

// Subclasse de Navio
class NavioMercante extends Navio {
    private double capacidadeCarga;
    private double carga;

    public NavioMercante(int numTripulantes, String nome, double capacidadeCarga, double carga) {
        super(numTripulantes, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    public void carregamento() {
        exibirInfoGeral();
        System.out.println("Volume ocupado: " + (carga / capacidadeCarga));
    }
}


class NavioDeGuerra extends Navio {
    protected double blindagem;
    protected double ataque;

    public NavioDeGuerra(int numTripulantes, String nome, double blindagem, double ataque) {
        super(numTripulantes, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public void poderDeFogo() {
        System.out.println("Poder de Fogo: " + ataque);
    }

    public void exibirArmas() {
        exibirInfoGeral();
        System.out.println("Blindagem: " + blindagem);
        poderDeFogo();
    }
}


class Cruzador extends NavioDeGuerra {
    private int numCanhoes;

    public Cruzador(int numTripulantes, String nome, double blindagem, double ataque, int numCanhoes) {
        super(numTripulantes, nome, blindagem, ataque);
        this.numCanhoes = numCanhoes;
    }

    
    public void poderDeFogo() {
        System.out.println("Poder de Fogo: " + (ataque * Math.sqrt(numCanhoes)));
    }
}

class PortaAvioes extends NavioDeGuerra {
    private int numAvioes;

    public PortaAvioes(int numTripulantes, String nome, double blindagem, double ataque, int numAvioes) {
        super(numTripulantes, nome, blindagem, ataque);
        this.numAvioes = numAvioes;
    }

    
    public void poderDeFogo() {
        System.out.println("Poder de Fogo: " + (ataque * Math.pow(numAvioes, 2)));
    }
}
