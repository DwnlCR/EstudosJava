package Maratona_java_introducao;

import java.util.Scanner;

public class Aula08Arrays03Iteração {
    public static void main(String[] args) {
        String[] nomes = new String[9];
        //Não Dinamico -> se o numero de pessoas aumentar o for não acompanha esse aumento
        //for não acompanha o array por faltar ou sobrar repetições pelo indice não exato
        for(int i = 0; i < 3; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o nome da pessoa da posição "+i+": ");
            nomes[i] = input.nextLine();
        }
        //Dinamico -> nomes.length mostra exatamente a quantidade de pessoas dentro do array
        //for acompanha o array pois o indice é exato
        for(int i = 0; i < nomes.length; i++){
            System.out.println("Nome da pessoa da posição "+i+": "+nomes[i]);
        }
    }
}
