package Maratona_java_javacore.Bintroducao.metodos.test;

import Maratona_java_javacore.Bintroducao.metodos.dominio.Pessoa;

public class PessoaTest01modificadoresdeacessoegetset {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Dafiny"; //Não conseguimos mais guardar valores dentro dos atributos da Classe pessoa, então vamos la na Classe para fazer uma maracutaia da boa pra gente voltar a ter acesso a esses atributos
        //pessoa.idade = 23;
        pessoa.setNome("Dafiny");
        pessoa.setIdade(17);
        //System.out.println(pessoa.nome);
        //System.out.println(pessoa.idade);Não conseguimos mais pegar e mostrar valores dentro dos atributos da Classe pessoa, então vamos la na Classe para fazer uma maracutaia da boa pra gente voltar a ter acesso a esses atributos
        //Agora podemos acessar os valores dentro dos atributos privados atravez do nosso metodo get
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        //Ir para Funcionario para a ultima parte de Modificador de acesso private
    }
}
