package aula13;
/**
 * @author Fernanda Ayres Ruaro
 * @data 16/05/2021
 * @projeto polimofirmo - sobrecarga
 */
public class Mamifero extends Animal {
    
    protected String corPelo;
    
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
   
}
