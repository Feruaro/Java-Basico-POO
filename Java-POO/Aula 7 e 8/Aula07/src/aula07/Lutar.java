package aula07;

import java.util.Random;

/**
 * @author Fernanda Ayres Ruaro
 * @data 20/04/2021
 * Relacionamento de classes
 */

    //                   REGRAS DA LUTA: 
    //1) Só pode ser marcada entre lutadores da mesma categoria
    //2) Desafiado e desafiante devem ser lutadores diferentes
    //3) Só pode acontecer se estiver aprovada
    //4) Só pode ter como resultado vitória de um dos jogares ou empate

public class Lutar {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
      
    public void setDesafiado(Lutador d){
        this.desafiado = d;
    }
    public Lutador getDesafiado(){
        return this.desafiado;
    }
    
    public void setDesafiante(Lutador de){
        this.desafiante = de;
    }
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    
    public void setRounds(int r){
        this.rounds = r;
    }
    public int getRounds(){
        return this.rounds;
    }
    
    public void setAprovada(boolean a){
        this.aprovada = a;
    }
    public boolean getAprovada(){
        return this.aprovada;
    }
           
    public void marcarLuta(Lutador l1, Lutador l2) {
        
        if((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
           this.setAprovada(true);
           this.setDesafiante(l1);
           this.setDesafiado(l2);           
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }       
    }

    public void lutar() {
        
        double ale = Math.random();
        //vitL1 --> desafiante / vitL2 --> desafiado;
        int r, vit, vitL1 = 0, vitL2 = 0;
        
        if(this.getAprovada()){
            System.out.println("##### DESAFIADO #####");
            this.getDesafiado().apresentar();
            System.out.println("##### DESAFIANTE #####");
            this.getDesafiante().apresentar();
            
            r = (int) (1 + ale * (10 - 1));   //número de rounds gerado aleatoriamente entre 1 e 10;
            this.setRounds(r);
          
            for(int i=0; i<this.getRounds(); i++){
                System.out.println("----- ROUND " + (i+1) + " -----");                
                Random v = new Random();
                vit = v.nextInt(3);
                switch(vit){
                    case 0: //empate
                        System.out.println("Resultado Round " + (i+1) + ": Empate");
                        break;
                    case 1: //desafiante ganha
                        System.out.println("Resultado Round " + (i+1) + ": " + this.getDesafiante().getNome() + " ganhou!");
                        vitL1++;
                        break;
                    case 2: //desafiado ganha
                        System.out.println("Resultado Round " + (i+1) + ": " + this.getDesafiado().getNome() + " ganhou!");
                        vitL2++;
                        break;
                }
            }
            
            System.out.println("===== RESULTADO DA LUTA =====");
            if(vitL1 > vitL2){  //desafiante ganhou;
                System.out.println("Vitória do " + this.getDesafiante().getNome());
                this.getDesafiante().ganharLuta();
                this.getDesafiado().perderLuta();
            } else if(vitL1 < vitL2){   //desafiado ganhou;
                System.out.println("Vitória do " + this.getDesafiado().getNome());
                this.getDesafiante().perderLuta();
                this.getDesafiado().ganharLuta();
            } else {    //empate 
                System.out.println(this.getDesafiado().getNome() + " e " + this.getDesafiante().getNome() + " empataram!");
                this.getDesafiante().empatarLuta();
                this.getDesafiado().empatarLuta();
            }
            System.out.println("=============================");
        } else {
            System.out.println("Esta luta não pode acontecer!");
        }
    }
   
}
