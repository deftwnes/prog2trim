package arquivos.objetos;
import java.io.*;

public class leitura {
    public static void main(String[] args){
        File arquivo = new File("C:/Users/Manuela/Documents/pessoa.db");
        
        try{
            ObjectInputStream leitura = new ObjectInputStream(new FileInputStream(arquivo.getAbsoluteFile()));
        }
        catch(FileNotFoundException e){
            System.out.print("O arquivo não existe");
        }
        catch(IOException e){
            System.out.print("");
        }
    }
}
