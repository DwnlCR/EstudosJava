package Maratona_java_javacore.Aintroducao.classes.dominio;

public class Estudante {
    public String nome; //Não esta sendo atribuido nenhum valor a essas variaveis da forma, mas podemos definir o valor padrão de cada variavel do escopo, basta querer
    public int idade;
    public char sexo;
    //NÃO PODEMOS FAZER DE FORMA ALGUMA O Q EU IREI FAZER AQUI ABAIXO:
    //public String nomeProfessor;
    //public int idadeProfessor;
    // public char sexoProfessor;
    //Basicamente o q eu fiz acima foi tratar as informações de um professor dentro do escopo de um estudante, isso deixa o codigo pouco coeso e com muitas falhas apresentadas futuramente, alem de ficar muito feio
    //O correto nesse caso é criar uma nova classe Professor para que as informações e o escopo de variaveis de um professor habitem nessa nova classe e não fique essa confusão, basicamete para ter um codigo com boa coesão, cada classe tem seu proposito unico e definido, sem ambiguidades
}
