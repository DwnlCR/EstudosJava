package Maratona_java_introducao;

public class Aula07EstruturasDeRepetição {
    public static void main(String[] args) {
        //while [Executa apenas se a condição for atendida], do while [Executa pelo menos uma vez mesmo se a condição ainda nao estiver sendo atendida], for
        int count = 0;
        while(count <= 10){
            System.out.println(count); //Se for ++count imprime apenas de 1 a 10
            count++;
        }

        count = 0; //resetando o valor do count para o do while funcionar
        do{
            System.out.println("Dentro do while "+ ++count);
        }while(count < 10);

        for(int i = 0 ; i < 10 ; i++){ //Usado para contagens, dividido em 3 partes: Indice: int i, Ate onde ela vai, incremento: i++
            System.out.println("For numero: " + i);
        }
    }
}
