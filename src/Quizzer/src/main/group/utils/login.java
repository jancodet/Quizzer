package src.main.group.utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private CardLayout cl;
    private JTextField textField_1;
    private JTextField textField_2;
    private JPasswordField passwordField_1;
    private JPasswordField passwordField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login frame = new login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public login() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 384);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        cl = new CardLayout(0, 0);
        setContentPane(contentPane);
        contentPane.setLayout(cl);

        JPanel einloggen = new JPanel();
        contentPane.add(einloggen, "login");
        einloggen.setLayout(null);

        JLabel lblNewLabel = new JLabel("Das beste Quiz EUW");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 31, 414, 62);
        einloggen.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Benutzername:");
        lblNewLabel_1.setBounds(10, 132, 109, 14);
        einloggen.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Passwort:");
        lblNewLabel_2.setBounds(10, 163, 109, 14);
        einloggen.add(lblNewLabel_2);

        textField = new JTextField();
        textField.setBounds(129, 129, 295, 20);
        einloggen.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(129, 160, 295, 20);
        einloggen.add(passwordField);

        JButton btnNewButton = new JButton("Einloggen");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String user = textField.getText();
                String pass = String.valueOf(passwordField.getPassword());
                if (pass.length() > 0 && user.length() > 0) {
                    if (Main.user.loginBenutzer(user, pass, Main.control.connector)) {
                        btnNewButton.setText("Eingeloggt");
                    } else {
                        btnNewButton.setText("Falsche Daten");
                    }
                } else {
                    btnNewButton.setText("Bitte Daten angeben");
                }
            }
        });
        btnNewButton.setBounds(139, 263, 146, 33);
        einloggen.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Registrieren");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.show(contentPane, "register");
            }
        });
        btnNewButton_1.setBounds(10, 11, 122, 29);
        einloggen.add(btnNewButton_1);

        JPanel registrieren = new JPanel();
        contentPane.add(registrieren, "register");
        registrieren.setLayout(null);

        JLabel lblDas = new JLabel("Das beste Quiz EUW");
        lblDas.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblDas.setHorizontalAlignment(SwingConstants.CENTER);
        lblDas.setBounds(10, 31, 414, 62);
        registrieren.add(lblDas);

        JButton btnEinloggen = new JButton("Einloggen");
        btnEinloggen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(contentPane, "login");
            }
        });
        btnEinloggen.setBounds(10, 11, 122, 29);
        registrieren.add(btnEinloggen);

        textField_1 = new JTextField();
        textField_1.setBounds(129, 129, 295, 20);
        registrieren.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(129, 160, 295, 20);
        registrieren.add(textField_2);
        textField_2.setColumns(10);

        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(129, 191, 295, 20);
        registrieren.add(passwordField_1);

        passwordField_2 = new JPasswordField();
        passwordField_2.setBounds(129, 222, 295, 20);
        registrieren.add(passwordField_2);

        JButton btnRegistrieren = new JButton("Registrieren");
        btnRegistrieren.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnRegistrieren.setBounds(139, 263, 146, 33);
        registrieren.add(btnRegistrieren);

        JLabel lblNewLabel_3 = new JLabel("Benutzername:");
        lblNewLabel_3.setBounds(10, 132, 109, 14);
        registrieren.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("E-Mail:");
        lblNewLabel_4.setBounds(10, 163, 109, 14);
        registrieren.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Passwort:");
        lblNewLabel_5.setBounds(10, 194, 109, 14);
        registrieren.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Passwort wiederholen:");
        lblNewLabel_6.setBounds(10, 225, 109, 14);
        registrieren.add(lblNewLabel_6);
    }
}
