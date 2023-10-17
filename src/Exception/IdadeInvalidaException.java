package Exception;

public class IdadeInvalidaException extends Exception{
    public IdadeInvalidaException(String mensagem){
        super(mensagem);
        print();
    }
    public void print() {
        System.out.println("-----IdadeInvalidaException-----");
        System.out.println(getMessage());
        System.out.println("-----IdadeInvalidaException-----");
    }
}
