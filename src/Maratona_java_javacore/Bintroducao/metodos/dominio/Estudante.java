package Maratona_java_javacore.Bintroducao.metodos.dominio;

public class Estudante {
        //Parametros tipo primitivo -> Parametros tipo referencia = AQUI A BAIXO:
        public String nome;
        public int idade;
        public char sexo;

        public void imprime(){
                //Agora sim vamos explicar o que é o comando this, para que serve? onde vive? de que se alimenta? é isso que veremos agora hehe
                //Basicamente o this significa "esse", por exemplo: "que cor é esse papel?", ou seja this.papel = cor, ai alguem responde, o papel é branco, ou seja, cor = "Branco", então this.papel = "Branco".
                //O this funciona como uma referencia dentro do objeto, mas para ele funcionar ele deve estar dentro da classe no qual vai buscar o valor a ser recebido
                System.out.println(this.nome); //"Esse" nome é
                System.out.println(this.idade); //"Essa" idade é
                System.out.println(this.sexo); //"Esse" sexo é
                System.out.println("------------------------------------");
        }
}
