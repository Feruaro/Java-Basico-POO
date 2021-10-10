package aula13;
/**
 * @author Fernanda Ayres Ruaro
 * @data 16/05/2021
 * @projeto polimofirmo - sobrecarga
 */
public class Cachorro extends Lobo {
   
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    public void reagir(String frase){
        
        if(frase.equals("Toma comida") || frase.equals("Olá")){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min){
        
        if( hora < 12){         //manhã
            System.out.println("Abanar");
        } else if(hora >= 18){   //noite
            System.out.println("Ignorar");
        } else {                //tarde
            System.out.println("Abanar e Latir");
        }
    }
    
    public void reagir(boolean dono){
        
        if(dono){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
        }
    }
    
    public void reagir(int idade, float peso){
        
        if(idade < 5){
            if(peso < 10){
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if(peso > 10){
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }        
    }
    
}
