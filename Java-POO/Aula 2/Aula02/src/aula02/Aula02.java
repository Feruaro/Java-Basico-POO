
package aula02;

/**
 * @author Fernanda Ayres Ruaro
 * data: 02/04/2021
 */
public class Aula02 {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Rosa";
        c1.ponta = 0.7f;
        c1.carga = 50;
        //c1.tampada = false;
        c1.tampar();          
        c1.status();
        c1.rabiscar();
              
        Caneta c2 = new Caneta();
        c2.modelo = "Fefe";
        c2.cor = "Laranja";
        c2.carga = 70;
        c2.ponta = 0.5f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
        
        
        
        
        
    }
    
}
