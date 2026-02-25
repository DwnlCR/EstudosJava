package Maratona_java_javacore.Aintroducao.classes.test;
//tem que importar .dominio.Estudante para usar a classe Estudante
import Maratona_java_javacore.Aintroducao.classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        //Criaremos um objeto de nome estudante do tipo Estudante que faz referencia a classe Estudante
        Estudante estudante = new Estudante();
        //Agora iremos colocar valores na variavel estudante do tipo Estudante
        //logo temos 3 variaveis a serem preenchidas
        //preenchemos usando objeto criado + . + atributo a ser preenchido
        estudante.nome = "Joaozinho";
        estudante.idade = 28;
        estudante.sexo = 'M';
        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
        System.out.println(estudante); //imprime o endereço
    }
}
