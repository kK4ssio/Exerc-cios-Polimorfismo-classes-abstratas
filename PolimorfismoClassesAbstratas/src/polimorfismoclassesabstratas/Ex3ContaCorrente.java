//Exercicio 3 - Classe Conta Corrente
package polimorfismoclassesabstratas;

/**
 * @author Kassio Dias Monteiro
 */
public class Ex3ContaCorrente extends Ex3ContaBancaria {
   
    @Override
    public void Sacar(){
        System.out.println("Saque da conta corrente feito com sucesso! ");
    }
    @Override
    public void Depositar(){
        System.out.println("Deposito na conta corrente feito com sucesso! ");
    }
}
