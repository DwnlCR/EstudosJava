package Maratona_java_introducao;

public class Aula07EstruturasDeRepetição {
    public static void main(String[] args) {
        //while [Testa a condição antes de executar o bloco]
        //do while [Executa o bloco primeiro e só depois verifica a condição.]
        //for [Utilizado para contagens Indice: int i, Ate onde ela vai, incremento: i++]
        int count = 0;
        while(count <= 10){
            System.out.println(count);//Se for ++count imprime apenas de 1 a 10
            count++;
        }

        count = 0;//resetando o valor do count para o do while funcionar
        do{
            System.out.println("Dentro do while "+ ++count);
        }while(count < 10);

        for(int i = 0 ; i < 10 ; i++){
            System.out.println("For numero: " + i);
        }
    }
}
