package aula12;
/**
 * @author Fernanda Ayres Ruaro
 * @data   10/05/2021
 * @aula   Polimorfismo
 */
public abstract class Animais {
    
    protected float peso;
    protected int idade;
    protected int membros;
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public void setPeso(float _peso) {
        this.peso = _peso;
    }
    public float getPeso() {
        return peso;
    }

    public void setIdade(int _idade) {
        this.idade = _idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setMembros(int _membros) {
        this.membros = _membros;
    }
    public int getMembros() {
        return membros;
    }
    
   
    
}
