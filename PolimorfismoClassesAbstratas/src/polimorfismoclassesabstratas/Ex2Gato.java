//Exercicio 2 - Classe Gato.
package polimorfismoclassesabstratas;

/**
 * @author Kassio Dias Monteiro
 */
public class Ex2Gato extends Ex2Animal {
    
     @Override
     public void EmitirSom(){
         System.out.println("O gato Mia");
     }
      @Override
      public void Mover(){
          System.out.println("o Gato está se mexendo");
      }
}
