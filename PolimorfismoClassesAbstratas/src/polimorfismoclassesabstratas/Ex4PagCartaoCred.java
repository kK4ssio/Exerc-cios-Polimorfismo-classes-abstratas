//Exercicio 4 - Classe PagamentoCartaoCredito
package polimorfismoclassesabstratas;
/**
 * @author Kassio Dias Monteiro
 */
public class Ex4PagCartaoCred extends Ex4Pagamento {
    
    @Override
    public void CalculaValor(){
        System.out.println("Valor da parcela do cartão Calculado! ");
    }
}
