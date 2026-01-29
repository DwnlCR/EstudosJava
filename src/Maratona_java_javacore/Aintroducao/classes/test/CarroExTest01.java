package Maratona_java_javacore.Aintroducao.classes.test;

import Maratona_java_javacore.Aintroducao.classes.dominio.CarroEx;

import java.util.Scanner;

public class CarroExTest01 {
    public static void main(String[] args) {
        //Crie uma classe Carro com os seguintes atributos: Nome, Modelo, Ano. Em seguida, crie 3 objetos distintos que receba esses valores e sejam imprimidos um modelo após o outro -> fazer isso em CarroTest para manter a boa coesão do codigo
        //Agora faça com que as variaveis de referencia carro1 e carro3 aponte para o mesmo endereço de carro2 e execute o programa novamente: os souts devem sair com o mesmo valor
        Scanner input = new Scanner(System.in);
        CarroEx carro1 = new CarroEx();
        CarroEx carro2 = new CarroEx();
        CarroEx carro3 = new CarroEx();

        System.out.println("Nome: ");
        carro1.nome = input.nextLine();
        System.out.println("Modelo: ");
        carro1.modelo = input.nextLine();
        System.out.println("Ano: ");
        carro1.ano = input.nextInt();

        input.nextLine();//Limpar buffer

        System.out.println("Nome: ");
        carro2.nome = input.nextLine();
        System.out.println("Modelo: ");
        carro2.modelo = input.nextLine();
        System.out.println("Ano: ");
        carro2.ano = input.nextInt();

        input.nextLine();//Limpar buffer

        System.out.println("Nome: ");
        carro3.nome = input.nextLine();
        System.out.println("Modelo: ");
        carro3.modelo = input.nextLine();
        System.out.println("Ano: ");
        carro3.ano = input.nextInt();

        //carro1 = carro2;
        //carro3 = carro2;
        //Com as atribuições acima carro1 e carro3 recebem o endereço q carro2 esta apontando logo todos apontam para o mesmo objeto
        //Não podemos fazer por exemplo Professor professor1 = new Professor() e fazer com que carro1 receba o endereço que proofessor1 aponta por exemplo carro1 = professor1; pois eles esão em niveis de herança distintos mas isso a gente so vai ver la na frente.
        System.out.println("Temos disponivel: "+carro1.nome+" no modelo "+carro1.modelo+" no ano de "+carro1.ano);
        System.out.println("Temos disponivel: "+carro2.nome+" no modelo "+carro2.modelo+" no ano de "+carro2.ano);
        System.out.println("Temos disponivel: "+carro3.nome+" no modelo "+carro3.modelo+" no ano de "+carro3.ano);
    }
}
