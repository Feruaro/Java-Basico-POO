/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;


/**
 *
 * @author Dell
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* // VETOR 01:
        
        int n[] = {3,2,8,7,5,4};  
        //System.out.println("Total de casas de N: " + n.length);
        for(int i=0; i<n.length; i++){
            System.out.println("Vetor " + i + " é: " + n[i]);
        } */
       
        /* // VETOR 02:
        
        // imprimir mes e qntd total de dias no mes 
        
        String nomeMes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                           "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int totalMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for(int i=0; i<nomeMes.length; i++){            
            System.out.println("O mês de " + nomeMes[i] + " tem " + totalMes[i] + " dias!");           
        } */
        
        /* // VETOR 03:
        
        double v[] = {3.5, -5, 6.25, -7.8};
        Arrays.sort(v);
        for(double valor: v){
            System.out.print(valor + " ");
        } */
     
        
        /* // VETOR 04:
        int v[] = {3,7,4,6,8,54};
        
        
        for(int valor: v){
            System.out.print(valor + " ");
        }
        System.out.println(" ");
        int p = Arrays.binarySearch(v, 8);
        System.out.println("Encontrei o valor na posição: " + p);
        */
        
        // VETOR 05:
        int num[] = new int[20];
        Arrays.fill(num, 0);
        for(int valor: num){
            System.out.format("%d ", valor);
        }
        
        
    }
    
}
