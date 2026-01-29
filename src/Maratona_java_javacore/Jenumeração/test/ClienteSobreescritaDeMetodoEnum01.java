package Maratona_java_javacore.Jenumeração.test;

import Maratona_java_javacore.Jenumeração.dominio.ClienteSMEnum;
import Maratona_java_javacore.Jenumeração.dominio.TipoCliente;
import Maratona_java_javacore.Jenumeração.dominio.TipoPagamento;

public class ClienteSobreescritaDeMetodoEnum01 {
    public static void main(String[] args) {
        //Agora que fizemos nossa classe especial enum TipoPagamento podemos chamar ela da mesma forma q TipoCliente apenas TipoPagamento.CONSTANTE;
        ClienteSMEnum cliente1 = new ClienteSMEnum("Daniel", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        ClienteSMEnum cliente2 = new ClienteSMEnum("Iury", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        //Pronto agr q fizemos isso vamos realmente começar a aula de hoje e vai ser a partir de agora, hj aprenderemos como fazer sobreescrita de metodos em uma classe especial Enum, então vamos para -> TipoPagamento
        System.out.println(cliente1);
        System.out.println(cliente2);

        //Hora d testar nosso novo metodo presente na classe Enum TipoPagamento
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        //A saida foi 0 mermo ;-;
        //Isso acontece pois isso q estamos fazendo agora é uma regra de negocio, ou seja, quando escolhermos TipoPagamento.DEBITO automaticamente o calcularDesconto deverá calcular o valor * porcentagem de debito e retornar o resultado, mas isso não foi definido ainda pois ambos CREDITO e DEBITO chamam o mesmo calcularDesconto com o mesmo valor de retorno
        //Por isso vamos especificar agora o q deve acontecer com calcularDesconto em ambos os casos -> TipoPagamento

        //Hehe terminamos as especificações e as sobreescritas do metodo calcularDesconto agr é só testar, como a gente tentou imprimir isso anteriormente é so rodar o codigo dnv

    }
}
