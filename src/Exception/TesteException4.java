package Exception;

import javax.swing.JOptionPane;

public class TesteException4 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Digite um número!");
        try {
            int num = Integer.parseInt(str);
            System.out.println("O numero digitado foi o "+num);
        } catch (Exception e) {
            System.out.println("Número "+str+" inválido!");
        }
    }
}
