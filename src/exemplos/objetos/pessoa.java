package arquivos.objetos;
import java.io.Serializable;

public class pessoa implements Serializable {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome+" "+sobrenome+" CPF: "+cpf;
    }
}
