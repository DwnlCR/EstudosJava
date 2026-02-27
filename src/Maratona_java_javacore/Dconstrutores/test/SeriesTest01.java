package Maratona_java_javacore.Dconstrutores.test;
import Maratona_java_javacore.Dconstrutores.dominio.Series;

public class SeriesTest01 {
    public static void main(String[] args) {
        Series serie1 = new Series();
        //Apresentação de erro apos a adição de parametros no construtor, Series serie = new Series();
        //não funciona mais por que o construtor agora exige valores em vez de aceitar ser construido vazio
        Series serie2 = new Series("The Big Bang Theory","Comedia", 80);
        serie2.imprime();
        //Sobrecarga de Construtor
        Series serie3 = new Series("Friends", "Comedia", 236, 2018);
        serie3.imprime();
    }
}
