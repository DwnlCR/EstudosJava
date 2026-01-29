package Maratona_java_javacore.Bintroducao.metodos.dominio;

//Vamos editar um pouco nossa Classe funcionario, primeiro vamos fazer de media um atributo, e apos isso transformaremos todos os atributos em atributos privados
public class Funcionario {
    private String nome = null; //Alterado public -> private
    private int idade = 0; //Alterado public -> private
    private double[] salarios = null; //Alterado public -> private
    private double media = 0; //Adicionado

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        //System.out.println(this.salarios); forma errada -> retorna o endereço do array
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println(salario);
        }
        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salarios == null) { //Se salarios não for inicializado
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;
        System.out.println("A média salarial desse vendedor nesses " + salarios.length + " meses foi de: " + media);
    }

    //Agora vamos criar nossos metodos de recebimento de dados para alocar no atributo privado: set, e o nosso metodo que acessa e pega os dados dentro do atributo privado: get
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double [] salarios){
        this.salarios = salarios;
    }

    //public void setMedia(double media){ -> Lembrar de excluir apos a alteração da media
        //this.media = media;
    //}

    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
