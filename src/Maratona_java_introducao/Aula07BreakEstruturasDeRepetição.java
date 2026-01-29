package Maratona_java_introducao;

public class Aula07BreakEstruturasDeRepetição {
    public static void main(String[] args) {
        // Imprima metade dos numeros ate um dado valor. Por exemplo 50
        int valorMax = 60;
        for(int i = 0; i < valorMax; i++){
            if(i > valorMax/2){
                System.out.println("Tem que parar aqui --> Break");
                break;
            }
            System.out.println(i);
        }
    }
}
