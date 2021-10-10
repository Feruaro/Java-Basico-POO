package aula09;
/**
 * @author Fernanda Ayres Ruaro 
 * @data 22/04/2021
 * @exercício prático sobre encapsulamento e agregação
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    
    //método construtor
    public Pessoa(String n, int id, char s){
        this.setNome(n);
        this.setIdade(id);
        this.setSexo(s);
    }
   
    //métodos acessores
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
    
    //métodos da classe
    public void fazerAniver(){
        this.idade++;
    }
    
}
