package Maratona_java_introducao;

public class Aula07ExercicioFor {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 ate 100000
        int cont = 1;
        for(int i = 0; i <= 100000; i++){
            System.out.println(cont + "° Numero Par: " + i);
            i++;
            cont++;
        }
        //Para checar se sao realmente pares podemos usar essa condição
        cont = 1;
        for (int i = 0 ; i <= 100000; i++){
            if(i%2 == 0){
                System.out.println(cont + "° Numero Par: " + i);
                cont++;
            }
        }
    }
}
