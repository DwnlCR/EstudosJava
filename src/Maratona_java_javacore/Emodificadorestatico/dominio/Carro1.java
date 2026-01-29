package Maratona_java_javacore.Emodificadorestatico.dominio;

public class Carro1 {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250; //É aqui que faremos nossa mudança, basicamente iremos adicionar um "static" entre public e double, mas o que que esse modificador static faz mermo ;-;?, bom, nosso modificador static basicamente faz com que a velocidade limite pertença a classe principal Carro, n pertence mais a nenhum objeto criado a partir da classe Carro, agora basicamente qualquer objeto criado a partir da classe carro obrigatoriamente tem sua velocidade limite igual a velocidade limite de qualquer outro carro tambem criado por meio dessa classe || transformar em publico dps para exemplificar

    public Carro1(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("---------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+ Carro1.velocidadeLimite); //***aqui não devemos mais usar o this.velocidadeLimite e sim o Carro.velocidadeLimite ja que essa velocidade n vale mais para apenas um objeto e sim para todos que forem criados
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

    public void setVelocidadeMaxima(double velocidadeMxima) {
        this.velocidadeMaxima = velocidadeMxima;
    }
}
