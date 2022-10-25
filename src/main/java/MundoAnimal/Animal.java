package MundoAnimal;

/**
 *
 * @author arthur.lunkes
 */

//Exemplo de classe abstrata
public abstract class Animal {
    
    // Exemplo de polimorfismo de sobreposição
    // Classes diferentes, mesmas assinaturas
    void teste(){
        
    }
    
    //Exemplo de método abstrato
    // Não podem ser criados em uma classe concretas, apenas abstratas
    // Não tem corpo{} e precisam ser implementados nas classes filhas
    abstract void mover();
    
}
