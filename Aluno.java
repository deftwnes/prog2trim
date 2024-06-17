package aula10;

class Aluno {
    String nome;
    String sobrenome;
    String eMail;
    int codigo;
    float notaUm;
    float notaDois;

    float obterMedia() {
        return (notaUm + notaDois) / 2;
    }

    String verStatus() {
        return obterMedia() >= 6 ? "Aprovado" : "Reprovado";
    }
}

