package Maratona_java_javacore.Kclasses_abstratas.dominio;

public abstract class Funcionario extends Pessoa {
    //Vamos aprender agora como funcionam as classes, atributos e metodos abstratos
    //Bom como nasceu o abstract? pra q q ele serve? pq q ele foi criado?, é isso q eu vou te responder agora
    //As classes abstratas basicamente foram criadas para resolver um problema de design de codigo, vamos imaginar assim, digamos q vc esta em sua empresa, e é obvio q se vc esta na sua empresa la dentro devem ter funcionarios, funcionarios de diversos cargos, devs, analista de requisitos, Engenheiro de Softwares entre outros, ou seja basicamente o q percebemos é, la dentro todos são funcionarios o q muda é seu cargo
    //Ou seja, a classe Funcionario é apenas um template, uma base em q todos que trabalham lá possuem esses atributos aderidos a Funcionario
    //Então o q basicamente concluimos é que Funcionario na verdade é apenas uma forma para pessoas q trabalham na empresa onde todos são especializados, ou seja, funcionario n precisa existir, ele apenas precisa ser uma referencia para a criação de por exemplo um dev, um dev é um funcionario com um cargo basicamente

    //Agora vamos tentar entender esse conceito teorico na pratica, como vamos trabalhar com herança nossos atributos da classe pai serão protected
    protected String nome;
    protected double salario;

    //Agora vamos criar o construtor e a sobreescrita do metodo toString

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        //calcularBonus();
    }

//    @Override
//    public String toString() {
//        return "Funcionario{"+
//                "nome='" + nome + '\'' +
//                ", salario=" + salario +
//                '}';
//    } Apenas comentar depois da adição do abstract em Funcionario e criar a Classe Gerente -> retirar o metodo daqui e colocar em -> Gerente

    //Pronto, agora vamos criar um espaço onde podemos testar as coisas que faremos -> Criar FuncionarioTest01

    //abstract -> onde usaremos isso, pra que serve e como funciona
    //para usarmos o abstract teremos q coloca-lo entre o modificador de acesso e class + nome da classe, nesse caso public abstract class Funcionario
    //para q ele serve? basicamente ele serve para fazer um modelo abstrato de classe para outras classes, vc vai entender isso melhor jaja
    //como funciona? uma classe abstrata n tem escopo, é ela e só ela mesmo pois ela é apenas uma referencia e nada mais, ela n pode ter um corpo, é quase como uma miragem q podemos ver mas não pegar, mas da pra usar ela de exemplo para coisas q podemos pegar

    //Vamos começar pelo 1° passo, onde usaremos, vamos colocar o abstract onde ele deve ficar -> inicio do escopo, pronto fizemos isso, mas por que está dando erro ;-;? -> FuncionarioTest01


    //* Metodos abstratos *
    //Agora iremos fazer nosso primeiro metodo abstrato e vai ser de um calculo de bonus dependendo de qual cargo vc ocupar na empresa

    //Por enquanto vamos começar com um metodo não abstrato
//    public void calcularBonus(){
//        this.salario += this.salario * 0.1;
//    }
    //Se fizermos dessa forma e no construtor chamarmos o calcularBonus o salario de todos os funcionarios independente do cargo terão um acrecimo de 10% em cima do salario original, vamos testar isso, -> colocar calcularBonus(); no construtor -> ver o sout atualizado em FuncionarioTest01

    //Mas n queremos dessa forma ;-;, queremos que cada cargo tenha seu bonus distinto, então vamos fazer isso agora
    //Ou seja, vamos sobreescrever em Desenvolvedor e em Gerente o metodo calcularBonus -> Desenvolvedor, Gerente

    //Agora temos um problema, esse calcuarBonus aqui de Funcionario ta parecendo dependencia emocional, a gente precisa dele para ter uma referencia do q fazer nas outras duas classes dependentes dessa mas ele está nos atrapalhando sempre colocando 10% a mais no salario de qualquer classe advinda dessa ;-;, a gente n poderia ter ela só sendo um exemplo para as outras e n nos atrapalhando n?, e a resposta é sim :) é so usarmos o abstract, mas como???
    //Dessa forma ó: public abstract void calcularBonus();, o q estamos dizendo é, eu n sei o conteudo desse metodo quando for sobreescrevido em outras classes a partir dessa, mas o q eu sei é q ele vai existir pelo menos como uma referencia em todas elas, agr vamos alterar aqui em cima -> linha 44 deixa de existir esse metodo e nasce o novo metodo abstrato -> linha 56

    //Metodo abstrato
    public abstract void calcularBonus();

    //Agora o q faremos para que funcionario pare de intervir no bonus de Desenvolvedor e Gerente é retirar o calcularBonus(); presente no construtor de funcionario e manter em dev e gerente, alem disso aplicamos a metodologia abstrata em calcularBonus assim cada classe define seu bonus e Funcionario por si só se torna apenas uma referencia para as outras classes -> Agr vamos testar para ver se deu tudo certo -> FuncionarioTest01

    //Ok, acabamos de extender pessoa, uma classe abstrata que diz q todas as classes herdadas dessa são obrigadas a ter um metodo imprime q está presente em seu escopo, porem temos um lado bom nisso tudo, o motivo para ter dado apenas 2 erros é o fato de que, quando uma classe abstrata herda outra classe abstrata ela n é obrigada a ter seus metodos e atributos, mas as classes concretas tipo Desenvolvedor e Gerente sim, por isso apenas 2 erros -> Desenvolvedor e Gerente -> adicionar metodo imprime
}
