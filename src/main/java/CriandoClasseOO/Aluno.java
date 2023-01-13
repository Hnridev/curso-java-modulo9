package CriandoClasseOO;

public class Aluno {

    public String nome;
    int idade;
    String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;

    public Aluno() {

    }
    public Aluno(String nomePadrao){
        nome = nomePadrao;


    }

    public Aluno(String nomePadrao, int idadePadrao){
        nome = nomePadrao;
        idade = idadePadrao;

    }
}
