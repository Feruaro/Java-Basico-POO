
package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //o Java não tem comando de entrada de dados, então precisa criar um objeto pra isso 
        //Scanner é a lib de entrada de dados --> System.in
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        // no Java na variavel float é necessário colocar o f depois do número
        System.out.format("A nota de %s é %.1f\n", nome, nota );
        /*if(nota>=7.0){
            System.out.printf("%s está APROVADO!\n", nome);
        }
        else{
            System.out.printf("%s está REPROVADO!\n", nome);
        }*/
    }   
}
