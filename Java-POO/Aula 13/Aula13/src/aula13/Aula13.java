package aula13;
/**
 * @author Fernanda Ayres Ruaro
 * @data 16/05/2021
 * @projeto polimofirmo - sobrecarga
 */
public class Aula13 {

    public static void main(String[] args) {
        
        //Mamifero m = new Mamifero();
        //Lobo l = new Lobo();
        Cachorro c = new Cachorro();
      
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(true);
        c.reagir(false);
        c.reagir(10, 00);
        c.reagir(18, 30);
        c.reagir(15, 00);
        c.reagir(4, 20.0f);
        c.reagir(13, 4.3f);
        
    }
    
}
