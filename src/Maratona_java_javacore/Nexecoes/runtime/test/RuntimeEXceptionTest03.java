package Maratona_java_javacore.Nexecoes.runtime.test;

public class RuntimeEXceptionTest03 {
    public static void main(String[] args) {
        // O bloco finally é um bloco em conjunto com o try e catch onde são executadas algumas ações (linhas de codigo) independente se o try tiver encontrado um erro ou não
        //Peguemos por exemplo o caso de varias pessoas acessando um arquivo e esse arquivo tem que ser fechado para que aquele programa não fique aberto infinitamente ate mesmo na hora que o usuario sair do arquivo

        abreConexao();
    }
    private static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            //Vamos simular que deu pau aqui logo apos a abertura do arquivo, ou seja, a gente tem q fechar esse bixo independente do q aconteça
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
            //System.out.println("Fechando recurso liberado pelo SO");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;

    }
}
