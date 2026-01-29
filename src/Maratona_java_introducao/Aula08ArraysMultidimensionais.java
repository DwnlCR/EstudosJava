package Maratona_java_introducao;

public class Aula08ArraysMultidimensionais {

    public static void main(String[] args) {
        //Arrays Multidimensionais: Arrays de Arrays ou seja, Arrays que referenciam arrays
        int[][] dias = new int[3][4];//O primeiro bloco de posições Array [3] funciona como um banco de endereços para que encontrar outros 3 arrays de 4 posições [4]
        //Ex: 1,2,3,4,5 meses | 31,28,31,30 dias
        System.out.println(dias[0]); //Endereço de memoria do primeiro array de 4 posições
        System.out.println(dias[1]); //Endereço de memoria do segundo array de 4 posições
        System.out.println(dias[2]); //Endereço de memoria do terceiro array de 4 posições


        //1° Array de 4 posições: endereço -> dias[0]
        dias[0][0] = 31; //No array que possui endereço referenciado por dias[0] na posição 0 (janeiro) recebe 31 dias
        dias[0][1] = 28; //No array que possui endereço referenciado por dias[0] na posição 1 (fevereiro) recebe 28 dias
        dias[0][2] = 31; //No array que possui endereço referenciado por dias[0] na posição 2 (Março) recebe 31 dias
        dias[0][3] = 30; //No array que possui endereço referenciado por dias[0] na posição 3 (Abril) recebe 31 dias

        //2° Array de 4 posições: endereço -> dias[1]
        dias[1][0] = 31; //No array que possui endereço referenciado por dias[1] na posição 0 (Maio) recebe 31 dias
        dias[1][1] = 30; //No array que possui endereço referenciado por dias[1] na posição 1 (Junho) recebe 30 dias
        dias[1][2] = 31; //No array que possui endereço referenciado por dias[1] na posição 2 (Julho) recebe 31 dias
        dias[1][3] = 31; //No array que possui endereço referenciado por dias[1] na posição 3 (Agosto) recebe 31 dias

        //3° Array de 4 posições: endereço -> dias[2]
        dias[2][0] = 30; //No array que possui endereço referenciado por dias[2] na posição 0 (Setembro) recebe 30 dias
        dias[2][1] = 31; //No array que possui endereço referenciado por dias[2] na posição 1 (Outubro) recebe 31 dias
        dias[2][2] = 30; //No array que possui endereço referenciado por dias[2] na posição 2 (Novembro) recebe 30 dias
        dias[2][3] = 31; //No array que possui endereço referenciado por dias[2] na posição 3 (Dezembro) recebe 31 dias

        for(int i = 0; i < dias.length; i++){ //Roda esse for 3 vezes por que é a quantidade de casas do array de endereços
            for (int j = 0; j < dias[i].length; j++) { //Roda esse for 4 vezes por que é a quantidade de casas do array referenciado por dias[i], seja i = 0, 1 ou 2
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-----------------------");
        for(int[] enderecos: dias){ //Precisamos para o Foreach que printa Arrays de arrays, uma variavel que recebe o primeiro Array dos endereços, um de cada vez, cada um dos endereços
            for(int num: enderecos){ //Agora a variavel num a cada ciclo do for recebe um valor e assim recebe todos os valores de cada array de endereço
                System.out.println(num);
            }
        }
    }
}
