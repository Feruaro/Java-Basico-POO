package aula09;
/**
 * @author Fernanda Ayres Ruaro 
 * @data 22/04/2021
 * @exercício prático sobre encapsulamento e agregação
 */
public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int totalPags;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //métodos construtores
    public Livro(String t, String a, int tot_pag, Pessoa l){
        this.setTitulo(t);
        this.setAutor(a);
        this.setTotalPags(tot_pag);
        this.setLeitor(l);
        this.setAberto(false);
        this.setPagAtual(0);
    }
      
    //métodos acessores
    public void setTitulo(String t){
        this.titulo = t;
    }
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setAutor(String a){
        this.autor = a;
    }
    public String getAutor(){
        return this.autor;
    }
    
    public void setTotalPags(int tot_pag){
        this.totalPags = tot_pag;
    }
    public int getTotalPags(){
        return this.totalPags;
    }
    
    public void setPagAtual(int pag_at){
        this.pagAtual = pag_at;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    
    public void setAberto(boolean ab){
        this.aberto = ab;
    }
    public boolean getAberto(){
        return this.aberto;
    }
    
    public void setLeitor(Pessoa l){
        this.leitor = l;
    }
    public Pessoa getLeitor(){
        return this.leitor;
    }
    
    //métodos da classe 
    public String detalhes() {
        return "\n----- DETALHES DO LIVRO -----\n" + "Título: " + titulo + "\nAutor: " + autor + "\nTotal Páginas: " + totalPags 
                + "\nPágina Atual: " + pagAtual + "\nAberto: " + aberto + "\nLeitor: " + this.getLeitor().getNome() + 
                "\nIdade: " + this.getLeitor().getIdade() + "\nSexo: " + this.getLeitor().getSexo();
    }
   
    @Override
    public void abrir() {
        if(!this.getAberto()){
            this.setAberto(true);
        } else {
            System.out.println("Livro já está aberto!");
        }
    }

    @Override
    public void fechar() {
        if(this.getAberto()){
            this.setAberto(false);
        } else {
            System.out.println("Livro já está fechado!");
        }
    }

    @Override
    public void folhear(int p) {
        if((this.getAberto()) && (p <= this.getTotalPags())){
           this.setPagAtual(p);
        } else {
            System.out.println("Impossível folhear o livro.");
        }
    }

    @Override
    public void avancarPag() {
        if((this.getAberto()) && (this.getPagAtual() < this.getTotalPags())){
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("Impossível passar para próxima página.");
        }
    }

    @Override
    public void voltarPag() {
        if((this.getAberto()) && (this.getPagAtual() > 0) ){
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("Impossível voltar a página.");
        }
    }
    
    
    
}
