package Maratona_java_javacore.Emodificadorestatico.dominio;

public class Carro2 {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250; //public -> private apos a criação dos metodos estaticos

    public Carro2(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //Agora vamos criar nosso primeiro metodo estatico aqui na nossa classe principal, a estrutura é: public static tipo de retorno nomeDoMetodo(){}
    //Por exemplo criaremos o metodo setVelocidadeLimite() para que possamos fazer de nosso atributo velocidadeLimite um atributo privado novamente
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro1.velocidadeLimite = velocidadeLimite; //1° regra dos metodos estaticos, podemos usar o this nos metodos não estaticos, pois nos metodos não estaticos é necessario que existam objetos para que seus atributos possam referencia-los, mas nos metodos estaticos eles não necessariamente referenciam algum objeto existente, o metodo estatico pertence a classe, se ele vai referenciar um objeto só Deus sabe, mas ele estará la pronto para isso, nesse momento faremos algo como NomeDoObjeto.atributoEstatico = atributoEstatico; nesse caso -> Carro2.velocidadeLimite = velocidadeLimite;
    }

    //Agora vamos fazer nosso getVelocidadeLimite usando o setVelocidadeLimite de exemplo
    public static double getVelocidadeLimite() {
        return Carro1.velocidadeLimite;
    }//Agora com nosso getter e nosso setter ambos estaticos para velocidadeLimite finalmente podemos alterar o modificador do atributo velocidadeLimite para privado novamente e agora chamar o metodo no CarroTest02

    public void imprime() {
        System.out.println("---------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro2.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
