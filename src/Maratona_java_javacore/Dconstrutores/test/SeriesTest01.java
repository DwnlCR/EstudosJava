package Maratona_java_javacore.Dconstrutores.test;
import Maratona_java_javacore.Dconstrutores.dominio.Series;

public class SeriesTest01 {
    public static void main(String[] args) {
        //Series serie = new Series();
        //Apresentação de erro apos a adição de parametros no construtor, Series serie = new Series();
        //não funciona mais por que o construtor agora exige valores em vez de aceitar ser construido vazio
        Series serie = new Series("The Big Bang Theory","Comedia", 80, 2018);
        serie.imprime();
        //Exemplo de sobrecarga de Construtor para preguiçoso que não quer por o ano da serie
        Series serie2 = new Series("Friends", "Comedia", 236);
        serie2.imprime();
    }
}
