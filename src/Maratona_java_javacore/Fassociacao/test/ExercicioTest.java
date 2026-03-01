package Maratona_java_javacore.Fassociacao.test;
import Maratona_java_javacore.Fassociacao.dominio.*;

public class ExercicioTest {
    public static void main(String[] args) {
        //Agora que nosso esqueleto da aplicação esta pronto iremos começar a fazer um cadastro para um seminario
        //Começaremos pela classe com menos relacionamentos -> Local
        LocalEx local = new LocalEx("Rua Cristovam Cavalcanti, Numero: 170");

        //Agora vamos para o 2° de menos relacionamentos, so tem um problema, todas as outras classes possuem 3 dependencias, então começaremos pelas que tem menos relacionamentos que são Aluno e Professor
        //Vamos fazer 2 alunos
        AlunoEx aluno1 = new AlunoEx("Joãozinho", 17);
        AlunoEx aluno2 = new AlunoEx("Cecilia", 19);
        ProfessorEx professor = new ProfessorEx("Julio Cesar", "Automação");

        //Agora sim iremos para o termo com mais relacionamentos agora que todos os com menos relacionamentos ja foram
        //Lembrando que como o penultimo parametro de SeminarioEx é alunos, ou seja é um array, então temos que por um array de alunos e não somente um aluno, então vamos criar esse array
        AlunoEx[] alunos = {aluno1, aluno2};
        SeminarioEx seminario = new SeminarioEx("Automação do futuro das API's", alunos, local);
        //Pronto criamos o seminario :) mas ainda ta faltando saber que professor q vai ministrar esse seminario, nos ja sabemos quem é, mas ele sabe que seminario vai ministrar? o local? e os alunos?, ele n sabe de nada ainda, então vamos avisa-lo por meio do relacionamento que a classe Professor tem com a classe Seminario
        //Porem se atentemos a um detalhe se fizermos apenas professor.setSeminarios(seminario); não vai dar certo, pois setSeminarios esta no plural, ou seja, ele espera receber um array, não um elemento, então vamos criar um array para guardar nosso seminario e passa-lo como parametro para o metodo da classe professor
        SeminarioEx [] seminarios = {seminario};

        //Agora sim podemos fazer o professor.setSeminarios();
        professor.setSeminarios(seminarios);
        //Beleza, ja fizemos todos os relacionamentos, agora temos que mostrar isso no terminal ne? queremos resultados não processos, então vamos criar um metodo imprime para conseguirmos ver o que q esta acontecendo, mas vc concorda comigo que a classe Professor é a unica classe que tem todos os dados? ele tem todas as informações, o local, os alunos, o nome do seminario, e q obviamente é ele que vai dar esse seminario ne?
        //Então claramente criaremos o metodo imprime em Professor ☺ vamos la -> ProfessorEx

        //Terminamos o metodo imprime ;)
        professor.imprime();
        //mandar um array vazio de alunos para mostrar a eles que mesmo vazio o codigo roda mas apenas sem mostrar os alunos
    }
}
