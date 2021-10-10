package aula06;
/**
 * @author Fernanda Ayres Ruaro
 * data 19/04/2021
 * Encapsulamento
 */
//Interface
public interface Controlador {
    //definir métodos abstratos
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
