package aula10;
/**
 * @author Fernanda Ayres Ruaro
 * @data 23/04/2021
 * @exercício prático sobre herança
 */
public class Aluno extends Pessoa {
   
    private int matricula;
    private String curso;
    
    /*public Aluno(String n, int i, char s, int m, String c){
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
        this.setMatricula(m);
        this.setCurso(c);
    }*/

    public void setMatricula(int ma) {
        this.matricula = ma;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setCurso(String c) {
        this.curso = c;
    }
    public String getCurso() {
        return curso;
    }

    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada!");
    }
}
