package BancoDeDados;

public class Aluno {
    String nome;
    String telefone;
    double nota;
    public Aluno(String nome, String telefone, double nota) {
        this.nome = nome;
        this.telefone = telefone;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    
}
