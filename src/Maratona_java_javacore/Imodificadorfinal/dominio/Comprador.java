package Maratona_java_javacore.Imodificadorfinal.dominio;

public class Comprador {
    //Agora iremos utilizar o modificador de acesso final em variaveis ou metodos do tipo referencia, e em seguida relacionaremos comprador com o carro que irá ser comprado
    private String nome;

    //Comprador -> Carro: adicionar um comprador a classe Carro
    //Vamos criar os getters e setters de nome e vamos sobreescrever o metodo toString novamente

    @Override
    public String toString() {
        return super.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
