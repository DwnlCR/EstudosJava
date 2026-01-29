    package Maratona_java_javacore.Jenumeração.dominio;

    public class Cliente {
        //Beleza agora a gente ta bem proximo do fim das aulas relacionadas a POO, nessa aula iremos aprender sobre enumerações
        //Vamos começar do começo, em algum momento da sua vida como programador vc irá ver situações que requerem ter uma variavel que denomine um tipo de algo, por exemplo, no nosso caso, Clientes podem ser pessoas fisicas ou pessoas juridicas, e é nossa variavel "tipo" que irá guardar essa informação para nós -> ClienteTest01
        private String nome;
        private String tipo;
        //Vamos fazer a validação desses dados inconsistentes, vamos criar a base a ser seguida para todos os clientes feitos a partir desse metodo, depois vamos validar isso em nosso Construtor
        public static final String PESSOA_FISICA = "PESSOA_FISICA";
        public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";
        //Apos criar a Classe especial TipoCliente: sumir com esses 3 dai de cima e apenas trocar por: private TipoCliente tipoCliente;

        //Agora vamos fazer algumas mudanças nesse construtor, ele ta muito jogado pras cobra, qualquer pessoa coloca o tipo de cliente da forma q quer e isso não pode acontecer, temos q ter um padrão a ser seguido
        public Cliente(String nome, String tipo) {
            if(tipo.equals(PESSOA_FISICA) == false && tipo.equals(PESSOA_JURIDICA) == false) {//O equals é basicamente o metodo que faz a comparação entre Strings assim como o == faz com numeros, e ele é case sensitive ou seja "Daniel" != "daniel", lembrando que podemos reescrever essa condição por apenas if(!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)){}
                return;
            } //Basicamente o q fizemos na condição acima foi: se o atributo privado tipo não for igual a uma das variveis PESSOA_JURIDICA ou PESSOA_FISICA, o construtor não termina seu papel, ou seja, o objeto não sai ja que o if da break no processo
            this.nome = nome;
            this.tipo = tipo;
        }

        //Agora vamos sobreescrever  o metodo toString para q ele vire nosso novo imprime
        @Override
        public String toString() {
                return "Cliente{" +
                        "nome='" + nome + '\'' +
                        ", tipo='" + tipo + '\'' +
                        '}';
        }//Agora vamo dar uma curiadinha no ClientesTest01 pra ver se nossa validação deu certo

        //Beleza deu certo, Massss temos um problema: olha só q negocio horroroso if(tipo.equals(PESSOA_FISICA) == false && tipo.equals(PESSOA_JURIDICA) == false){return;} ;-;, e é por isso q o java nos trouxe uma solução para n ficar usando essas coisa feia sem necessidade para tipar(Obrigar o cliente a colocar aquilo que pedimos) algumas situações, e é por isso q estamos na aula de hj
        //Basicamente nosso belissimo javinha nos fez o favor de ter uma classe especial somente para esse tipo de situação e o nome dessa classe é: Enum -> vamos criar uma nova classe especial do tipo Enum no Dominio

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }
