package Maratona_java_javacore.Nexecoes.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        //Vamos entender exeções começando com um erro basico, o stack overflow que acontece quando uma pilha estoura a memoria de tanto um mesmo metodo se auto chamar atravez da recursividade
        //lembrando que tanto erros quanto exeções são filhas de Throwable que basicamente identifica os problemas de um codigo, sejam erros ou exeções, ou seja erros != exeções
        recursividade();
        //Deu o erro stack overflow error, ou seja estouramos a memoria disponivel, e não temos o q fazer quanto a isso, o programa parou de executar pq a memoria inteira disponivel foi alocada somente nessa recursividade
        //Não tem como solucionar erros a não ser que sejam resolvidos pelo proprio programador, ou seja o problema esta entre a cadeira e o pc, nesse caso ou teriamos que dar uma condição para a recursividade parar ou teriamos que retirar a recursividade do codigo

        //Agora vamos entender exeções primeiramente entendendo o que é o RuntimeExeption
        //Existem 2 tipos de exeção, as checked exeptions e as unchecked exeptions, mas vamos começar a entender isso em outro pacote -> pacote runtime.test classe RuntimeException


    }
    public static void recursividade(){
        recursividade();
    }
}
