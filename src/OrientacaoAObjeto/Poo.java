
public class Poo{

    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.marca = "Mercedes";
        c1.modelo = "c400";
        c1.velocidadeMaxima = 300;
        c1.KmPorLitro = 11.5;

        System.out.println("Eu tenho um " + c1.marca);
        System.out.println("Aceleracao da " + c1.marca + " : "+ c1.CalculaAceleracao(c1.velocidadeMaxima, 0, 10, 0));
        
    }

}



