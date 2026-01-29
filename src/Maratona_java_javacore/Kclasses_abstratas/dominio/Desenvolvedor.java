package Maratona_java_javacore.Kclasses_abstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
        calcularBonus();
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
    //Agora vamo ver se ta dando certo la em FuncionarioTest01

    //Aula02 -> Metodos abstratos

    //vamos criar a sobreescrita do metodo calculaBonus presente em Funcionario, os desenvolvedores vão ganhar 15% de acrecimo em seu salario
    @Override
    public void calcularBonus(){
        salario += salario * 0.15;
    }

    //La vamos nos utilizar o metodo imprime q a classe abstrata pessoa nos obriga a fazer ;-;
    @Override
    public void imprime() {
        System.out.println("Imprimindo Desenvolvedor...");
    }
}



