package aula07;
/**
 * @author Fernanda Ayres Ruaro
 * @data 20/04/2021
 * Relacionamento de classes
 */
public interface Luta {
    //Métodos abstratos --> lutador
    public abstract void apresentar();
    public abstract void status();
    public abstract void ganharLuta();
    public abstract void perderLuta();
    public abstract void empatarLuta();
}
