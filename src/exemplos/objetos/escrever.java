package arquivos.objetos;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class escrever {
    public static void main(String[] args){
        File arquivo = new File("C:/Users/Manuela/Documents/pessoa.db");
        try{
        ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsoluteFile()));
        pessoa p1 = new pessoa();
        p1.setNome("Jonas");
        p1.setSobrenome("Silva");
        p1.setCpf("12345678910");
        escrita.writeObject(p1);
        System.out.println("Pessoa"+p1.getNome()+" salva com sucesso!");
        escrita.close();
                }
        catch(IOException e){
            System.out.println("Erro ao criar o arquivo");
        }
    }
}
