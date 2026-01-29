package Maratona_java_introducao;

import java.util.Scanner;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args){
        /*
        Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

        Eu <nome>, morando no endereço <>, confirmo que recebi o salario de <salario>, na data <data>
         */
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite seu Salario: ");
        String strsalario = scanner.nextLine();
        Double salario = Double.parseDouble(strsalario);
        System.out.println("Digite a data de recebimento do salario: ");
        System.out.println("Dia: ");
        String strdia = scanner.nextLine();
        int dia = Integer.parseInt(strdia);
        System.out.println("Mes: ");
        String strmes = scanner.nextLine();
        int mes = Integer.parseInt(strmes);
        System.out.println("Ano: ");
        String strano = scanner.nextLine();
        int ano = Integer.parseInt(strano);

        System.out.printf("Eu <%s>, morando no endereço <%s>, confirmo que recebi o salario de <%.2f>, na data <%02d/%02d/%d>%n",nome, endereco, salario,dia,mes,ano);

        scanner.close();



    }
}
