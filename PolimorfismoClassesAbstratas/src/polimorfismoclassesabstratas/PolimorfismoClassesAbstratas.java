//Lista de Exercícios Polimorfismo e classes abstratas em Java.
package polimorfismoclassesabstratas;

/**
 * @author Kassio Dias Monteiro.
 */
public class PolimorfismoClassesAbstratas {
    public static void main(String[] args) {
//Exercicio 1
    System.out.println("Exercicio 1");
Ex1FormaGeo retangulo = new Ex1Retangulo(12, 21);
Ex1FormaGeo triangulo = new Ex1Triangulo(5, 3);
    
retangulo.CalcularArea();
triangulo.CalcularArea();
    
System.out.println("===============================================================");
//Exercicio 2
    System.out.println("Exercicio 2");
Ex2Animal gato1 = new Ex2Gato();
Ex2Animal cachorro1 = new Ex2Cachorro();

gato1.EmitirSom();
gato1.Mover();

cachorro1.EmitirSom();
cachorro1.Mover();

System.out.println("===============================================================");
//Exercicio 3
    System.out.println("Exercicio 3");
    
System.out.println("===============================================================");
//Exercicio 4
    System.out.println("Exercicio 4");

System.out.println("===============================================================");
//Exercicio 5
    System.out.println("Exercicio 5");
    }

}
