package Maratona_java_javacore.Linterfaces.dominio;

//Pronto, criamos CarregadorDeArquivos, agora vamos ver se dá pra implementar e usar o metodo atrubuido da interface
public class CarregadorDeArquivos implements CarregadorDeDados, RemovedorDeDados {
    //*** Pronto agora é só a gente implementar nossa segunda interface na classe Carregador de Arquivos, para isso é so colocar uma virgula e a nova interface a ser implementada hehe :), vamos fazer isso
    //*** Assim que fizermos isso vai dar erro por que temos que implementar tambem o metodo abstrato remover() q está no escopo de RemovedorDeDados -> linha 15

    @Override
    public void carregar() { //Hehe, deu certo meu patrão, ta tudo em cima, mas esse daqui tmb ta mei magrin, vamo por um sout nele tmb
        System.out.println("Carregando arquivos...");
    }
    //Agr q a gente ja viu q em tese esta tudo funcionando, vamo criar uma classe teste para ter certeza né? -> Criar CarregadorDeDadosTest01


    //***Implementação do metodo remover();
    public void remover(){
        System.out.println("Removendo arquivos...");
    }

    //Sobreescrevendo metodo concreto da interface
    @Override
    public void checarPermissao() {
        System.out.println("Carregador de Arquivos: Permissão negada");
    }
}
