package Maratona_java_introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        //int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 10000000;
        double salarioDouble = 200.89;
        float salarioFloat = 0.32F; // tem q adicionar F
        byte idadeByte = 127; // numero maximo 127 numero minimo -128
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean  falso = false;
        char caractere = 65; // 65 na tabela ask é A
        String nome = "Goku"; // String é uma classe não um tipo primitivo
        var nome3 = "vegeta"; // var serve como um curinga para qualquer tipo primitivo ou não

        System.out.println(nome3);
        System.out.println("Oi meu nome é " + nome);
        System.out.println("A idade é: " + idade + " anos");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(nome3);
    }
}
