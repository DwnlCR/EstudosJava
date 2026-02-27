package Maratona_java_javacore.Bintroducao.metodos.dominio;
//Começo do estudo relacionado ao Acoplamento, Modificador de acesso private, get e set
//Acoplamento basicamente é o quanto uma classe está conectada com a outra por exemplo Pessoa e PessoaTest01
//Estão fortemente acopladas por ambas serem publicas -> isso é ruim
//queremos que nossos relacionamento entre classes seja um acoplamento fraco
//private -> Os atributos só vão poder ser acessados pelo próprio objeto em questão
public class Pessoa {
    private String nome; //public -> private
    private int idade; //public -> private

    public void imprime(){
        //Conseguimos acessar os atributos por que apesar de estarem privados
        //eles estão no mesmo objeto que o metodo
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    //Agora vamos criar um metodo que nos permite acessar os atributos privados
    //No caso dar valor aos atributos privados
    public void setNome(String nome){ //Criamos o metodo set com o objetivo de setar valores
        this.nome = nome;//nome = nome -> não funciona por que a variavel local está apenas recebendo a variavel local
        //então o valor não vai para o atributo privado, porem se fizermos this.nome = nome;
        //teremos "Esse" nome que recebe "aquele" nome ou seja
        //o atributo privado do objeto recebe um valor advindo de uma variavel local do metodo
    }
    public void setIdade(int idade){
        if(idade < 0){ //Tratando uma "exeção" -> entre aspas
            // por que não aprendemos ainda de fato como tratar exeções em POO
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }
    //Agora vamos criar um metodo que nos permite "pegar"
    //esses valores dentro do atributo privado
    public String getNome(){ //Não é void por que queremos retornar o valor que está dentro do atributo privado, é String pois o retorno deve ser o mesmo do atributo que queremos buscar
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }

}
