import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    JTextField txtNome, txtTelefone, txtEndereco, txtCPF, txtRG;
    JButton btnOk, btnCancelar;

    public Formulario() {
        setTitle("Formulário");
        setSize(300, 200);
        getContentPane().setBackground(new Color(255, 0, 127));
        GridLayout gl = new GridLayout(6, 2, 1, 3);
        getContentPane().setLayout(gl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centralizando formulario na tela

        // criando os campos
        txtNome = criarCampo("Nome: ");
        txtEndereco = criarCampo(" Endereco: ");
        txtTelefone = criarCampo(" Telefone: ");
        txtCPF = criarCampo(" CPF: ");
        txtRG = criarCampo(" RG: ");

        // criar os botões
        btnOk = new JButton("OK");
        btnOk.addActionListener(this);
        getContentPane().add(btnOk);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(this);
        getContentPane().add(btnCancelar);

        setVisible(true);// torna visivel a tela

    }

    public JTextField criarCampo(String texto) {
        JLabel rotulo = new JLabel(texto);
        rotulo.setFont(new Font("Times new Roman", Font.BOLD, 18));
        rotulo.setForeground(Color.blue);
        add(rotulo);

        JTextField campo = new JTextField();
        getContentPane().add(campo);

        return campo;
    }

    // definindo função aos botões
    public void actionPerformed(ActionEvent e) {

        // se o botão ok for pressionado
        if (e.getSource() == btnOk) {
            Validacao validando = new Validacao();

            if (txtCPF.getText().equals("") || txtRG.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            } else {
                if (!validando.validarCpf(txtCPF.getText())) {
                    JOptionPane.showMessageDialog(null, "CPF inválido!");
                    txtCPF.grabFocus();
                } else if (!validando.validarRG(txtRG.getText())) {
                    JOptionPane.showMessageDialog(null, "RG inválido!");
                    txtRG.grabFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "RG e CPF válidos!");
                    System.exit(0);
                }
            }

            // se o botão cancelar for pressionado
        } else if (e.getSource() == btnCancelar) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Formulario();
    }

}
