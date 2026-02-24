package Maratona_java_introducao;
import java.util.Scanner; //Classe responsavel por ler o que foi digitado no terminal

public class Aula02LeituraDeDados {
    public static void main(String[] args) {
        //input é a variavel que vai receber algum valor ou qualquer outro conteudo para que depois esse conteudo seja atribuido a uma variavel utilizavel
        //System.in é um objeto passado por parametro que a principio não deve ser mencionado
        Scanner input = new Scanner(System.in);
        System.out.println("Digita teu nome ae: ");
        String nome = input.next(); //A variavel declarada agora do tipo String vai receber apenas uma palavra advinda do terminal, next(): apenas 1 palavra
        System.out.println("Oia ai o 1° nome q tu digitou: " + nome);
        input.nextLine(); //Limpar o buffer e evitar que o enter seja lido como proxima linha e aderido a proxima variavel: Usar após next(), nextInt(), nextDouble()
        System.out.println("Agora digita teu nome completo: ");
        nome = input.nextLine(); //Agora nossa variavel pode receber uma linha inteira, ja que o nextLine() recebe uma linha completa
        System.out.println("Hmmm então teu nome é " + nome + ", interessante");
        System.out.println("Agora me diz tua idade: ");
        int idade = input.nextInt();
        System.out.println("Olha só vc tem " + idade + " anos, q bacana");
        input.nextLine(); //limpar buffer
        System.out.println("Agora digite seu sexo M ou F: ");
        char sexo = input.next().charAt(0); //Assim a "sexo" pega apenas o primeiro caractere da primeira palavra
        System.out.println("Hmmm sexo "+sexo+" então, entendi");
    }
}
