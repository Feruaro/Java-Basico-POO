package aula10;
/**
 * @author Fernanda Ayres Ruaro
 * @data 23/04/2021
 * @exercício prático sobre herança
 */
public class Funcionario extends Pessoa {
    
    private String setor;
    private boolean trabalhando;
    
    /*public Funcionario(String n, int i, char s, String set, boolean t){
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
        this.setSetor(set);
        this.setTrabalhando(t);
    }*/

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }
    
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public boolean getTrabalhando() {
        return trabalhando;
    }
    
    public void mudarTrabalho(){
       this.trabalhando =! this.trabalhando;    //inverter
    }

}
