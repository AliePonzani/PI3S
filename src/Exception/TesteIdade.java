package Exception;

public class TesteIdade {
    //usando o throwns
    // public static void main(String[] args) throws IdadeInvalidaException{
    //     String nome = "João";
    //     byte idade = 121;

    //     Pessoa pessoa1 = new Pessoa(nome, idade);
    //     System.out.println(pessoa1);     
    // }
    //usando o try/catch
    public static void main(String[] args) {
        String nome = "João";
        byte idade = 33;

        try {
            Pessoa pessoa = new Pessoa(nome, idade);
            System.out.println(pessoa);
            
        } catch (IdadeInvalidaException e) {
            e.printStackTrace();
        }
    }
}
