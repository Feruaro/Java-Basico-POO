package aula12;
/**
 * @author Fernanda Ayres Ruaro
 * @data   10/05/2021
 * @aula   Polimorfismo
 */
public class Aula12 {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();
        
        m.setCorPelo("Marrom");
        m.setIdade(20);
        m.setMembros(4);
        m.setPeso(180);
        m.status();
        m.alimentar();
        m.emitirSom();
        m.locomover();
        
        k.setCorPelo("Branco");
        k.setIdade(7);
        k.setMembros(4);
        k.setPeso(5);
        k.status();
        k.abanarRabo();
        k.alimentar();
        k.emitirSom();
        k.enterrarOsso();
        k.locomover();
       
        
        
    }
    
}
