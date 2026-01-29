package Maratona_java_javacore.Imodificadorfinal.dominio;

public class Ferrari extends Carro{ //Uma ferrari é um carro, logo podemos usar o conceito de herança nesse caso
    //Mas digamos por exemplo q não queremos q nossa classe Carro possa ser extendida ;-; sei la, não quero mais q essa forma para carrros seja utilizada por mais ninguem, o q faremos é simples :), vamo la meter um final na Classe Carro
    //Temos o metodo imprime advindo da Classe Carro que é pai da Classe Ferrari, mas não podemos sobreescreve-la, apenas podemos usar ela e mais nada
    //Vamos tentar sobreescreve-lo logo pra ver o erro acontecendo
    //public void imprime(){} é n vai ter jeito, a unica forma é usar esse metodo imprime assim como ele vem de fabrica la da Classe Carro
    //Ou seja, quando escrevemos um metodo final na classe Originaria, ou classe Pai quer dizer que aquele metodo todos os filhos podem usar, mas nunca sobreescrever, é daquele jeito e ponto final
    //Agora podemos ir na classe test para ver se realmente a Classe Ferrari pode chamar esse metodo final -> CompradorTest01
}
