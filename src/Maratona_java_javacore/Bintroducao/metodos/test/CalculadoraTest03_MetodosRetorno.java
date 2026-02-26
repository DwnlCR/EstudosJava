package Maratona_java_javacore.Bintroducao.metodos.test;
import Maratona_java_javacore.Bintroducao.metodos.dominio.Calculadora;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraTest03_MetodosRetorno {
    public static void main(String[] args) {
        //Metodos com Retorno
        Calculadora calculadora = new Calculadora();
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Digite um numero: ");
        double num1 = input.nextDouble();
        System.out.println("Digite outro numero: ");
        double num2 = input.nextDouble();
        double resultadoDaDivisao = calculadora.dividirDoisNumerosComRetorno(num1,num2);
        //*calculadora.dividirDoisNumerosComRetorno(num1,num2);
        //pode ser colocada direto dentro de um sout pois é um metodo que possui retorno*
        System.out.println("Resultado da divisão: "+resultadoDaDivisao);
        calculadora.imprimeDivisaoDeDoisNumeros(num1, num2);
        //*calculadora.imprimeDivisaoDeDoisNumeros(num1, num2);
        //Não pode ser colocado direto em um sout pois é um metodo void sem retorno*
    }
}
