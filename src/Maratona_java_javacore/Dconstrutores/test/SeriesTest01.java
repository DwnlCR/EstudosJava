package Maratona_java_javacore.Dconstrutores.test;


import Maratona_java_javacore.Dconstrutores.dominio.Series;

public class SeriesTest01 {
    public static void main(String[] args) {
        //Series -> SeriesTest01: vc esta vendo esse new Series();, por que que colocamos () em uma classe?, ela nn é um metodo ent n faz sentido ter parenteses, e isso ocorre porque apesar de não sabermos ainda, isso é um construtor, vamos voltar a classe principal agora
        //Series serie = new Series();  //Serie -> SerieTest01: Apresentação de erro apos a adição de parametros no construtor, Series serie = new Series(); não funciona mais por que o construtor agora exige valores em vez de aceitar ser construido vazio
        Series serie = new Series("The Big Bang Theory","Comedia", 80, 2018); //Agora sim, bem melhor
        //serie.init("The Big Bang Theory","Comedia", 80, 2018); //Agora nem precisamos mais do init que sofremos pra fazer ja que o construtor ja faz o papel do init, e agora aquela atribuição de valores de 5 a 6 linhas passa a ser apenas 1 linha, a do construtor
        serie.imprime();
        Series serie2 = new Series("Friends", "Comedia", 236);//Exemplo de sobrecarga de Construtor para preguiçosoa que não querem por o ano da serie
        serie2.imprime();
    }
}
