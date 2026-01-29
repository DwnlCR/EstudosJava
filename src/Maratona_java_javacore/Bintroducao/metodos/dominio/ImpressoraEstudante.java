package Maratona_java_javacore.Bintroducao.metodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){ //Usa uma variavel tipo referencia como parametro: estudante do tipo Estudante, ou seja, estudante guarda o endereço de um espaço de memoria
        estudante.nome = "Kakaroto"; //***Tomar cuidado com esse tipo de ação, pois diferente dos metodos com parametros do tipo primitivo, quando estamos falando de metodos de parametros tipo referencia, qualquer mudança nas variaveis dentro do metodo afetam o objeto lidado em questão***
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Bulma"; //Porem se fizermos essa atribuição apenas no fim do metodo, veremos que a variavel nome de referencia estudante terá seu valor alterado e visto somente após a 2° chamada do metodo, ou seja, o metodo muda definitivamente o valor da variavel independente do caso, mas no fim só da para ver essa mudança ao chamar o metodo 2 vezes ou colocando um sout depois da mudança
        System.out.println("Olha o sout aqui hehe, fica vendo como agora estudante.nome virou: "+estudante.nome);
        //Agora se printarmos no seco no psvm de EstudanteTest01 estudante.nome veremos que de fato a variavel mudou seu valor e agora é Bulma, não Marcos, nem Julia, nem Kakaroto, e sim Bulma pois foi a alteração feita por ultimo pelo metodo no objeto.
    }
}
