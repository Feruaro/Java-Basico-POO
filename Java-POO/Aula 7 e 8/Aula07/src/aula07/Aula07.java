package aula07;

//import java.util.Random;

/**
 * @author Fernanda Ayres Ruaro
 * @data 20/04/2021
 * Relacionamento de classes
 */
public class Aula07 {
    public static void main(String[] args) {
        
        /*Lutador l1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        //l1.apresentar();
        l1.status();*/
        
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        /*Random n1 = new Random();     //selecionar aleatoriamente os lutadores
        int l1 = n1.nextInt(5);
        Random n2 = new Random();
        int l2 = n2.nextInt(5);*/
        
        Lutar UFC01 = new Lutar();
        UFC01.marcarLuta(l[4], l[5]);
        UFC01.lutar();
        //l[0].status();
        //l[1].status();
    }
    
}
