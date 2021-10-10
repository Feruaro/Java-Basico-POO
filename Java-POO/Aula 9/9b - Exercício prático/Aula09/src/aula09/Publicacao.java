package aula09;
/**
 * @author Fernanda Ayres Ruaro 
 * @data 22/04/2021
 * @exercício prático sobre encapsulamento e agregação
 */
public interface Publicacao {
    
    public void abrir();
    public void fechar();
    public void folhear(int p); //folhear até determinada página
    public void avancarPag();
    public void voltarPag();
}
