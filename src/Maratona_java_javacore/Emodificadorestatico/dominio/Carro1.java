package Maratona_java_javacore.Emodificadorestatico.dominio;

public class Carro1 {
    private String nome;
    private double velocidadeMaxima;
    private double velocidadeLimite = 250;

    public Carro1(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void imprime(){
        System.out.println("---------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+ this.velocidadeLimite); //*aqui não devemos
        //mais usar o this.velocidadeLimite e sim o Carro.velocidadeLimite ja que essa velocidade
        //n vale mais para apenas um objeto e sim para todos que forem criados
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
