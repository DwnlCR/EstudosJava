package Maratona_java_javacore.Jenumeração.dominio;

//Pronto agora ta bonitinho, agora vamos fazer algumas alterações em -> ClienteSobreescritaDeMetodoEnum01
public enum TipoPagamento {
    //Tava assim

//    DEBITO,
//    CREDITO;


    //Ficou assim apos as alterações depois de *
    //Agora o q vamos fazer basicamente é definir q cada uma dessas "variaveis" possui um escopo onde podemos fazer varias coisas maneiras, inclusive uma delas nós iremos fazer agora mesmo q é sobreescrever o metodo calcularDesconto para se adequar a opção Debito optada pelo cliente
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },


    //Agora vamos fazer o mesmo para Credito :) e logo apos isso vamos lá testar p ver se deu certo :) -> ClienteSobreescritaDeMetodoEnum01
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    //Pronto, mas temos um detalhe, para podermos sobreescrever um metodo precisamos de um metodo ne ;-;? então vamos fazer um metodo que calcula o desconto de acordo com o valor da compra e a escolha do usuario, Credito ou Debito

    public double calcularDesconto(double valor){
        return 0;
    }
    //Se chamarmos agora este metodo lá em ClienteSobreescritaDeMetodo veremos q independente do caso, se o cliente escolher debito ou credito o metodo sempre retorna exatamente 0, vamos ver isso -> ClienteSobreescritaDeMetodo

    // * Beleza, ja vimos o retorno de calcularDesconto = 0; agr como vamos fazer para quando chamarmos o TipoPagamento.Debito ele ter seu proprio calcularDesconto e acontecer o mesmo com TipoPagamento.DEBITO ;-;?, é simples vamos alterar isso diretamente em seu escopo, vamo ali em cima onde DEBITO e CREDITO estão sendo declarados
}
