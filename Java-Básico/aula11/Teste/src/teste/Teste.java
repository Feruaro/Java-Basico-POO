/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Dell
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Exercícios da prova da Marinha que tinha duas respostas corretas
        
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";
        
        //c = c + 1; ERRO
        s += 1; // ->> CERTO
        // i += s; ERRO 
        //c += s;  ERRO 
        i += l; // ->> CERTO
        
        
    }
    
}
