package Maratona_java_introducao;

import java.util.Arrays;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - / *
        int num1 = 10; // para fazer a divisao entre 2  numeros inteiros é necessario que o denominador seja casteado para double e o resultado q ira guardar essa ação seja double
        int num2 = 20;
        double resultado = num1 + num2;
        System.out.println(num2 + num1 + " valor " + num2 + num1);
        System.out.println(resultado);
        resultado = num1 * num2;
        System.out.println(resultado);
        resultado = num1/(double) num2;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualAVinte);
        System.out.println(isDezIgualADez);
        System.out.println(isDezDiferenteDeDez);

        // &&(And) ||(Or) !(Not)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQue30);
        System.out.println(isDentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 3000;
        float valorPlaystation = 2500F;
        boolean isPlaystation5Compravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println(isPlaystation5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 800; //--> bonus = bonus + 800 = 2600
        bonus -= 600; //--> bonus = bonus - 600 = 2000
        bonus *= 2; //--> bonus = bonus * 2 = 4000
        bonus /= 2; //--> bonus = bonus / 2 = 2000
        bonus %= 2; //--> bonus = bonus % 2 = 0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador++; //--> Passa por ele depois incrementa + 1
        contador--; //--> Passa por ele depois decrementa - 1
        ++contador; //--> Na hora que chega nele incrementa + 1
        --contador; //--> Na hora que chega nele decrementa - 1
        System.out.println(contador++); // Resultado = 0
        System.out.println(++contador); // Resultado = 1;



    }
}
