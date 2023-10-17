package Exception;

import javax.swing.JOptionPane;

public class TesteException2 {
    public static void main(String[] args) {
        String str;
        String msg = "Digite a informação";
        int icone = JOptionPane.INFORMATION_MESSAGE; //adiciona um icone de alerta na caixa de msg
        int icone2 = JOptionPane.WARNING_MESSAGE; //adiciona um icone de perigo na caixa de msg

        try {
            str = JOptionPane.showInputDialog(null, msg, "msg", icone2);
            char c = str.charAt(0);
            JOptionPane.showMessageDialog(null, str, "Você digitou: ", icone);
            int resp = JOptionPane.showConfirmDialog(null, "Continuar? ");
            if (resp == 0) {
                
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "A váriavel str esta nula (null) ");
            System.out.println("A váriavel str esta nula (null) ");
        }
    }

    private static void tentaDeNovo() {
        int vetor[] = {3,6,9};
          int index = Integer.parseInt(JOptionPane.showInputDialog(
                  "Digite a posição do vetor que deseja ver"));
          try   {
              JOptionPane.showMessageDialog(null, 
                      "O valor da posicao é: " + vetor[index]);
          }
          catch (ArrayIndexOutOfBoundsException e)   {
             JOptionPane.showMessageDialog(null, "A posicao " + index + " não é valida");
             tentaDeNovo();
          }
       }
}
