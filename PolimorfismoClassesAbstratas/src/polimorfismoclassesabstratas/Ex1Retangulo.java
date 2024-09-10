//Exercicio 1 - Classe Retangulo
package polimorfismoclassesabstratas;
/**
 * @author Kassio Dias Monteiro
 */
public class Ex1Retangulo extends Ex1FormaGeo{
    private int Altura;
    private int Largura;

    public Ex1Retangulo(int Altura, int Largura) {
        this.Altura = Altura;
        this.Largura = Largura;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public int getLargura() {
        return Largura;
    }

    public void setLargura(int Largura) {
        this.Largura = Largura;
    }
 
   @Override
   public void CalcularArea(){
        int AreaRetangulo = Altura * Largura;
        System.out.println("A area do retangulo é: "+AreaRetangulo);
   }
}
