package Maratona_java_javacore.Fassociacao.test;
import Maratona_java_javacore.Fassociacao.dominio.Jogador;
import Maratona_java_javacore.Fassociacao.dominio.Time;

public class JogadorTest02_AssociacaoUnidirecional {
    public static void main(String[] args) {
        //Agora que vimos Arrays com objetos finalmente podemos dar inicio as Associações
        //Basicamente é um conceito bem parecido com banco de dados Associação é o relacionamento entre 2 objetos, vamos ver uns exemplos na vida real
        //por exemplo, uma pessoa vai jogar um Valorant da vida, quando essa pessoa vai jogar ela se torna um jogador
        //e ele so pode escolher um personagem para jogar por partida, então 1 jogador pode escolher 1 personagem para jogar uma partida
        //futuramente ele pode trocar de personagem? claro q sim, mas nada vai mudar o fato de que ele ainda sera 1 jogador usando 1 personagem
        //e isso é uma associação unidirecional 1 para 1, temos tambem associações unidirecionais 1 para N ou seja, se tivermos 1 time com N jogadores de Valorant
        //é uma coisa normal e isso é um relacionamento unidirecional 1 para N, temos tambem a associação unidirecional N para 1 e N para N
        //mas acho que ja deu para entender o conceito, mas por exemplo, N para 1: N jogadores pertencem a 1 time, e de N para N ;-;?
        //de N para N temos por exemplo: N estudantes podem fazer N cursos
        //Mas porque unidirecional ;-;??? o motivo de ser unidirecional é o fato de que a ordem N Jogadores pertencem a 1 time funciona
        //mas N times podem pertencer a 1 jogador ja não funciona, por que tem uma ordem correta, uma direção especifica onde o relacionamento funciona
        //ou seja, unidirecional, mas isso entenderemos melhor futuramente
        //Agora vamos trabalhar com a seguinte ideia de associação unidirecional:
        //Um jogador pertence a um time, mas um time possui varios jogadores então agora iremos criar a classe Time no dominio

        //Estrutura basica
        Jogador jogador1 = new Jogador("Pedro");
        Time time = new Time("Flamengo");
        //Até então esses 2 são apenas objetos independentes um do outro sem relação alguma entre si, mas vamos mudar isso agora
        jogador1.setTime(time);//O que fizemos aqui basicamente foi preencher aquele espaço vazio private Time time;
        //que esta no objeto Jogador agora fazendo com que jogador1 tenha seu proprio nome e pertença a um time
        //Agora usaremos o metodo imprime para mostrar as informações de jogador01 mas da forma q esta agora apenas seu nome será printado, então vamos adicionar o time no imprime -> Jogador
        //Agora sim nosso metodo imprime esta funcionando corretamente
        jogador1.imprime();

        //Assim concluimos o relacionamento de 1 para muitos, onde existe um time para muitos jogadores, na proxima aula veremos o relacionamento de muitos para 1 (Escola e Professor)
    }
}
