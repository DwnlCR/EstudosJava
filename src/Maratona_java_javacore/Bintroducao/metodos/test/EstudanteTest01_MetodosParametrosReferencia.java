package Maratona_java_javacore.Bintroducao.metodos.test;
import Maratona_java_javacore.Bintroducao.metodos.dominio.Estudante;
import Maratona_java_javacore.Bintroducao.metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01_MetodosParametrosReferencia {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Marcos";
        estudante01.idade = 19;
        estudante01.sexo = 'M';
        estudante02.nome = "Julia";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        //Basicamente o que fizemos acima foi criar 2 espaços de memoria que guardam
        //uma String, um int e um char e a unica coisa que nos faz conseguir acessar esse espaço de memoria
        //e seus atributos é sua variavel do tipo referencia
        //ou seja estudante01 para o espaço de memoria 1 e o estudante02 para o espaço de memoria 2
        //Acessando o espaço de memoria usando a variavel do tipo refencia
        System.out.println("JEITO ANTIGO E ULTRAPASSADO DE IMPRIMIR INFORMAÇÕES: ");
        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
        System.out.println("---------------------------------------------------------------");

        //Mas esse negocio de imprimir os dados ta muito repetitivo não acham?
        //q tal a gente criar uma classe para imprimir esses dados?
        //Criaremos a classe ImpressoraEstudante que possui o metodo imprime()
        //para fazer esse trabalho pesado

        System.out.println("JEITO ATUAL E MODERNO DE IMPRIMIR INFORMAÇÕES HEHE: ");
        //Criamos nossa referencia a Classe ImpressoraEstudante
        //por meio da variavel de referencia impressora
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        //Aqui temos que colocar como parametro uma variavel de referencia do tipo estudante
        //ou seja, uma das duas que criamos até agora
        //estudante01 ou estudante02, para que o metodo imprime() faça uma copia dessa variavel de referencia
        //e use ela como meio para acessar os dados do espaço de memoria que estamos pedindo
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
