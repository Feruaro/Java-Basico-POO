
package aula02;

/**
 * @author Fernanda Ayres Ruaro 
 * @data: 02/04/2021
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho de ponta: " + this.ponta);
        System.out.println("Possui quanto de carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    void rabiscar() {
        if(!this.tampada){
            System.out.println("Rabiscando\n");
        }
        else {
            System.out.println("Impossível rabiscar, primeiro destampe a caneta!\n");
        }
    }
    
    void tampar() {
        /*if(!this.tampada){
            this.tampada = true;
            System.out.println("Caneta acaba de ser tampada!");
        }
        else{
            System.out.println("Caneta já está tampada!");
        }*/
        this.tampada = true;
    }
    
    void destampar() {
       /* if(this.tampada){
            this.tampada = false;
            System.out.println("Caneta acaba de ser destampada!");
        }
        else {
            System.out.println("Caneta já está destampada!");
        }  */
        this.tampada = false;    
    }
        
    
}
