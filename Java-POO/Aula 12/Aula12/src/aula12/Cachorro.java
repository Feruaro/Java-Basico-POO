package aula12;
/**
 * @author Fernanda Ayres Ruaro
 * @data   10/05/2021
 * @aula   Polimorfismo
 */
public class Cachorro extends Mamifero {
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando Osso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
}
