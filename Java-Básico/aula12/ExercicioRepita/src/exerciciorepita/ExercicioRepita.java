/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // JOptionPane.showMessageDialog(null, "Olá, mundo!", "ERROR 404", JOptionPane.ERROR_MESSAGE); -> caixa de mensagem 
        int n, total = 0, soma = 0;
        int numP = 0, numI = 0;
        int numCem = 0, media = 0;
        do { 
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            total++;              // soma da quantidade de todos os valores 
            if(n % 2 == 0){       // calcula se o numero é par ou impar e coloca na variavel correspondente
               numP++;
            }
            else{
                numI++;
            }
            if(n > 100){          // verificar se o numero é maior que cem, caso seja armazena a quantidade 
                numCem++;
            } 
            soma += n;            // soma todos os valores para utilizar no calculo da media dos valores 
        } while(n!=0);
        media = soma / total;     // calcula a media de todos os numeros informados 
 
        JOptionPane.showMessageDialog(null, 
                "<html>Resultado final <hr>" 
                + "<br>Total de valores: " + total 
                + "<br>Total de pares: " + numP
                + "<br>Total de ímpares: " + numI
                + "<br>Acima de 100: " + numCem
                + "<br>Média dos valores: " + media + "</html>");
        
        
        
        
        
    }
    
}
