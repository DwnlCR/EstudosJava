package Maratona_java_javacore.Fassociacao.test;
import Maratona_java_javacore.Fassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        //Vamos criar 3 jogadores
        Jogador jogador1 = new Jogador("Pedro");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Arrascaeta");
        //Agora vamos criar a variavel de referencia tipo array que guardará esses jogadores
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        //Basicamente o que fizemos na linha acima foi criar um array de endereços
        //que guarda os endereços jogador1, jogador2 e jogador3 que apontam para seus espaços de memoria respectivamente
        //ou seja agora cada objeto possui duas formas de serem acessados:
        //1º e mais convencional que é jogador1. ->  espaço de memoria de jogador1
        //e a nossa nova opção é jogadores[0] -> jogador1 ->  espaço de memoria de jogador1
        //ou seja, se dessemos um sout em qualquer uma das opções sairia "Pedro"
        //Vamos criar nosso metodo imprime para conseguir ver o q q esta acontecendo por detras dos panos
        //Criado nosso metodo imprime agora vamos usar um foreach para ver se tudo que fizemos ate agr está coerente
        for(Jogador jogador: jogadores){//Usamos Jogador como tipo pois a variavel jogador vai receber um Jogador
            //e para que a variavel criada suporte um tipo Jogador ela tambem deve ser do tipo Jogador
            jogador.imprime();//jogador recebe o endereço de jogadores[0] e apos isso basicamente se transforma em jogador1 para chamar o metodo imprime
            //e isso acontece com todos os jogadores ate acabar o array de endereços
        }
    }
}
