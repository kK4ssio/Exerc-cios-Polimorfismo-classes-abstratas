//Exercicio 3 - Conta Poupanca
package polimorfismoclassesabstratas;

/**
 * @author Kassio Dias Monteiro
 */
public class Ex3ContaPoupanca extends Ex3ContaBancaria {
    
    @Override
    public void Sacar(){
        System.out.println("Saque da poupança realizado com sucesso! ");
    }
    @Override
    public void Depositar(){
        System.out.println("Deposita da poupança realizado com sucesso! ");
    }
}
