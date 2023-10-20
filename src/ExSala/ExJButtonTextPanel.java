package ExSala;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExJButtonTextPanel extends JFrame implements ItemListener {
    JLabel l1, L2;
    float n1 = 0, result = 0;
    JTextField t1, t2;
    JPanel p1, p2;
    JRadioButton radio1, radio2, radio3;
    ButtonGroup grupo1, grupo2;

    public static void main(String args[]) {
        new ExJButtonTextPanel();
    }

    //começo criando minha janela
    public ExJButtonTextPanel() {
        setTitle("Uso de botoes de Radio "); //Insiro um titulo 
        setSize(500, 140); // Defino um tamanho
        getContentPane().setLayout(new GridLayout(2, 1)); // Defino o layput, neste caso estou usando FlowLayout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //defino que o [X] vai finalizar meu programa
        setLocationRelativeTo(null); // para centralizar a janela na tela
        
        
        
        //dentro de uma "div(JPanel)" que se chamará p1
        p1 = new JPanel(); //crio minha variavel la em cima que vai ser do tipo JPanel e instancio ela aqui
        p1.setLayout(new FlowLayout(FlowLayout.CENTER)); //defino o layout
        p1.setBackground(new Color(200, 200, 200)); //defino a cor de fundo
        //crio um Label e um campo de texto que ficarão dentro da "div"
        l1 = new JLabel("Digite um valor"); //precisarei de um campo Label, então lá em cima defino a váriavel e a instancio aqui
        l1.setForeground(Color.blue); //defino a cor do texto do meu Label
        t1 = new JTextField(5); //precisarei de um campo de texto, então defino lá em cima minha variavel do tipo JTextField e a instancio aqui, o valor dentro dos () será a quantidade de caracteres
        //insiro os campos criados dentro da "div"
        p1.add(l1); 
        p1.add(t1);
        getContentPane().add(p1);//adiciono minha "div" dentro da minha janela(JFrame)

        //Faço a mesma coisa pra minha outra "div" p2
        p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 3)); //layout terá 2 linhas e 3 colunas
        p2.setBackground(new Color(200, 200, 200));
        
        //insiro 3 botões de ticar
        radio1 = new JRadioButton("10% do valor");
        radio2 = new JRadioButton("20% do valor");
        radio3 = new JRadioButton("30% do valor");
        //defino uma tecla de atalho para cada botão de ticar
        radio1.setMnemonic(KeyEvent.VK_1);
        radio2.setMnemonic(KeyEvent.VK_2);
        radio3.setMnemonic(KeyEvent.VK_3);
        //adiciono o que defini para um evento de clique para estes botões
        radio1.addItemListener(this);
        radio2.addItemListener(this);
        radio3.addItemListener(this);
        //Dizendo que estes botões pertencem a um grupo de botões então só 1 poderá ser selecionado
        grupo1 = new ButtonGroup();
        grupo1.add(radio1);
        grupo1.add(radio2);
        grupo1.add(radio3);

        //crio meu Label e campo de texto
        L2 = new JLabel("% do Valor :"); 
        L2.setForeground(Color.blue);
        t2 = new JTextField();
        t2.setEditable(false); //defino que o usuario não poderá editar este campo de texto

        //adiciono os botões, o Label e o campo de texto dentro da minha "div" p2
        p2.add(radio1);
        p2.add(radio2);
        p2.add(radio3);
        p2.add(L2);
        p2.add(t2);
        //adiciono minha "div" dentro da minha janela(JFrame)
        getContentPane().add(p2);

        //Torno minha janela visivel
        setVisible(true);
    }

    //quando ticar um dos meus JRadioButton 
    public void itemStateChanged(ItemEvent e) { 
        if (t1.getText().length() == 0) //Se meu campo de texto 1 estiver vazio
            return; //não acontece nada
        try { 
            n1 = Float.parseFloat(t1.getText()); //minha váriavel n1 vai receber o valor que o usuario digitar no campo t1
            if (radio1.isSelected())// se o botão radio1 estiver ticado
                result = (n1 * 10) / 100; // meu resultado será
            if (radio2.isSelected()) //se o botão ticado for o radio2
                result = (n1 * 20) / 100;
            if (radio3.isSelected())//se o botão ticado for radio3
                result = (n1 * 30) / 100;
        } catch (NumberFormatException erro) { //se o tipo de numero digitado for incorreto
            t2.setText("Erro"); //exibo erro no meu campo de texto t2
            return;
        }
        t2.setText("" + result); //exibo o resultado no meu campo de texto t2
    }
}