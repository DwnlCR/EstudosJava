package Maratona_java_javacore.Jenumeração.dominio;

public enum TipoCliente {
    //Ai vcs me perguntam, ta, mai como q usa essa bagaça ;-;?
    //Basicamente tudo que criarmos aqui dentro vai ser do tipo TipoCliente, por exemplo:
//    PESSOA_FISICA,
//    PESSOA_JURIDICA;
//    //Ai vc me pergunta, mai ai n tem nada, so tem PESSOA_FISICA, PESSOA_JURIDICA, cade os tipos desses negocio?
    //Ai q tá o x da questão, n precisa do tipo, porque ambos são do TipoCliente e tambem são constantes, com modificadores de acesso static e final, ou seja na hr da chamada deles a chamada vai ser algo mais ou menos como TipoCliente.VariavelConstante :) agr vamo ver como q isso nos vai ser util -> ClienteEnum



    //Aula3 ClienteCMEnum
    //ClienteConstrutoresMetodosEnumTest01 -> Agora vamos fazer aquilo q falamos, vamos representar PESSOA_FISICA: 1, PESSOA_JURIDICA: 2
    //Então, como q nos vamos fazer isso na verdade ;-;?, apesar de não parecer tambem podemos criar construtores aqui, e o motivo para não conseguirmos fazer por exemplo PESSOA_FISICA(1) e PESSOA_JURIDICA(2) é o simples fato d q isso é a chamda de um construtor, e o nosso construtor atualmente por padrão está vazio


    //TipoCliente() { //Ele está dessa forma atualmente, mas queremos que agora esse construtor receba um inteiro e q esse inteiro seja 1 ou 2 para representar pessoas fisicas ou juridicas
    //}

    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
    int valor; //temos uma regrinha aqui, o int valor não pode vir antes de PESSOA_FISICA(1), PESSOA_JURIDICA(2);
    TipoCliente(int valor){ //Assim q fizermos isso, PESSOA_FISICA e PESSOA_JURIDICA ali de cima vão dar erros pq agr eles esperam um numero para serem representados ou seja PESSOA_FISICA(1), PESSOA_JURIDICA(2);
        //Agora que colocamos os (valor) vamos definir o this.valor e fazer o getter e o setter de valor, mas faz algum sentido eu poder setar esse valor ;-;? n né, n qremos q esse valor seja alterado, se n o negocio aq vira uma balburdia, ou seja, podemos tirar o setter ou podemos apenas fazer public final int valor(Convenção: VALOR pois agr é uma constante) e retirar o getter tambem ja q a pertir do momento q esse valor for definido o final n deixa ser alterado
        this.valor = valor;
    }

    //public int getValor() {
    //    return valor;
    //}
}
