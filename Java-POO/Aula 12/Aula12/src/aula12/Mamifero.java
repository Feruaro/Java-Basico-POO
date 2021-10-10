package aula12;
/**
 * @author Fernanda Ayres Ruaro
 * @data   10/05/2021
 * @aula   Polimorfismo
 */
public class Mamifero extends Animais {

    private String corPelo;
 
    public void setCorPelo(String _corPelo){
        this.corPelo = _corPelo;
    }
    public String getCorPelo(){
       return this.corPelo; 
    }
    
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    
    public void status(){
        System.out.println("----- MAMÍFERO -----");
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor do pelo: " + this.getCorPelo());
    }
    
}
