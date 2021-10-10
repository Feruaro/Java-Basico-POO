/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fatorial f = new Fatorial();
       // Scanner tec = new Scanner (System.in);
       //System.out.print("Digite um número: ");
       // int num = tec.nextInt();
        f.setValor(5);
        System.out.println(f.getFormula() + f.getFatorial());
    }
    
}
