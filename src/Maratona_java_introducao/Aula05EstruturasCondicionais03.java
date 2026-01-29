package Maratona_java_introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 4000;
        String mensagemDoar = "Irei doar 500 reais";
        String mensagemNaoDoar = "Nao estou em condições ainda";
        //(condicao) ? verdadeiro : falso
        String mensagemResul = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(mensagemResul);
    }
}
