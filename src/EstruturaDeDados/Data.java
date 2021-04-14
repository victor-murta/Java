/**
class Data{
    public static void main(String[] args){
        System.out.println("Funcionou");
    }
}
*/

// variáveis primitivas : byte, short, int, short, boolean, long,float, double, char; alocadas em locais diferentes na memória (hip*, stack*, static, code) 
// stack memory: armazena métodos, e variáveis primitivas / alocadas por meio da pilha (first in , first out)
// hip: armazena objetos
// variáveis de referência: referenciam um objeto; Integer
/**
public class Data{
    public static void main(String[] args){
        byte n = 1; // -128 a 32767 (16 bits)
        short n = 12333; // -32768 a 32767 ( 16 bits);
        int n = 231232212; // -2.147.483.648 a 2.147.483.647 ( 32 bits)
        long n = 83443434l ; // 64 bits   l: se a variável ultravassar do taminho int (literal)

        float n = 12.000f; //32 bits
        double n = 100000000.000; // (64 bits)

    }
}
*/

/*
public class Data{
    public static void main(String[] args){
        long var1 = 2147483649l;
        System.out.println("variavel 1: " + var1);
        System.out.println("Confirmacao da variavel 1 " + ((Object)var1).getClass().getSimpleName());

        byte var2 = 120;
        System.out.println("Variavel 2: "+var2);
        System.out.println("Confirmacao da variavel 2 " + ((Object)var2).getClass().getSimpleName());

        short var3 = 150;
        System.out.println("Variavel 3: "+var3);
        System.out.println("Confirmacao da variavel 3 " + ((Object)var3).getClass().getSimpleName());

        String var4 = "Bem vindos Devs!";
        System.out.println("Variavel 4: "+var4);
        System.out.println("Confirmacao da variavel 4 " + ((Object)var4).getClass().getSimpleName());

        int var5 =  0x2202;
        System.out.println("Variavel 5: "+var5);
        System.out.println("Confirmacao da variavel 5 " + ((Object)var5).getClass().getSimpleName());

        float var6 = 99999.987f;
        System.out.println("Variavel 6: "+var6);
        System.out.println("Confirmacao da variavel 6 " + ((Object)var6).getClass().getSimpleName());

    }
    
}*/

// Operadores lógicos ( and , or , xor) / ( &&, || , !=)
//Operadores aritméticos (+,-,*,/,%)






