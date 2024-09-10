//Exercicio 2 - Classe Cachorro
package polimorfismoclassesabstratas;
/**
 * @author Kassio Dias Monteiro
 */
public class Ex2Cachorro extends Ex2Animal {
    
     @Override
     public void EmitirSom(){
         System.out.println("O cão está latindo");
     }
      @Override
      public void Mover(){
          System.out.println("O cão está se mexendo");
      }
}
