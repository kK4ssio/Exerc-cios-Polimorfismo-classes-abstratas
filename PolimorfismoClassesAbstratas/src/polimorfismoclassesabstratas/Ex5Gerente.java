//Exercicio 5 - gerente
package polimorfismoclassesabstratas;
/**
 *
 * @author Kassio Dias Monteiro
 */
public class Ex5Gerente extends Ex5Funcionario {
    @Override
    public void CalcSalario(){
        System.out.println("Salario do gerente calculado! ");
    }
}
