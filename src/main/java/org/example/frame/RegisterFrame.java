package org.example.frame;

import org.example.user.User;
import org.example.user.UserService;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class RegisterFrame extends JFrame {
    private final UserService userService;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;
    private JRadioButton radioButton;
    private JRadioButton radioButton_2;
    public RegisterFrame(UserService userService) {
        this.userService = userService;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(565, 492);
        setTitle("注册界面");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel label = new JLabel("\u7528\u6237\u6CE8\u518C");
        label.setForeground(Color.BLUE);
        label.setFont(new Font("宋体", Font.BOLD, 25));
        label.setBounds(216, 10, 147, 53);
        contentPane.add(label);
        JLabel lblNewLabel = new JLabel("\u7528 \u6237 \u540D:");
        lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
        lblNewLabel.setBounds(115, 80, 81, 30);
        contentPane.add(lblNewLabel);
        textField = new JTextField();
        textField.setBounds(200, 77, 179, 33);
        contentPane.add(textField);
        textField.setColumns(10);
        JLabel label_1 = new JLabel("\u5BC6 \u7801:");
        label_1.setFont(new Font("宋体", Font.PLAIN, 18));
        label_1.setBounds(115, 128, 81, 30);
        contentPane.add(label_1);
        JLabel label_2 = new JLabel("\u786E\u8BA4\u5BC6\u7801:");
        label_2.setFont(new Font("宋体", Font.PLAIN, 18));
        label_2.setBounds(115, 177, 81, 30);
        contentPane.add(label_2);
        JLabel label_3 = new JLabel("\u6027 \u522B:");
        label_3.setFont(new Font("宋体", Font.PLAIN, 18));
        label_3.setBounds(115, 227, 81, 30);
        contentPane.add(label_3);
        ButtonGroup bg = new ButtonGroup();
        radioButton = new JRadioButton("\u7537");
        radioButton.setFont(new Font("宋体", Font.PLAIN, 18));
        radioButton.setBounds(204, 231, 50, 23);
        contentPane.add(radioButton);
        radioButton_2 = new JRadioButton("\u5973");
        radioButton_2.setFont(new Font("宋体", Font.PLAIN, 18));
        radioButton_2.setBounds(288, 231, 71, 23);
        bg.add(radioButton);
        bg.add(radioButton_2);
        contentPane.add(radioButton_2);
        JLabel label_4 = new JLabel("\u624B \u673A:");
        label_4.setFont(new Font("宋体", Font.PLAIN, 18));
        label_4.setBounds(115, 280, 81, 30);
        contentPane.add(label_4);
        JLabel label_5 = new JLabel("\u90AE \u7BB1:");
        label_5.setFont(new Font("宋体", Font.PLAIN, 18));
        label_5.setBounds(115, 324, 81, 30);
        contentPane.add(label_5);
        passwordField = new JPasswordField();
        passwordField.setBounds(200, 129, 179, 33);
        contentPane.add(passwordField);
        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(200, 177, 179, 33);
        contentPane.add(passwordField_1);
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(200, 275, 179, 33);
        contentPane.add(textField_3);
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(200, 321, 179, 33);
        contentPane.add(textField_4);
        JButton button = new JButton("\u786E \u8BA4");
        button.setFont(new Font("宋体", Font.PLAIN, 18));
        button.setBounds(161, 383, 93, 40);
        button.addActionListener(new BtnListener());
        contentPane.add(button);
        JButton button_1 = new JButton("\u53D6 \u6D88");
        button_1.setFont(new Font("宋体", Font.PLAIN, 18));
        button_1.setBounds(286, 383, 93, 40);
        button_1.addActionListener(event -> super.dispose());
        contentPane.add(button_1);
        textField_5 = new JTextField();
        textField_5.setForeground(Color.RED);
        textField_5.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_5.setEditable(false);
        textField_5.setBounds(389, 78, 28, 30);
        contentPane.add(textField_5);
        textField_5.setColumns(10);
        textField_6 = new JTextField();
        textField_6.setForeground(Color.RED);
        textField_6.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_6.setEditable(false);
        textField_6.setColumns(10);
        textField_6.setBounds(389, 177, 28, 30);
        contentPane.add(textField_6);
        textField_7 = new JTextField();
        textField_7.setForeground(Color.RED);
        textField_7.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_7.setEditable(false);
        textField_7.setColumns(10);
        textField_7.setBounds(389, 275, 28, 30);
        contentPane.add(textField_7);
        textField_8 = new JTextField();
        textField_8.setForeground(Color.RED);
        textField_8.setFont(new Font("宋体", Font.PLAIN, 20));
        textField_8.setEditable(false);
        textField_8.setColumns(10);
        textField_8.setBounds(389, 324, 28, 30);
        contentPane.add(textField_8);
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.setBorder(new LineBorder(Color.LIGHT_GRAY));
        horizontalBox.setBounds(200, 227, 179, 33);
        contentPane.add(horizontalBox);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class BtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String name = textField.getText();
            String pass = Arrays.toString(passwordField.getPassword());
            String repass = Arrays.toString(passwordField_1.getPassword());
            int gender = radioButton.isSelected() ? 1 : radioButton_2.isSelected() ? 0 : 2;
            String tel = textField_3.getText();
            String email = textField_4.getText();
            boolean ok = true;

            if (userService.check("name", name)) {
                textField_5.setText("√");
            } else {
                textField_5.setText("");
                ok = false;
            }

            if (userService.check("tel", tel)) {
                textField_7.setText("√");
            } else {
                textField_7.setText("");
                ok = false;
            }

            if (userService.check("email", email)) {
                textField_8.setText("√");
            } else {
                textField_8.setText("");
                ok = false;
            }

            if (gender == 2) {
                ok = false;
            }

            if (!pass.equals(repass)) {
                textField_6.setText("");
                ok = false;
            } else {
                textField_6.setText("√");
            }

            if (!ok) {
                return;
            }

            User user = new User(
                    name,
                    pass,
                    radioButton.isSelected() ? 1 : 0,
                    textField_3.getText(),
                    textField_4.getText()
            );
            userService.register(user);
            RegisterFrame.this.dispose();
            JOptionPane.showConfirmDialog(null,
                    "注册成功",
                    "确认",
                    JOptionPane.YES_OPTION);
        }
    }
}