package Maratona_java_javacore.Jenumeração.test;

import Maratona_java_javacore.Jenumeração.dominio.Cliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Daniel", "PESSOA_JURIDICA"); //Pede como parametro o nome do cliente, e que tipo de cliente ele é: Pessoa fisica ou pessoa juridica
        Cliente cliente2 = new Cliente("Iury", "PESSOA_FISICA");
        //Mas imaginemos por exemplo q n seja so vc q esteja trabalhando nesse projeto, é voce, o Joaozin e a Dona benta
        //Ai chegou uma hr em q o Joaozinho precisou cadastrar um novo cliente e ele faz dessa forma
        Cliente cliente3 = new Cliente("Renato", "Pessoa fisica");
        //Ai depois chegou a dona benta e foi fazer o cadastro de outra pessoa
        Cliente cliente4 = new Cliente("Junior", "pessoa juridica");
        //Pronto ja vimos a confusão se formando, pq a principio pode parecer algo bobo mas quando isso dai vai p banco de dados com esses dados todos inconsistentes, haja paciencia para resolver
        //Ou seja, temos q resolver esse problema direto na Classe Cliente para evitar q esse tipo de coisa venha acontecer -> Cliente

        //Agora veremos quais objetos estão com os valores padrão e consequentemente são validos
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        //Pronto conseguimos ver quais clientes de fato estão validados e quais não passaram pela etapa de validação, Massss temos um problema -> Cliente
    }
}
