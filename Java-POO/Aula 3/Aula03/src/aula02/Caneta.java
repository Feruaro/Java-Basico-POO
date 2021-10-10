
package aula02;

/**
 * @author Fernanda Ayres Ruaro; 
 * @data: 06/04/2021;
 * aula sobre visibilidade: public, private e protected;
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho de ponta: " + this.ponta);
        System.out.println("Possui quanto de carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar() {
        if(!this.tampada){
            System.out.println("Rabiscando\n");
        }
        else {
            System.out.println("Impossível rabiscar, primeiro destampe a caneta!\n");
        }
    }
    
    public void tampar() {
        /*if(!this.tampada){
            this.tampada = true;
            System.out.println("Caneta acaba de ser tampada!");
        }
        else{
            System.out.println("Caneta já está tampada!");
        }*/
        this.tampada = true;
    }
    
    public void destampar() {
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
