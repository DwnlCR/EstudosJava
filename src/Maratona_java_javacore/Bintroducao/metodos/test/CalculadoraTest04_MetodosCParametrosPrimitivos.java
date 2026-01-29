package Maratona_java_javacore.Bintroducao.metodos.test;

import Maratona_java_javacore.Bintroducao.metodos.dominio.Calculadora;

public class CalculadoraTest04_MetodosCParametrosPrimitivos {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);//Não vai mostrar 1 e 2, pois quando chamamos o metodo e entramos nele, la dentro tem uma nova atribuição de valores a num1 e num2 que são copias de num1 e num2 de CalculadoraTest04, então dentro da CalculadoraTest04 num1 e num2 são iguais a 1 e 2 respectivamente, mas no metodo calculadora.alteraDoisNumeros(num1, num2) num1 e num2 que seriam 1 e 2 (Uma copia dos valores atribuidos na main) são trocados por 33 e 99 respectivamente
        System.out.println("CalculadoraTest04 num1: "+num1);//As variaveis originais não se alteram no metodo, pois o metodo copia as variaveis pelos parametros e assim ele usa essas copias para fazer alguma ação, mas as variaveis da main não se alteram
        System.out.println("CalculadoraTest04 num2: "+num2);
    }

}
