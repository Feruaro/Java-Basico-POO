package aula06;
/**
 * @author Fernanda Ayres Ruaro
 * @data 19/04/2021
 * Encapsulamento
 */
public class Aula06 {
    public static void main(String[] args) {
        
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        //c.ligarMudo();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}
