package Maratona_java_javacore.Bintroducao.metodos.dominio;

import java.util.Scanner;

public class Calculadora {
    //Começar com Metodos sem parametros no dominio e depois mostrar como esses metodos atuariam com parametros no Test
    public void somarTresNumerosSemParametros() {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        System.out.println("Soma dos 3 numeros: " + (num1 + num2 + num3));
    }

    //Por que void? e o que significa? basicamente é como entregar uma maçã ao metodo de cortar
    //ele vai la e corta, se ele me devolver a maçã cortada então é um metodo que possui retorno
    //se ele apenas cortar e nao me devolver nada é por que é um metodo sem retorno, ou seja, um void
    public void somarDoisNumerosComParametros(double num1, double num2) {
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Fim do calculo!\n");
    }
    //Parametros: seguindo a analogia da maçã, basicamente a maçã seria o parametro
    //onde o metodo vai cortar a maçã que entregarmos para ele
    public void subtrairDoisNumeros(double num1, double num2) {
        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Fim do calculo!\n");
    }
    public void multiplicarDoisNumeros(double num1, double num2) {
        System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("Fim do calculo!\n");
    }
    public void dividirDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisão por 0, Invalido!");
        } else {
            System.out.println("Divisão: " + num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println("Fim do calculo!\n");
        }
    }

    public void calcular(double num1, double num2, String op) {
        if (op.equals("+")) {
            somarDoisNumerosComParametros(num1, num2);
        } else if (op.equals("-")) {
            subtrairDoisNumeros(num1, num2);
        } else if (op.equals("*")) {
            multiplicarDoisNumeros(num1, num2);
        } else if (op.equals("/")) {
            dividirDoisNumeros(num1, num2);
        } else {
            System.out.println("Operação Invalida");
        }
    }

    //Metodos de retorno - Não é mais void
    //Basicamente agora que não é mais um metodo void
    //automaticamente cada metodo deve retornar algo
    //como é um metodo double, esse metodo abaixo deve retornar um double
    public double dividirDoisNumerosComRetorno(double num1, double num2){
        if (num2 == 0) {
            return 0; //Forma de parar a execução do codigo caso algo saia do planejado
        }
        return num1 / num2; //Obrigatorio pois o metodo retorna algum double
    }

    //Metodo sem retorno com parametros
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisão por 0: Invalido!!!");
            return; //É um break versão metodo, porem só funciona com metodos sem retorno, ou seja, metodos void
        }
            System.out.println("imprimir resultado da divisão: " + num1 / num2);
    }
    public void alteraDoisNumeros(int num1, int num2){ //O motivo para as variaveis parametro não estarem sendo utilizadas é por que num1 e num2 da Calculadora e num1 e num2 da CalculadoraTest04 são variaveis != apenas de mesmo nome, ou seja, se tirar os parametros o resultado é o mesmo
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " +num1);
        System.out.println("Num2: " +num2);
    }
    // ***APOS TERMINAR A PARTE DA CALCULADORATEST04 -> IR PARA CLASSE Estudante PARA COMEÇAR OS ESTUDOS DE PARAMETROS TIPO REFERENCIA***
    //VARARGS

    //Metodo que não usa Varargs
    public void somaArrays(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println("Array: "+soma);
    }

    //Metodo que usa Varargs -> Varargs é uma forma simplificada trazida pelo java para passar arrays como parametro de forma eficiente, tem como principal função ser parametro de metodos em objetos
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println("Varargs: "+soma);
    }
}