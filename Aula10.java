package aula10;
public class Aula10 {
        String nome;
        String sobrenome;
        String eMail;
        int codigo;
        float notaUm;
        float notaDois;
        
        float obterMedia(){
            return (notaUm+notaDois)/2;
        }
        String verificaStatus(){
            float media = obterMedia();
            if(media>=8)
                return "aprovado";
            else if(media>=6)
                return "recuperacao";
            else
                return "reprovado";
        }
    }

