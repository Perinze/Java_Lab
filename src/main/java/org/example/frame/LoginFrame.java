package org.example.frame;

import org.example.user.User;
import org.example.user.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginFrame extends JFrame {
    private final UserService userService;
    private JLabel welcomelabel;
    private JLabel unamelabel;
    private JLabel passwdlabel;
    private JTextField unamefield;
    private JPasswordField passwdfield;
    private JButton loginbtn;
    private JButton exitbtn;
    private JButton regbtn;
    private JLabel rightlabel;
    public LoginFrame(UserService userService) {
        this.userService = userService;
        welcomelabel = new JLabel("XX信息管理系统V1.0");
        welcomelabel.setFont(new Font(Font.SERIF,Font.BOLD,28));
        welcomelabel.setForeground(Color.blue);
        welcomelabel.setLocation(110, 10);
        welcomelabel.setSize(350, 35);
        JPanel loginpane = new JPanel(null);
        loginpane.setBounds(new Rectangle(70, 60, 360, 185));
        loginpane.setBorder(BorderFactory.createEtchedBorder());
        unamelabel = new JLabel("用户名：");
        unamelabel.setBounds(35, 50, 65, 25);
        unamefield = new JTextField();
        unamefield.setBounds(110, 50, 200, 25);
        passwdlabel = new JLabel("密 码：");
        passwdlabel.setBounds(35, 85, 65, 25);
        passwdfield = new JPasswordField();
        passwdfield.setBounds(110, 85, 200, 25);
        /*
        loginbtn = new JButton(new ImageIcon("images/ok.jpg"));
        regbtn = new JButton(new ImageIcon("images/reg.jpg"));
        exitbtn = new JButton(new ImageIcon("images/off.jpg"));
         */
        loginbtn = new JButton("登录");
        regbtn = new JButton("注册");
        exitbtn = new JButton("退出");
        loginbtn.setActionCommand("LOGIN");
        regbtn.setActionCommand("REGISTER");
        exitbtn.setActionCommand("UNDO");
        exitbtn.setActionCommand("EXIT");
        ActionListener listener = new BtnListener();
        loginbtn.addActionListener(listener);
        regbtn.addActionListener(listener);
        exitbtn.addActionListener(event -> System.exit(0));
        loginbtn.setBounds(90, 130, 75, 25);
        regbtn.setBounds(175, 130, 75, 25);
        exitbtn.setBounds(260, 130, 75, 25);
        rightlabel = new JLabel("Copyright©2022-2023,WHUT,All Rights Reserved");
        rightlabel.setBounds(115, 255, 400, 25);
        loginpane.add(unamelabel);
        loginpane.add(unamefield);
        loginpane.add(passwdlabel);
        loginpane.add(passwdfield);
        loginpane.add(loginbtn);
        loginpane.add(regbtn);
        loginpane.add(exitbtn);
        add(welcomelabel);
        add(loginpane);
        add(rightlabel);
        setUndecorated(true);
        setResizable(false);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //省略事件处理程序
    }

    private class BtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            switch (event.getActionCommand()) {
                case "LOGIN" -> {
                    User user = userService.login(unamefield.getText(), Arrays.toString(passwdfield.getPassword()));
                    if (null == user) {
                        JOptionPane.showMessageDialog(null,
                                "用户名或密码错误",
                                "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showConfirmDialog(null,
                                "登录成功",
                                "确认",
                                JOptionPane.YES_NO_OPTION);
                    }
                }
                case "REGISTER" -> {
                    new RegisterFrame(userService);
                }
            }
        }
    }
}