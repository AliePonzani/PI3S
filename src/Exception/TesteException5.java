package Exception;

public class TesteException5 {
    public static void main(String[] args) {
        int vetor[] = {3,6,9};
        int index = 2;

        try {
            System.out.println("O elemento na posição "+index+" é o "+vetor[index]);
        } catch (Exception e) {
            System.out.println("A posição "+index+" não é válida!");
        }
        finally{
            System.out.println("Execussão independente de ser gerada uma excessão ou não!");
        }
    }
}