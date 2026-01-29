package Maratona_java_javacore.Mpolimorfismo.repositorio;

//Agora vamos implementar a interface Repositorio, veremos um erro que é a ausencia da implementação do metodo salvar mas faremos isso logo em seguida
public class RepositorioArquivo implements Repositorio {

    //implementação do salvar -> Apos a implementação do salvar nas 3 classes vamos criar um novo ProdutoTest que vai ser o ProdutoTest04 para testar se esta tudo funcionando
    @Override
    public void salvar() {
        System.out.println("Salvando em um Arquivo...");
    }
}
