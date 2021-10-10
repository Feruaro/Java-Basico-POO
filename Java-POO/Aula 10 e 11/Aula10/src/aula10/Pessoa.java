package aula10;
/**
 * @author Fernanda Ayres Ruaro
 * @data 23/04/2021
 * @exercício prático sobre herança
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    public int getIdade(){
        return this.idade;
    }
    
    public void setSexo(char s){
        this.sexo = s;
    }
    public char getSexo(){
        return this.sexo;
    }
    
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }  
    
}
