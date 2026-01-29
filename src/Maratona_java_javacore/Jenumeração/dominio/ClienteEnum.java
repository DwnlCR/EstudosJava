package Maratona_java_javacore.Jenumeração.dominio;

public class ClienteEnum {
    private String nome;
    //Apos criar a Classe especial TipoCliente: sumir com esses 3 atributos ai de baixo e apenas trocar por: private TipoCliente tipoCliente;
//    private String tipo;
//    public static final String PESSOA_FISICA = "PESSOA_FISICA";
//    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";
    private TipoCliente tipocliente;

    //Agora vamos refazer o Construtor, os getters e os setters
    //Logo apos fizermos isso teremos uma chuva de erros em ClienteTest01Enum, então vamo la resolver -> ClienteTest01Enum

    public ClienteEnum(String nome, TipoCliente tipocliente) {
        this.nome = nome;
        this.tipocliente = tipocliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(TipoCliente tipocliente) {
        this.tipocliente = tipocliente;
    }
}