package Maratona_java_javacore.Gheranca.dominio;

public class Pessoa {
    //Herança01
    //private String nome;
    //private String cpf;
    //Agora vamos criar a classe Endereço
    //private Endereco endereco;

    //Heranaça03 protected
    protected String nome; //private -> protected
    protected String cpf; //private -> protected
    protected Endereco endereco; //private -> protected
    // -> Funcionario

    //Herança01 Não vamos criar o construtor ainda -> Somente na aula Herança04
    //Herança 04 -> Enfim criaremos nosso primeiro construtor aqui nas nossas aulas de herança, mas por que demoramos tanto? vsmos ver isso agora
    //Ao criarmos um construtor em Pessoa com pelo menos um parametro, nossa classe Funcionario tambem deve criar um construtor, mas isso vc entenderá jaja

    public Pessoa(String nome){ //Ao fazer isso veremos 2 erros, um por parte do HerancaTest pois agora os construtores exigem um parametro e um por parte de Funcionario, pois funcionario é ums extensão de Pessoa logo ele tmb deve ter um construtor q siga o mesmo exemplo do construtor de Pessoa, vamos ajeitar esses erros
        this.nome = nome;
    }

    //Agora vamos fazer sobrecargas de metodos para todos os atributos aqui e na classe Funcionario

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, Endereco endereco){
        this(nome,cpf);
        this.endereco = endereco;
    } //Agora vamos fazer de funcionario tambem, afinal, funcionario é uma pessoa com nome, cpf e endereço


    //HerancaTest01 -> Agora vamos criar o metodo imprime
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+ " " +this.endereco.getCep());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
