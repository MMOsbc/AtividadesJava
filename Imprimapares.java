/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author unifmatoliveira
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.printf("Digite o número");
        numero = entrada.nextInt();
        System.out.println(numero);
        
        if (numero % 2 == 0)
        {
            System.out.printf("Número par");
        }
        else {
            System.out.printf("Numero Impar");
        }
        
        
        
    }
        

        
        
        
        
        
        
    
    
    }

