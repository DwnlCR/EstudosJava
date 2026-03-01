package Maratona_java_javacore.Fassociacao.test;
import Maratona_java_javacore.Fassociacao.dominio.Escola;
import Maratona_java_javacore.Fassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Tatiana");
        Professor professor02 = new Professor("Gleison");
        Professor professor03 = new Professor("Clovis");
        Professor[] professores = {professor01, professor02, professor03}; //Criaremos um array para guardar os professores
        //Agora temos que relacionar a Tatiana com a UFC, podemos fazer isso atravez de uma sobrecarga de Construtor
        //Escola escola = new Escola("UFC"); //Não esta relacionado com os professores
        Escola escola = new Escola("UFC", professores); //Agora sim a escola esta recebendo o array de professores
        //e quando imprimirmos sairá da seguinte forma: nome da escola depois professores dessa escola
        escola.imprime();
    }
}
