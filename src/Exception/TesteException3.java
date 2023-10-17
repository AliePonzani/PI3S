package Exception;

import javax.swing.JOptionPane;

public class TesteException3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));

        try {
            double c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero!");
        }
    }
}
