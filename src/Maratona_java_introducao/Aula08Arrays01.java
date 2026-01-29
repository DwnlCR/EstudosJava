package Maratona_java_introducao;

public class Aula08Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 4;
        idades[2] = 8;
        System.out.println(idades); //imprime o endereço de memoria do array
        System.out.println(idades[0]); //imprime o valor contido na posição 0 do  array
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        //System.out.println(idades[3]); //erro no tempo de execução, o indice esta fora do esperado

    }
}
