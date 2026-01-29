package Maratona_java_javacore.Jenumeração.dominio;

public class ClienteSMEnum {
    //Vamos transformar esse public enum TipoPagamento em uma classe especial enum para tirar esse treco feio aqui -> TipoPagamento

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    public ClienteSMEnum(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
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
                ", tipoClienteInt=" + tipoCliente.valor +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
