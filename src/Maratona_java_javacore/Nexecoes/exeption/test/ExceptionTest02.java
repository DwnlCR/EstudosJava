package Maratona_java_javacore.Nexecoes.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }
    //Vamos criar um metodo para criar arquivos de uma forma diferente agora
    public static void criarNovoArquivo() throws IOException{
        File file = new File(".idea/arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: "+isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            //throw new RuntimeException("Erro na hora de criar o arquivo");
            throw e; //Relançar a exeção para ver se da certo na segunda vez

            //Vamos aprender sobre o bloco finally agora -> RuntimeEXception03
        }
    }
}
