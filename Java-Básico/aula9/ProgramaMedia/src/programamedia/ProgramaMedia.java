/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // JAVA não tem método de leitura, então precisamos criar um objeto da classe Scanner 
        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.print("Primeira nota:");
        float n2 = teclado.nextFloat();
        float m = (n1+n2) / 2;
        System.out.format("A média entre %.2f e %.2f é: %.2f \n", n1, n2, m);
        if(m>9){
            System.out.println("Parabéns!!!!!\n");
        }*/
        
        Scanner recebe = new Scanner(System.in);
        System.out.println("Em que ano você nasceu? ");
        int ano = recebe.nextInt();
        int idade = 2021 - ano;
        
        if(idade<18){
            System.out.println("Menor de idade");
        }
        else{
            System.out.println("Maior de idade");
        }
        
        
    }
    
}
