package Maratona_java_javacore.Bintroducao.metodos.dominio;

public class ImpressoraEstudante {
    //Usa uma variavel tipo referencia como parametro:
    //estudante do tipo Estudante, ou seja um objeto
    //estudante guarda o endereço de um espaço de memoria
    public void imprime(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
