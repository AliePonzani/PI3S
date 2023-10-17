package Exception;

import javax.swing.JOptionPane;

public class TesteExeption6 {
    public static void main(String[] args) {

        try {
            String str1 = JOptionPane.showInputDialog("Digite um valor:");
            String str2 = JOptionPane.showInputDialog("Digite outro valor:");

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            double resp = num1/num2;
            System.out.println("O resultado é "+resp);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Devem ser informados 2 argumentos");
        } catch (NumberFormatException e){
            System.out.println("Erro na conversão de String para inteiro");
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu uma divisão por zero!");
        }
    }
}
