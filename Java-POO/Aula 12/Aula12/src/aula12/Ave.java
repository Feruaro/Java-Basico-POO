package aula12;
/**
 * @author Fernanda Ayres Ruaro
 * @data   10/05/2021
 * @aula   Polimorfismo
 */
public class Ave extends Animais {

    private String corPena;
    
    public void setCorPena(String _corPena){
        this.corPena = _corPena;
    }
    public String getCorPena(){
        return this.corPena;
    }
    
    public void fazerNinho(){
        System.out.println("Costruiu um ninho");
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    
    public void status(){
        System.out.println("----- AVE -----");
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da pena: " + this.getCorPena());
    }
    
}
