package Maratona_java_introducao;

import java.util.Scanner;

public class Aula08ArraysMultidimensionaisInicialização {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][]; //Podemos inicializar umArray de Arrays definindo quantos arrays serão referenciados e quantos blocos o array referenciado pode ter dessa forma [2][2] por exemplo
        arrayInt[0] = new int[2]; //Ou podemos inicializar o array manualmente com a opção de alterar a quantidade de blocos do array referenciado por exemplo: arrayInt[1] = new int[4], ou seja o endereço guardado em arrayInt na posição 1 referencia um array de [x blocos]
        arrayInt[1] = new int[4];
        arrayInt[2] = new int[6];
        //Alem disso temos outras formas de inicializar um Array multidimensional como:
        // arrayInt[0] = new int[]{1,2,3,4,5,6};
        //int[][] arrayInt2 = {{0,0},{1,2,3,4},{1,5,6,7,8,9,3}};

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                Scanner input = new Scanner(System.in);
                arrayInt[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.println("O array de endereço na posição " + i + " tem o numero: " + arrayInt[i][j] + " na posição: " + j);
            }
//        for(int[] arrayBase: arrayInt){
//            for (int num:arrayBase){
//                System.out.println(num);
//            }
        }
    }
}

