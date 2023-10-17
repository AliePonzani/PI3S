package Exception;

public class Pessoa {
    String nome;
    byte idade;

    public Pessoa(String nome, byte idade) throws IdadeInvalidaException {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 120) {
            throw new IdadeInvalidaException("Idade inválida!");
        } else {
            this.idade = idade;
        }
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }

    
}
