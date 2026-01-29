package Maratona_java_javacore.Nexecoes.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        //Vamos lançar nossa primeira exeção do tipo Unchecked, mas para isso vamos criar um metodo que possivelmente pode gerar uma exeção
        try{
            divisao(1, 0);//Isso daqui vai gerar uma exeção ArithmeticException do tipo RunTime, ou seja se quisermos não precisamos tratar essa exeção, mas a gente quer, então vamos trata-la
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Codigo finalizado");
    }

    //O classico metodo para dividir 2 numeros que da uma exeção caso o 2 numero passado seja 0
    private static int divisao(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Argumento invalido, segundo numero não pode ser 0");
        }
        return a/b;
//        try{
//            return  a/b;
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//        return 0;
//    }

        //Agora que entendemos como lançar uma exeção Runtime vamos saber agora como é feito o lançamento de exeções Checked e suas caracteristicas de tratamento -> ExceptionTest01
    }
}