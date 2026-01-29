package Maratona_java_javacore.Bintroducao.metodos.test;

import Maratona_java_javacore.Bintroducao.metodos.dominio.Calculadora;

public class CalculadoraTest01_MetodosSParametros {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //Chamando nosso primeiro metodo **sem parametros**->Observar as diferenças na classe calculadora do dominio, chamamos o metodo usando Objeto.nomeDoMetodo();
        calculadora.somarDoisNumerosSemParametros();
    }
}
