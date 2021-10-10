package aula10;
/**
 * @author Fernanda Ayres Ruaro
 * @data 23/04/2021
 * @exercício prático sobre herança
 */
public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;
    
    /*public Professor(String n, int i, char s, String e, float sa){
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
        this.setEspecialidade(e);
        this.setSalario(sa);       
    }*/

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getSalario() {
        return salario;
    }
    
    public void receberAumento(float aum){
        this.setSalario(this.getSalario() + aum);
    }


}
