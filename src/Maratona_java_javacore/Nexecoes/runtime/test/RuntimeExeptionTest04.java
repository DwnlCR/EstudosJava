package Maratona_java_javacore.Nexecoes.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExeptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch(IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }
        catch(ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }
        //Todos os anteriores são runtimes exeptions mais especificas, ou seja, o mais generico tem que ficar por ultimo se não toda vez que tiver uma runtime exeption de qualquer tipo derivado do generico vai entrar nesse caso esteja no começo
        catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceExeption();
        }catch(SQLException | FileNotFoundException e){
            e.printStackTrace();
        }
        //Ou podemos apenas colocar catch(Exeption e){} e evitar 2 linhas
    }
    private static void talvezLanceExeption() throws SQLException, FileNotFoundException{

    }
}
