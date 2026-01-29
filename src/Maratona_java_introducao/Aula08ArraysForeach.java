package Maratona_java_introducao;

public class Aula08ArraysForeach {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        int [] numeros2 = {1,4,5,6,7};
        int [] numeros3 = new int[]{1,2,6,8,9};
        for(int i = 0; i < numeros3.length; i++){
            System.out.println(numeros3[i]);
        }
        for(int i:numeros3) //Foreach: for utilizado para especificamente printar arrays, Obs: o indice utilizado deve ser do mesmo tipo do array
            System.out.println(i);
        }
    }
