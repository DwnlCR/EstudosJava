package Maratona_java_javacore.Bintroducao.metodos.test;
import Maratona_java_javacore.Bintroducao.metodos.dominio.Pessoa;
public class PessoaTest01modificadoresdeacessoegetset {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //Não conseguimos mais guardar valores dentro dos atributos da Classe pessoa dessa forma
        //Tudo isso por que agora os atributos são privados
        pessoa.nome = "Dafiny";
        pessoa.idade = 23;
        //Então vamos la na Classe Pessoa para fazer uma maracutaia da boa
        //pra gente voltar a ter acesso a esses atributos (setters)

        //Não conseguimos mais pegar e mostrar valores dentro dos atributos da Classe pessoa dessa forma
        //Tudo isso por que agora os atributos são privados
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        //então vamos la na Classe para fazer uma maracutaia da boa
        //pra gente voltar a ter acesso a esses atributos (getters)


        //Agora podemos atribuir valores dentro dos atributos privados atraves do nosso metodo set
        pessoa.setNome("Dafiny"); //Metodo set para atribuir valor
        pessoa.setIdade(17);
        //Agora podemos acessar os valores dentro dos atributos privados atraves do nosso metodo get
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        //Ir para Funcionario para a ultima parte de Modificador de acesso private
    }
}
