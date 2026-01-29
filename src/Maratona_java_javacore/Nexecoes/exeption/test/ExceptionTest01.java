package Maratona_java_javacore.Nexecoes.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        //Agora para exemplificarmos as exeções Checked obrigatorias vamos usar o exemplo basico, tratamento de exeções para arquivos -> metodo criarNovoArquivo

        //Agora que fizemos esse paranaue para podermos criar arquivos sem o medo de algo dar errado finalmente vamos criar um arquivin
        criarNovoArquivo();
        //Bingo, esta funcionando, retornou true, agora se a gente for em "arquivo" e abrimos ele la vai estar nosso teste.txt hehe

    }
    //Vamos criar um metodo para criar arquivos
    private static void criarNovoArquivo(){
        File file = new File(".idea/arquivo\\teste.txt"); //Aqui declaramos o nome do arquivo que sera criado e onde pelo path do arquivo
        //file.createNewFile(); //Agora com o metodo createNewFile deveriamos conseguir criar esse novo arquivo mas isso ainda não é possivel pois o java esta nos obrigando a tratar a exeção para se caso algo de errado, vamos fazer isso por meio do try catch -> linha 14
        try{ //tente, mas tentar o que? tentar nossa criação de arquivo oras, não é isso que queremos tentar?
            boolean isCriado = file.createNewFile(); //Se essa linha resultar em false automaticamente o resto do try não é executado e vai direto para o catch
            System.out.println("Arquivo criado: "+isCriado);
        }catch(IOException e){ //pegue, mas pegar o que? é ai que entra o metodo que ve se a criação do arquivo deu certo ou não, o IOException, ele retorna um boleano falando se foi lançada uma exeção ou não, e então a variavel "e" do tipo boleano recebe o valor de saida do metodo
            //NUNCA, MAS NUNCA MESMO DEIXE O BLOCO CATCH EM BRANCO, FALE O Q ACONTECEU SE N QUISER SER DEMITIDO
            //Evite colocar logica de negocio no catch
            e.printStackTrace(); //Uma das formas de avisar algo no catch usando a variavel que recebe a exeção, o printStackTrace() vai mostrar o percurso da stack geral no console para podermos identificar o erro que aconteceu

            //Agora vamos lançar nossa primeira exeção unchecked do jeito que a gente quiser e bem entender para isso vamos ao RuntimeExceptionTest02

            
        }
    }
}

