package Maratona_java_javacore.Bintroducao.metodos.test;

import Maratona_java_javacore.Bintroducao.metodos.dominio.Estudante;

public class EstudanteTest02_MetodosReferenciathis {
    public static void main(String[] args) {
        //Nesse tópico iremos aprender e entender o funcionamento do comando this, mas antes disso
        //Vamos pensar, por que temos que chamar o metodo imprime() sendo que todas as vezes temos que ter um parametro de referencia para copiar o endereço dos objetos referentes a Classe Estudante para acessar seus valores?
        //Por que não colocar o metodo imprime() dentro da Classe Estudante e lá mesmo fazermos a impressão sem precisar buscar dado algum de qualquer objeto ja criado, ja que assim que forem criados ja terão o imprime como parte de seu escopo?
        //Ou seja, é isso que vamos fazer agora hehe
        //Vamos entrar na Classe Estudante presente no dominio e adicionar a seu escopo nosso metodo de imprimir dados.
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Marcos";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Julia";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        //Antes podiamos apenas chamar estudante0X.nome ou estudante0X.idade ou estudante0X.sexo, mas agora hehe, da uma olhada
        System.out.println("JEITO MAIS MODERNO E FUTURISTICO AINDA DE IMPRIMIR INFORMAÇÕES HEHE :)");
        estudante01.imprime(); //Podemos chamar não apenas variaveis primitivas mas tambem funções presentes no escopo de nosso objeto
        estudante02.imprime();

        //Agora vamos aprender sobre Varargs -> Calculadora
    }

}
