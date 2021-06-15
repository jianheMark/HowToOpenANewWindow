import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello, THERE.",SwingConstants.CENTER);
    //How to center a label: https://stackoverflow.com/a/19506791/15603477
    NewWindow() {
        label.setBounds(0,0,100,100);
        label.setFont(new Font("helvetica",Font.PLAIN,25));
        label.setForeground(Color.YELLOW);

        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label,BorderLayout.CENTER);
        frame.getContentPane().setBackground(Color.BLUE);
        //frame.pack();
        frame.setVisible(true);

    }
}
