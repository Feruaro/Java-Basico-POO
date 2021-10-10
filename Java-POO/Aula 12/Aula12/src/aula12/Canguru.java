package aula12;
/**
 * @author Fernanda Ayres Ruaro
 * @data   10/05/2021
 * @aula   Polimorfismo
 */
public class Canguru extends Mamifero {
   
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
