package aula09;
/**
 * @author Fernanda Ayres Ruaro 
 * @data 22/04/2021
 * @exercício prático sobre encapsulamento e agregação
 */
public class Aula09 {
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Fernanda", 21, 'F');
        p[1] = new Pessoa("Ivani", 53, 'F');
        // public Livro(String t, String a, int tot_pag, Pessoa l)
        l[0] = new Livro("As vantagens de ser invisível", "Stephen Chbosky", 224, p[0]);
        l[1] = new Livro("A sutil arte de ligar o f*da-se", "Mark Manson", 224, null);
        l[2] = new Livro("Pense e Enriqueça", "Napoleon Hill", 336, p[1]);
        
        l[0].abrir();
        l[2].abrir();
        l[0].folhear(80);
        System.out.println(l[0].detalhes());
        System.out.println(l[2].detalhes());           
    }   
}
