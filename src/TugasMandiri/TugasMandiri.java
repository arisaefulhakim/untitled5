package TugasMandiri;

import javax.swing.*;
import java.awt.*;

public class TugasMandiri {
    private JPanel panel1;
    private JButton button1;

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Membuat JFrame
        JFrame frame = new JFrame("Contoh Button dan Tombol Minimize");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Membuat panel
        JPanel panel = new JPanel(new GridLayout(3, 2));

        // Membuat label
        JLabel messageLabel = new JLabel("Message:");
        JLabel statusLabel = new JLabel("Status:");
        JLabel commentLabel = new JLabel("Comment:");

        // Membuat text field
        JTextField messageTextField = new JTextField("Data Received");
        JTextField statusTextField = new JTextField("Halo siswa Algo 2 dan 3");
        JTextField commentTextField = new JTextField("Anda sudah terkoneksi ke server Mimoapps");

        // Membuat button
        JButton button = new JButton("Submit");

        // Menambahkan action listener ke button
        button.addActionListener(e -> {
            // Mengambil teks dari setiap text field dan menampilkannya di console
            String message = messageTextField.getText();
            String status = statusTextField.getText();
            String comment = commentTextField.getText();
            System.out.println(message + " | " + status + " | " + comment);
        });

        // Membuat tombol minimize
        JButton minimizeButton = new JButton("-");
        minimizeButton.setFocusable(false);
        minimizeButton.setBackground(Color.WHITE);
        minimizeButton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        minimizeButton.addActionListener(e -> frame.setExtendedState(Frame.ICONIFIED));

        // Menambahkan komponen ke panel
        panel.add(messageLabel);
        panel.add(messageTextField);
        panel.add(statusLabel);
        panel.add(statusTextField);
        panel.add(commentLabel);
        panel.add(commentTextField);
        panel.add(button);
        panel.add(minimizeButton);

        // Menambahkan panel ke frame
        frame.add(panel, BorderLayout.NORTH);

        // Menampilkan frame
        frame.setVisible(true);
    }
}