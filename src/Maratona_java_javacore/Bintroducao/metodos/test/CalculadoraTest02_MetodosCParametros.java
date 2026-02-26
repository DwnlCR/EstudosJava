package Maratona_java_javacore.Bintroducao.metodos.test;
import Maratona_java_javacore.Bintroducao.metodos.dominio.Calculadora;
import java.util.Locale;
import java.util.Scanner;
public class CalculadoraTest02_MetodosCParametros {
    public static void main(String[] args) {
        //Metodos com parametros
        Calculadora calculadora = new Calculadora();
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Digite um numero: ");
        double num1 = input.nextDouble();
        System.out.println("Digite outro numero: ");
        double num2 = input.nextDouble();
        System.out.println("Escolha uma operação: +, -, *, /");
        String op = input.next();
        //Metodo que concede escolha de operação ao usuario
        //e engloba os outros metodos ja criados
        //usando "argumentos" que sao os parametros pedidos pelo metodo no dominio
        calculadora.calcular(num1, num2, op);
    }
}


