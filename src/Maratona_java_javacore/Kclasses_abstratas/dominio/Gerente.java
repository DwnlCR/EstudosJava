package Maratona_java_javacore.Kclasses_abstratas.dominio;

public class Gerente extends Funcionario{ //Dar extends em Funcionario, vai dar erro, mas é por que lá em Funcionario temos um construtor e Gerente q é filho de Funcionario não seguiu a carreira do pai ainda, então vamos fazer o construtor de gerente

    //Pronto, criamos o construtor, agora vamos voltar a FuncionarioTest01 para testar se o Gerente ta funcionando
    public Gerente(String nome, double salario) {
        super(nome, salario);
        calcularBonus();
    }
    @Override
    public String toString() {
        return "Gerente{"+ //Alteração, Funcionario para Gerente -> Agora vamos em FuncionarioTest ver se o sout está funcionando corretamente
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    //Aula02 -> Metodos abstratos

    //vamos criar a sobreescrita do metodo calculaBonus presente em Funcionario, os gerentes vão ganhar 20% de acrecimo em seu salario
    @Override
    public void calcularBonus() {
        salario += salario * 0.20;
    }

    //Agora que ajeitamos os bonus dos desenvolvedores e gerentes, vamos ver se ta tudo funcionando la em -> FuncionarioTest01

    //La vamos nos utilizar o metodo imprime q a classe abstrata pessoa nos obriga a fazer ;-;
    @Override
    public void imprime() {
        System.out.println("Imprimindo Gerente...");
    }
}
