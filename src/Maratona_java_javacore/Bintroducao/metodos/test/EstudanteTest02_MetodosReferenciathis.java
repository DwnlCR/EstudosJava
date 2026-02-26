package Maratona_java_javacore.Bintroducao.metodos.test;
import Maratona_java_javacore.Bintroducao.metodos.dominio.Estudante;

public class EstudanteTest02_MetodosReferenciathis {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Marcos";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Julia";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        //Antes podiamos apenas chamar estudante0X.nome ou estudante0X.idade ou estudante0X.sexo
        //mas agora hehe, da uma olhada
        System.out.println("JEITO MAIS MODERNO E FUTURISTICO AINDA DE IMPRIMIR INFORMAÇÕES HEHE :)");
        //Podemos chamar não apenas variaveis primitivas
        //mas tambem metodos presentes no escopo da classe do nosso objeto
        estudante01.imprime();
        estudante02.imprime();
    }

}
