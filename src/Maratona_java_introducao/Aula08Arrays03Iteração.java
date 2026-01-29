package Maratona_java_introducao;

import java.util.Scanner;

public class Aula08Arrays03Iteração {
    public static void main(String[] args) {
        String[] nomes = new String[9];
        for(int i = 0; i < 3; i++){//Não Dinamico -> se o numero de pessoas aumentar o for não acompanha esse aumento, ou seja, ou falta espaço ou sobra espaço
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o nome da pessoa da posição "+i+": ");
            nomes[i] = input.nextLine();
        }
        for(int i = 0; i < nomes.length; i++){//Dinamico -> nomess.length mostra exatamente a quantidade de pessoas dentro do array, ou seja, o for acompanha o array
            System.out.println("Nome da pessoa da posição "+i+": "+nomes[i]);
        }
    }
}
