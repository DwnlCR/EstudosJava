package Maratona_java_javacore.Mpolimorfismo.servico;

import Maratona_java_javacore.Mpolimorfismo.dominio.Computador;
import Maratona_java_javacore.Mpolimorfismo.dominio.Produto;
import Maratona_java_javacore.Mpolimorfismo.dominio.Tomate;

public class CalcularImposto {
    //Vamos agora criar 2 metodos novos aqui no nossa nova Classe CalcularImposto
    //A primeira vai ser o calcularImpostoComputador() que vai nos retornar um relatorio do imposto aplicado em cada computador
    public static void calcularImpostoComputador(Computador computador){ //Criamos uma variavel local que recebe um computador
        System.out.println("Relatorio de imposto do computador: ");
        double imposto = computador.calcularImposto(); //essa variavel local imposto recebe aquele return do calculo feito em calcularImposto() de computador q é a variavel local tipo Computador que recebe o objeto escolhido
        System.out.println("O imposto a ser pago do computador "+computador.getNome() + " de valor "+computador.getValor()+"R$ é de "+imposto+"R$");
        double valorTotal = computador.getValor()+imposto;
        System.out.println("Valor total a ser pago: "+valorTotal+"R$");
        System.out.println("---------------------------------------");
    }
    //Agora que criamos o metodo para imprimir o relatorio dos computadores vamos fazer o mesmo para os tomates
    public static void calcularImpostoTomate(Tomate tomate){ //Criamos uma variavel local que recebe um computador
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto(); //essa variavel local imposto recebe aquele return do calculo feito em calcularImposto() de computador q é a variavel local tipo Computador que recebe o objeto escolhido
        System.out.println("O imposto a ser pago da caixa de tomate "+tomate.getNome() + " de valor "+tomate.getValor()+"R$ é de "+imposto+"R$");
        double valorTotal = tomate.getValor()+imposto;
        System.out.println("Valor total a ser pago: "+valorTotal+"R$");
        System.out.println("---------------------------------------");
    }
    //Agora sim vamos testar tudo que fizemos finalmente, amem ja tava na hora, vamos criar o pacote test e sua classe ProdutoTest01 -> Criar ProdutoTest01

    // # Olha só que legal aqui estamos nos dnv, vamo por o static nos metodos para podermos chama-los diretamente na classe sem criar um objeto só pra isso -> linha 9, 15 -> adicionar o static -> voltar para a classe de teste

    // $ Ta, agora que vimos que podemos apenas usar uma classe generica pai como a classe produto no lugar das subclasses desde que os atributos pedidos sejam os mesmos que os presentes na classe pai, vejamos o q podemos fazer aqui para melhorar esse codigo
    // $ Em vez de apagarmos e editar o q tem ali em cima vamos fazer um novo metodo aqui em baixo só que generico para englobar todos os produtos, ou seja os objetos criados a partir da classe generica produto terão seu proprio relatorio, os bixin n pode ficar sem, a gente tem q ser justo
    public static void calcularImpostoGenerico(Produto produto){ //Usamos a classe generica produto para que não importa que produto seja feito ele poderá chamar esse metodo generico para receber um relatorio de todos os dados sem especificar que tipo de produto ele é
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto(); //Aqui o produto.calcularImposto basicamente faz com que se por exemplo o objeto que esta chamando esse metodo for um tomate, o produto se torna um tomate então seria algo como tomate.calcularImposto(); ou seja é quase como se fosse uma transformação para se adequar a qualquer um objeto advindo das subclasses de Produto que seja aqui designado
        System.out.println("Produto: "+produto.getNome()+", Valor: "+produto.getValor()+", Imposto aplicado: "+imposto);
        double valorTotal = produto.getValor()+imposto;
        System.out.println("Valor total a ser pago: "+valorTotal+"R$");
        System.out.println("---------------------------------------");
    }
    //Agora vamos testar se nosso novo metodo generico esta funcionando OBS: podemos retirar aquele codigo especifico de cima e apenas manter o generico mas não irei fazer isso por questões didaticas -> Vamo testar -> ProdutoTest02

    // ! Beleza, agora e gente tem que dar um jeito para que nosso antigo metodo generico ache uma forma de mostrar a dataDeValidadedos objetos tomate mas que não faça isso quando esse objeto referenciado for um computador, por fins didaticos eu vou criar um novo metodo generico que engloba todos os anteriores e vou mante-los, vamos criar o metodo calcularImpostoGenericoEspecifico ja que iremos usar os 2 conceitos aprendidos em uma só classe
    public static void calcularImpostoGenericoEspecifico(Produto produto){ //Usamos a classe generica produto para que não importa que produto seja feito ele poderá chamar esse metodo generico para receber um relatorio de todos os dados sem especificar que tipo de produto ele é
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto(); //Aqui o produto.calcularImposto basicamente faz com que se por exemplo o objeto que esta chamando esse metodo for um tomate, o produto se torna um tomate então seria algo como tomate.calcularImposto(); ou seja é quase como se fosse uma transformação para se adequar a qualquer um objeto advindo das subclasses de Produto que seja aqui designado
        System.out.println("Produto: "+produto.getNome()+", Valor: "+produto.getValor()+", Imposto aplicado: "+imposto);
        double valorTotal = produto.getValor()+imposto;
        System.out.println("Valor total a ser pago: "+valorTotal+"R$");
        //Ate aqui o q podiamos fazer era apenas retornar os dados de um produto generico, mas agora queremos que quando for um tomate a dataDeValidade tambem seja retornada ao usuario, vamos fazer isso
        //Primeiro criaremos uma variavel de referencia tipo Tomate e vamos fazer com que ela receba a instancia ou parametro polimorfico pedido pelo metodo calcularImpostoGenericoEspecifico
        //Ta em tese Tomate tomate = produto; deveria funcionar, mas se vc for para pra pensar bem, q garantia eu tenho de que o objeto passado pelo usuario é um tomate ;-;? eu n tenho garantia nenhuma disso, mas eu posso fazer o java confiar em mi e dizer por um cast que sim o usuario vai passar um tomate e q esse metodo pode ser implementado com sucesso, vamos fazer isso
        // % Fazendo condicional de instancia
        if(produto instanceof Tomate){ //Ok aqui aprenderemos algo novo, basicamente o q estamos fazendo aqui é perguntando o parametro polimorfico produto está instanciando um objeto do tipo Tomate? se sim ele pode fazer o cast, mostrando pelo sout a dataDeValidade, se não apenas essa parte do codigo nunca sera vista pelo usuario -> agora que fizemos a condicional vamos na linha 61 para novas instruções -> linha 61
        Tomate tomate = (Tomate) produto; //Aqui eu estou garantindo ao java de que apenas objetos tipo Tomate serão passados para o relatorio
        System.out.println("Data de validade: " + tomate.getDataDeValidade());//Agora iremos mostrar essa informação hehe, vamos testar -> ProdutoTest03
        System.out.println("---------------------------------------");
        }
        // % Vamos la, temos a missão de fazer o java descobrir antes de fazer o processo de cast se o objeto produto enviado é um tomate ou não para que o sout seja executado ou não
        // % Temos que fazer isso antes do procedimento de cast então -> linha 54
        // % Agora que de fato fizemos a condicional, vamos ao ProdutoTest03 testar para ver se agora sim esta dando tudo certo nos relatorios -> ProdutoTest03
    }

}
