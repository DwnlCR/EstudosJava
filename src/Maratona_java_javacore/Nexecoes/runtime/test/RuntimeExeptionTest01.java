package Maratona_java_javacore.Nexecoes.runtime.test;

public class RuntimeExeptionTest01 {
    public static void main(String[] args) {
        //Checked e Unchecked, vamos entender o que cada um faz e sua utilidade para nos
        //Primeiro, exeções Checked são aquelas que são filhas diretamente da classe Exeption e não subfilhas passando pelo RunTimeExeption
        //As exeções Checked são aquelas que se não tratadas geram um erro em tempo de compilação, ou seja, o codigo nem compila

        //Quanto as Unchecked exeptions, são as exeções filhas ou da classe Runtime Exeption em si, o stack overflow por exemplo é um runtime exeption, ou seja, quando o assunto são as Unchecked Exeptions o problema nunca é do programa, o problema é voce
        //O legal disso tudo é que podemos fazer tambem essas runtime exeptions nós mesmos, podemos cria-las a nosso bel prazer e é isso que veremos daqui a pouco

        //Mas o que sabemos ate agora é que, as Unchecked exeptions não necessariamente precisam de tratamento, podemos trata-las, mas podemos tambem não trata-las, ja as Checked exeptions nos somos obrigados a tratar de uma forma ou de outra, não tem pra onde correr

        //Agora vamos fazer um exemplo de RunTime Exeption
        //Vamos usar a classe Object que ja é extendida por todas as classes ja que ela tem metodos para testarmos nossas coisinhas
        //Vamos criar um objeto nulo e tentar chamar um de seus metodos, se tudo for como o esperado teremos um NullPointerExeption
        Object object = null;
        System.out.println(object.toString());
        //Bingo

        //Agora vamos ver uma exeção para array, o que acontece se tentarmos acessar um indice alem do q temos no nosso array, por exemplo o indice 5
        int[] nums = {1,2,3};
        System.out.println(nums[5]);
        //A resposta é simples, vai dar uma exeção do tipo ArrayIndexOutOfBoundsExeption, pois estamos tentando acessar um indice que não existe no array
        //Agora que vimos exeções Unchecked advindas da classe RuntimeExeption, vamos mexer um pouquinho com as exeções Checked que são as que nos obrigam a fazer tratamento -> novo pacote Exception -> nova classe ExceptionTest01

    }
}
