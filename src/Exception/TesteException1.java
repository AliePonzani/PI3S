package Exception;

import javax.swing.JOptionPane;

public class TesteException1 {
    public static void main(String[] args) {
        tentaDeNovo();
    }

    private static void tentaDeNovo() {
        int vetor[] = { 3, 6, 9 };
        int index = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a posição do vetor que deseja ver"));
        try {
            JOptionPane.showMessageDialog(null,
                    "O valor da posicao é: " + vetor[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "A posicao " + index + " não é valida");
            tentaDeNovo();
        }
    }
}
