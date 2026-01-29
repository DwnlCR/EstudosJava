package Maratona_java_javacore.Bintroducao.metodos.test;

import Maratona_java_javacore.Bintroducao.metodos.dominio.Calculadora;

public class CalculadoraTest05_Varargs {
    public static void main(String[] args) {
        //Vamos usar nosso metodo somaNumeros presente na classe dominio Calculadora
        //Criaremos um Array de numeros para colocar como parametro para o metodo somaArrays
        int [] numeros = {2,5,8,0,3};
        Calculadora calculadora = new Calculadora();
        calculadora.somaArrays(numeros);
        calculadora.somaVarArgs(numeros); //Podemos passar arrays assim como a forma anterior
        calculadora.somaVarArgs(1,4,7,8,9,0,2,4); //E a sua vantagem é poder agir tambem dessa forma, passando os valores de um array por si só, sendo praticamente uma evolução dos arrays padrão
    }
}
