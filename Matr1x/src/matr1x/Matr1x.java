/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matr1x;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Matr1x {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<IAgente> agentes = new ArrayList<>();
        Random random = new Random();

        System.out.println("Matrix é um grande sistema orientado a objetos, onde as pessoas são objetos de classes que implementam a interface IAgente.");
// MENU DE OPCAOES, OOP 
        while (true) {
            System.out.println("\n TABELA DE OPCOES:");
            
            System.out.println("1 - CADASTRAR EMPRESARIO");
            
            System.out.println("2 - CADASTRAR PROFESSOR");
            
            System.out.println("3 - CRADASTRAR ADVOGADO");
            
            System.out.println("4 - LISTAR CADASTROS");
            
            System.out.println("5 - TRANSFORMAR AGENTE");
            
            System.out.println("6 - SAIR");
            
            System.out.print("ESCOLHA UMA OPCAO : ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                
                case 1 -> {
                    System.out.print("NOME DO EMPRESARIO: ");
                    String nomeEmp = scanner.nextLine();
                    System.out.print("EMPRESA: ");
                    String empresa = scanner.nextLine();
                    agentes.add(new Empresario(nomeEmp, empresa));
                }
                
                case 2 -> {
                    System.out.print("NOME DO PROFESSOR ");
                    String nomeProf = scanner.nextLine();
                    System.out.print("ESCOLA: ");
                    String escola = scanner.nextLine();
                    agentes.add(new Professor(nomeProf, escola));
                }
                
                case 3 -> {
                    System.out.print("NOME DO ADVOGADO");
                    String nomeAdv = scanner.nextLine();
                    System.out.print("OAB: ");
                    String oab = scanner.nextLine();
                    agentes.add(new Advogado(nomeAdv, oab));
                }
                
                case 4 -> {
                    for (IAgente agente : agentes) {
                        agente.apresentacao();
                    }
                }
                
                case 5 -> {
                    if (!agentes.isEmpty()) {
                        int numAgentes = random.nextInt(agentes.size()) + 1;
                        for (int i = 0; i < numAgentes; i++) {
                            int index = random.nextInt(agentes.size());
                            agentes.get(index).modo_agente_on();
                        }
                    } else {
                        System.out.println("NAO POSSUI CADASTROS PARA SER AGENTE");
                    }
                }
                
                case 6 -> {
                    System.out.println("vOCE ESCOLHEU SAIR DO PROGRAMA");
                    scanner.close();
                    return;
                }
                default -> System.out.println("NAO POSSUI ESSA OPCAO ");
            }
        }
    }
}