package aula06;
/**
 * @author Fernanda Ayres Ruaro
 * data 19/04/2021
 * Encapsulamento
 */
//Implementação
public class ControleRemoto implements Controlador{
    //definir os atributos da classe
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //definir o método construtor da classe 
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }
    
    //definir os métodos setters e getters 
    private void setVolume(int v){
        this.volume = v;
    }
    private int getVolume(){
        return this.volume;
    }
    
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setTocando(boolean t){
        this.tocando = t;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    
    //métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Tocando: " + this.getTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for(int i=0; i<this.getVolume(); i+=5){
            System.out.print("|");
        } 
        System.out.println("");      
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");      
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume. TV está desligada!!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume. TV está desligada!!");
        }
    }

    @Override
    public void ligarMudo() {
       if(this.getLigado() && this.getVolume() > 0){
           this.setVolume(0);     
       } else {
           System.out.println("Impossível ligar o mudo.");
       }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        } else {
            System.out.println("Impossível desligar o mudo.");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Impossível reproduzir.");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Impossível pausar.");
        }
    }
    
    
    
    
    
    
}
