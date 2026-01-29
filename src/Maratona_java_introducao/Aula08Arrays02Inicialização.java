package Maratona_java_introducao;

public class Aula08Arrays02Inicialização {
    public static void main(String[] args) {
        //Para byte, short, int, long, double: inicializa todas as posições em 0
        //Para char: '\u0000' -> Imprime um espaço em branco ou um quadrado estranho que simboliza espaço em branco
        //Para boolean: false
        //Para String: null
        char[] nomes = new char[3];
        System.out.println(nomes[0]);
        float[] notas = new float[3];
        System.out.println(notas[0]);
        boolean[] V_ou_F = new boolean[3];
        System.out.println(V_ou_F[0]);
        String[] palavras = new String[3];
        System.out.println(palavras[0]);
    }
}