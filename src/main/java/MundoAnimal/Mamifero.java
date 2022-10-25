package MundoAnimal;

/**
 *
 * @author arthur.lunkes
 */

public class Mamifero extends Animal {
    
    // Exemplo de polimorfismo de sobreposição
    // Classes diferentes, mesmas assinaturas
    @Override
    void teste(){
        
    }
    
    // Exemplo de polimorfismo de sobrecarga
    // Mesma classe, diferentes assinaturas
    void mama(int teste){
        
    }
    
    // Exemplo de polimorfismo de sobrecarga
    // Mesma classe, diferentes assinaturas
    void mama(boolean teste){
        
    }
    
    @Override
    void mover(){
        
    }
    
}
