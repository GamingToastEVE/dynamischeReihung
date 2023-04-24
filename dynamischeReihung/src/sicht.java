import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sicht {
    private JRadioButton isEmpty;
    private JButton refresh;
    private JTextArea input;
    private JTextPane array;
    private JTextField arrayInput;


    public sicht() {
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dynArray reihe = new dynArray(arrayInput.getText());
            }
        });
    }

    public static void main(String[] args) {

    }
}
