package PrimeraClase;

import javax.swing.*;

/**
 * Created by Usuario on 03-Mar-17.
 */
public class Pato extends JFrame{
    public Pato(){
        this.setTitle("Main Menu");
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        JButton button1 = new JButton("Botton");
        panel.add(button1);
    }
}
