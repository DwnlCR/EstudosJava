package Maratona_java_javacore.Aintroducao.classes.test;

import Maratona_java_javacore.Aintroducao.classes.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        new Estudante(); //com new Estudante vc cria o objeto em branco com as variaveis vazias, mas nao da para acessar ate que vc crie uma variavel que referencie esse objeto
        Estudante estudante = new Estudante(); //Agora sim, nossa variavel estudante do tipo Estudante pode acessar e alterar as informações do Objeto Estudante criado
        Estudante estudante2 = new Estudante();
        estudante.nome = "Junior";
        estudante2.nome = "Alberto";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("--------------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);


    }
}
