package arquivos;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
        
public class exemplo1 {
    public static void main(String[] args){
        String caminho = "C:/Users/Manuela/Documents/teste.txt";
        try{
        BufferedWriter arquivo = new BufferedWriter(new FileWriter(caminho));
        for(int i=0;i<10;i++){
            arquivo.append("Linha "+i+"do arquivo\n");
        }
        arquivo.close();
        }
        catch(IOException e){
            System.out.println("Não foi possível criar o arquivo");
        }
    }
}
