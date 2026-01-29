package Maratona_java_javacore.Aintroducao.classes.test;
//tem que importar .dominio.Estudante para usar a classe Pessoa

import Maratona_java_javacore.Aintroducao.classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        //Criaremos uma variavel de nome estudante do tipo Estudante que faz referencia ao objeto Estudante
        Estudante estudante = new Estudante();
        //Agora iremos colocar valores na variavel estudante do tipo Estudante, logo temos 3 variaveis a serem preenchidas (colocar "estudante." para eles vizualizarem)
        estudante.nome = "Joaozinho";
        estudante.idade = 28;
        estudante.sexo = 'M';
        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
        System.out.println(estudante); //imprime o endereço
    }
}
