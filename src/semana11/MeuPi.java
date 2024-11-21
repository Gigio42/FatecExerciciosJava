package semana11;

import java.awt.*;

public class MeuPi extends Frame implements BotaoInter, TextoInter {

    public MeuPi() {
        bt.setText("Botao");
        tf.setText("Texto");
        setLayout(new FlowLayout());
        setBounds(100, 100, 200, 200);
        add(bt);
        add(tf);
    }

    public static void main(String[] args) {
        MeuPi pi = new MeuPi();
        pi.setVisible(true);

        if (pi != null) {
            pi.addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
        }
    }
}
