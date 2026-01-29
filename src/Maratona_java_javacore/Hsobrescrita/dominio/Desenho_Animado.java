package Maratona_java_javacore.Hsobrescrita.dominio;

public class Desenho_Animado extends Object{
    private String nome;

    //Vamos reescrever o toString aqui e transforma-lo em um imprime da vida
    public String toString(){ //O icone bonitinhio azul de classe ali do lado significa que estamos sobreescrevendo um mettodo que ja existe
        return "Nome do desenho: "+this.nome;
    } //Pronto reescrevemos ele agora vamos testar p ver se deu certo mermo -> Desenho_AnimadoTest01

    public Desenho_Animado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
