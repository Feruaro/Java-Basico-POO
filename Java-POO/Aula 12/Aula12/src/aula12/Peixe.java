package aula12;
/**
 * @author Fernanda Ayres Ruaro
 * @data   10/05/2021
 * @aula   Polimorfismo
 */
public class Peixe extends Animais {

    private String corEscama;
    
    public void setCorEscama(String _corEscama){
        this.corEscama = _corEscama;
    }
    public String getCorEscama(){
        return this.corEscama;
    }
    
    public void soltarBolhas(){
        System.out.println("Soltou uma bolha");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }
    
    public void status(){
        System.out.println("----- PEIXE -----");
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da escama: " + this.getCorEscama());
    }
    
}
