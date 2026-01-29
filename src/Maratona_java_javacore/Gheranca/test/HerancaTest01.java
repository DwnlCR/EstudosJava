package Maratona_java_javacore.Gheranca.test;

import Maratona_java_javacore.Gheranca.dominio.Endereco;
import Maratona_java_javacore.Gheranca.dominio.Funcionario;
import Maratona_java_javacore.Gheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        //Herança01
        //Vamos começar por endereço pois ele tem menos relacionamentos
        //Endereco endereco = new Endereco();
        //endereco.setRua("Rua 3");
        //endereco.setCep("00034584-78");
        //Pessoa pessoa = new Pessoa();
        //pessoa.setNome("Juninho");
        //pessoa.setCpf("4728364857");
        //pessoa.setEndereco(endereco);
        //agora vamos fazer o metodo imprime em pessoa que possui todos os dados
        //pessoa.imprime(); //Pronto fizemos o basico
        //System.out.println("----------------------------");
        //Agora imagina q teu gerente chegou em tu e falou, ei, tamo precisando saber os dados dos funcionario da empresa, faz uma classe nova e um imprime novo para a gente ter esses dados: nome, cpf, endereço e salario -> Ai lá vamos nos criar uma nova classe Funcionario no dominio

        //Ja sabemos o que se trata a herança agora vamos ver se ta tudo funcionando aqui no teste
        //Funcionario funcionario = new Funcionario();
        //Agora vamos ver se conseguimos chamar os metodos e atributos da Classe Pessoa assim como nos foi prometido
        //Endereco enderecofuncionario = new Endereco();
        //funcionario.setNome("Maria");
        //funcionario.setCpf("783827507-54");
        //enderecofuncionario.setCep("47209570");
        //enderecofuncionario.setRua("Rua dos Cocais");
        //funcionario.setEndereco(enderecofuncionario);
        //funcionario.setSalario(1878.80); // -> Quando estamos procurando os metodos que podemos usar de funcionario apenas os que estao propriamente na classe funcionario ficam em negrito
        //Oia só rapaz e num é q funciona mermo ☺, e se quisermos printar? vamos usar o imprime do Pessoa ué a gente pode
        //funcionario.imprime(); //Agora vai
        //Num foi ;-; dados incompletos ;-; o imprime da classe Pessoa n faz a menor ideia d q alguem pode receber um salario ;-; vamo ter q aprender um negocinho novo pra isso dar certo e isso vai ser agora

        //Herança02, em busca de um imprime perfeito -> Super
        //Bom nessa aula queremos saber como fazer para nosso metodo imprime de funcionario printar todos os dados inclusive o salario sem ter que criar outro metodo imprime com um nome diferente -> Funcionario

        // \\*******// \\ -> Funcionario: criar metodo imprime usando super

        //Hehe agora sim, depois q usamos nosso super olha só como sai nossas informações
        //funcionario.imprime();
        //Obs: O super apenas usa o metodo de Pessoa mas não usa nenhum de seus atributos, os atributos utilizados são os de Funcionario

        //Herança03: modificador de acesso protected
        //Digamos que agora seu chefe virou pra vc e falou, rapaz ta dificil ver q pessoa recebeu quanto, n tem como vc fzr um metodo relatorio q saia algo tipo "Eu nome da pessoa recebi salario R$", ai vc como otimo funcionario dev vai la e diz, na hr meu patrão
        //Ent vamos para a -> classe Funcionario fazer essa maracutaia

        //Herança04: Construtores dentro de Heranças -> nessa aula iremos fazer algumas mudanças vou pegar aquele codigo ali em cima e replica-lo aqui em baixo
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("00034584-78");
        Pessoa pessoa = new Pessoa("Juninho"); //Agora que fizemos o construtor com um parametro, Pessoa(); exige um argumento
        //pessoa.setNome("Juninho"); Retiramos esse setNome e pegamos seu valor para por no construtor
        pessoa.setCpf("4728364857");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("----------------------------");
        Endereco enderecofuncionario = new Endereco();
        enderecofuncionario.setCep("47209570");
        enderecofuncionario.setRua("Rua dos Cocais");
        Funcionario funcionario = new Funcionario("Maria", "783827507-54", enderecofuncionario, 1878.80);//Vamos passar o parametro nome para esse bixo parar de pertubar, e logo apos isso criaremos os outros construtores para retirar os outros sets
        //funcionario.setNome("Maria");//Tira isso e poe o valor do setNome em Pessoa();
        //Agora finalmente temos o construtor com todos os parametros, n precisamos ficar mais fazendo sets, agora é so por os valores direto no construtor, mas vai do q vc achar melhor fazer
        //funcionario.setCpf("783827507-54");/Tira isso e poe o valor do setNome em Pessoa();
        //funcionario.setEndereco(enderecofuncionario);/Tira isso e poe o valor do setNome em Pessoa();
        //funcionario.setSalario(1878.80);/Tira isso e poe o valor do setNome em Pessoa();
        funcionario.imprime();
    }
}
