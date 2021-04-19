
public class Carro{
    /*
    default=> não é uma palavra reervada. Acessivel pela mesa classe ou mesmo pacote
    public => acessivel pela mesma classe, e onde suas subclasses extendem e todas as outras as demias classes
    private => acessivel somente na classe
    protected => acessivel pela mesma classe, e onde suas subclasses extendem
    */
    
    String marca;
    String modelo;
    int velocidadeMaxima;
    double KmPorLitro;

    void Acelerar(){
        System.out.println("Acelerando ...");
    }

    void Freiar(){
        System.out.println("Freiando ...");
    }

    double CalculaAceleracao(int vFinal, int vInicial, , int tFinal, int tInicial) {
        return (vFinal - vInicial) / (tFinal - tInicial);
    }
    
}
