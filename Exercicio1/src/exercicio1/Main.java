/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author unifmatoliveira
 */
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma das opções de entrada de data :");
        
        System.out.println("1 - Dia - Mês - Ano ");
        
        System.out.println("2 - Nome do Mês - Dia - Ano" );
        
        System.out.println("3 - Dia do ano - Ano ");
        
        int formatoEntrada = scanner.nextInt();
        scanner.nextLine(); // limpando o scanner para não pegar lixo 

        Data data = null; // deixando data vazia

        if (formatoEntrada == 1) {
            System.out.print("Digite o dia:");
            int dia = scanner.nextInt();
            System.out.print("Digite o mês:");
            int mes = scanner.nextInt();
            System.out.print("Digite o ano:");
            int ano = scanner.nextInt();
            data = new Data(dia, mes, ano); // instanciando o objeto e ordenando a data conforme construtor 1
        } else if (formatoEntrada == 2) {
            System.out.print("Digite o nome do mês");
            String nomeMes = scanner.next();
            System.out.print("Digite o dia");
            int dia = scanner.nextInt();
            System.out.print("Digite o ano");
            int ano = scanner.nextInt();
            data = new Data(nomeMes, dia, ano); // instanciando o objeto e ordenando a data conforme construtor 2
        } else if (formatoEntrada == 3) {
            System.out.print("Digite o dia do ano ");
            int diasNoAno = scanner.nextInt();
            System.out.print("Digite o ano ");
            int ano = scanner.nextInt();
            
            data = new Data(diasNoAno, ano); // 
        } else {
            System.out.println("Opção inválida!");
            
            return;
        }

        System.out.println("\nEscolha uma opção de saida de data:");
        System.out.println("1 - MM/DD/YYYY");
        System.out.println("2 - Nome do mês DD, YYYY");
        System.out.println("3 - DDD YYYY");
        int formatoSaida = scanner.nextInt();

        System.out.println("\nData formatada:");
        switch (formatoSaida) {
            case 1:
                System.out.println(data.formatoMMDDYYYY());
                break;
            case 2:
                System.out.println(data.formatoExtenso());
                break;
            case 3:
                System.out.println(data.formatoDDDYYYY());
                break;
            default:
                System.out.println("Opção inválida!");
        }

        
   
     
}
}