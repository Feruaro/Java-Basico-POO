package aula12;
/**
 * @author Fernanda Ayres Ruaro
 * @data   10/05/2021
 * @aula   Polimorfismo
 */
public class Reptil extends Animais {

    private String corEscama;
    
    public void setCorEscama(String _corEscama){
        this.corEscama = _corEscama;
    }
    public String getCorEscama(){
        return this.corEscama;
    }
    
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo plantas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
    
    public void status(){
        System.out.println("----- RÉPTIL -----");
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da escama: " + this.getCorEscama());
    }
    
}
