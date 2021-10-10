
package aula02;

/**
 * @author Fernanda Ayres Ruaro;
 * data: 06/04/2021;
 * aula sobre visibilidade: public, private e protected;
 */
public class Aula02 {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Rosa";
        //c1.ponta = 0.5f;
        c1.carga = 70;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
    
    }
    
}
