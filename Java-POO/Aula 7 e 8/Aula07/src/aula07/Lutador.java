package aula07;
/**
 * @author Fernanda Ayres Ruaro
 * @data 20/04/2021
 * Relacionamento de classes
 */
public class Lutador implements Luta{
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Método Construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }

    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    
    public void setIdade(int id){
        this.idade = id;
    }
    public int getIdade(){
        return this.idade;
    }
    
    public void setAltura(float al){
        this.altura = al;
    }
    public float getAltura(){
        return this.altura;
    }
    
    public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }
    public float getPeso(){
        return this.peso;
    }
    
    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Médio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }    
    }
    public String getCategoria(){
        return this.categoria;
    }
    
    public void setVitorias(int vit){
        this.vitorias = vit;
    }
    public int getVitorias(){
        return this.vitorias;
    }
    
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    
    public void setEmpates(int em){
        this.empates = em;
    }
    public int getEmpates(){
        return this.empates;
    }

    @Override
    public void apresentar() {
       // System.out.println("-----------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " m" );
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("-----------------------------------------");
    }

    @Override
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.categoria);
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes"); 
        System.out.println("Empatou " + this.getEmpates() + " vezes");
        System.out.println("--------------------------------");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
    
    
    
    
    
    
    
    
}
