package login;

import javax.swing.*;
import java.awt.*;

public class login extends JDialog {
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JPanel login;

    public login(JFrame parent){
        super(parent);
        setTitle("Login");
        setContentPane(login);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        login login = new login(null);
        

    }
    }

