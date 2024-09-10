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
Ex3ContaBancaria conta1 = new Ex3ContaCorrente();
Ex3ContaBancaria conta2 = new Ex3ContaPoupanca();

conta1.Sacar();
conta1.Depositar();

conta2.Sacar();
conta2.Depositar();
    
System.out.println("===============================================================");
//Exercicio 4
    System.out.println("Exercicio 4");
Ex4Pagamento cartao1 = new Ex4PagCartaoCred();
Ex4Pagamento boleto1 = new Ex4PagamentoBoleto();

cartao1.CalculaValor();
boleto1.CalculaValor();

System.out.println("===============================================================");
//Exercicio 5
    System.out.println("Exercicio 5");
    }

}
