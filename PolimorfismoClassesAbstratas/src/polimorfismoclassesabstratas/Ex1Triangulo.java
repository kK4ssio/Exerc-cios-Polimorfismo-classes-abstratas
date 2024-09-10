//Exercicio1 - Classe Triangulo
package polimorfismoclassesabstratas;
/**
 *
 * @author Kassio Dias Monteiro
 */
public class Ex1Triangulo extends Ex1FormaGeo {
    private int L1, L2;

    public int getL1() {
        return L1;
    }

    public void setL1(int L1) {
        this.L1 = L1;
    }

    public int getL2() {
        return L2;
    }

    public void setL2(int L2) {
        this.L2 = L2;
    }

    public Ex1Triangulo(int L1, int L2) {
        this.L1 = L1;
        this.L2 = L2;
    }
    @Override
    public void CalcularArea(){
       int AreaTriangulo = ( L1 * L2 ) / 2;
        System.out.println("A area do triangulo é: "+AreaTriangulo );
    }
}
