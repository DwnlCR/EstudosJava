package Maratona_java_javacore.Jenumeração.dominio;

public class ClienteCMEnum {
    //Tambem podemos fazer nossa enumeração dentro de classes comuns, como por exemplo essa classe em q estamos nesse exato momento, podemos simpleesmente fazer isso em vez de criar uma classe especial enum
    public enum TipoPagamento{
        DEBITO, CREDITO
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento; //Agora aqui declaramos nosso atributo do tipo TipoPagamento

    //Agora vamos criar um construtor e sobreescrever o metodo toString

    public ClienteCMEnum(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "ClienteCMEnum{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                //Aula03
                ", tipoClienteInt=" + tipoCliente.valor + //Caso usar o final ao invez de apenas tirar o getter: tipoCliente.VALOR +, agr vamo testar -> ClienteConstrutoreseMetodosEnumTest01
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
