package Maratona_java_javacore.Gheranca.dominio;

//Mandar eles fazerem do jeito tradicional e depois ensinar herança
//public class Funcionario {
//    private String nome;
//    private String cpf;
//    private Endereco endereco;
//    private double salario;

    //Mas perae ;-; eu ja num vi esses 3 priemeiros atributos em algum lugar nn ;-;???
    //A resposta é sim :) são exatamente os mesmos atributos de pessoa, até por que um funcionario ainda é uma pessoa, talvez em situações precarias mas ainda sim é uma pessoa, mas com nosso conhecimento atual a gente n pode fazer nada com essa informação :(
    //E é agora que finalmente entenderemos um conceito novo para usar essa informação ao nosso favor hehe :)
    //Herança, o q é, onde vive do que se alimenta???? -> A primeira coisa que devemos pensar é que ate agora estavamos pensando da seguinte forma, um professor "tem" varios alunos, uma casa "tem" um endereço, e isso acontece por conta das associações, mas quanto a herança agora iremos pensar da forma "é", um funcionario "é" uma pessoa por exemplo, um carro "é" um veiculo
    //Ou seja no nosso exemplo aqui temos que o funcionario é uma pessoa, mas é uma pessoa com mais alguma coisa
    //N beleza eu ja entendi o conceito, agr como trazemos essa herança de pessoa para funcionario ;-;???, é simples, como funcionario é basicamente uma extenssão de uma simples pessoa utilizaremos a palavra chave extends, agora onde?
    //Ficaria algo tipo assim: public class Funcionario extend Pessoa {private double salario;} -> Oxe mais os atributos sumiram?, não só os atributos na verdade, todos os metodos getters e setters de pessoa tambem não são mais necessarios em funcionario, ja que ele herdou tudo isso da classe Pessoa pelo extend :)

public class Funcionario extends Pessoa {
    private double salario;

    //Herança04: Finalmente podemos criar um construtor, obrigado pela classe pessoa é claro ;-;, la ta feito um construtor com nome de parametro, vamos fazer o mesmo aqui, mas isso n vai funcionar pq temos que chamar o construtor de la para dentro do nosso construtor ;-;
    public Funcionario(String nome){
        //Não podemos fazer this.nome = nome;, temos que chamar é o construtor de Pessoa que tem o parametro String nome usando super, assim ó
        super(nome); //Aqui chamamos o construtor da classe generica que possui apenas nome como parametro -> aagora o HerançaTest ta dando erro dnv pq agora o construtor exige o pararametro nome para ser feito
    }

    //Agora vamos sobrecarregar esse construtor atributo por atributo

    public Funcionario(String nome, String cpf){
        super(nome,cpf);
    }

    public Funcionario(String nome, String cpf, Endereco endereco){
        super(nome,cpf, endereco);
    }

    //Agora vem o diferencial, funcionario é uma pessoa mas ele ganha salario hehe

    public Funcionario(String nome, String cpf, Endereco endereco, double salario){
        super(nome,cpf, endereco);
        this.salario = salario;
        
    }


    //Metodo imprime de Funcionario
    //Queremos basicamente o metodo imprime de Pessoa + this.salario n é mesmo?, mas se criarmos um imprime2 por exemplo fica meio feio, ent vamos usar nosso conceito novo
    //super -> O super é uma caracteristica de chamada assim como o this, em que basicamente podemos chamar metodos da classe mais generica do nosso escopo basicamente, no nosso caso ela funcionaria mais ou menos assim super.imprime();
    //então agora vamos criar um metodo com o mesmo nome do imprime de Pessoa usando o super
    // Fazer esse metodo apenas apos: \\*******//
    public void imprime(){
        super.imprime(); //Pronto deu certo :) mas dessa forma estamos apenas fazendo o mesmo do metodo imprime de Pessoa, por que estamos basicamente usando o metodo de Pessoa, então agora vamos adicionar o salario ao metodo
        System.out.println(this.salario); //Hehe o salario ta aq, agr vamos chamar esse nosso novo metodo e ver como q vai sair essa bagaça -> HerancaTest01
    }

    //Metodo relatorio
    public void relatorio(){
        //System.out.println("Eu "+this.getNome()+" recebi "+this.salario+"R$"); //Vuala conseguimos, mas o detalhe importante que eu n mencionei ainda é que, n é meio feio usar um metodo da classe Pessoa para receber um atributo privado de funcionario ;-;? é claro q se tivessemos public String nome; no nosso escopo inicial precisariamos apenas de um this.nome, mas não temos, pelo menos nn de forma convencional HeHe
        //Q tal a gente usar nosso novo conhecimento em que eu irei passar a vcs agr para fazer isso acontecer?
        //Vamos lá, modificador de acesso: protected, é um modificador utilizado em Classes genericas qua faz com que todos os atributos e até mesmo metodos que antes estavam somente na classe principal sejam repassados a suas subclasses, ou seja se fizermos protected String nome; em Pessoa automaticamente suas subclasses como Funcionario terão acesso a esse mesmo atributo, porem todas as classes que estão nesse mesmo pacote tambem terão acesso a esse atributo nome
        //Vamos em pessoa realizar essa mudança em seus atributos
        //Pronto agora que fizemos essa alteração podemos tentar usar o this.nome nessa subclasse de Pessoa
        System.out.println("Eu "+this.nome+" recebi "+this.salario+"R$"); //Bingo, realmente utilizar o modificador de acesso protected funcionou, isso tambem permite por exemplo que endereço possa chamar this.nome = "Algum nome ai" depois de criar um objeto pessoa, ou seja, independente se a classe é uma pessoa ou não ele tem acesso a todos os atributos protegidos somente por estar no mesmo pacote, ou seja temos q ajeitar isso, concluuimos que quem tem acesso: subclasses d Pessoa independente do pacote e classes do mesmo pacote de Pessoa
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


//Aqui em baixo so tem coisa desnecessaria que ja tem na Classe Pessoa

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    public Endereco getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }
//

