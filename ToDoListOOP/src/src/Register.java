package src;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Register extends javax.swing.JFrame {
    
    ImageIcon showToggle = new ImageIcon("src\\images\\showPassword.png");
    ImageIcon hideToggle = new ImageIcon("src\\images\\hidePassword.png");

    public Register() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Register");
        togglePasswordVisibility();
        passwordFieldFocusListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        registerUserField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        registerPasswordField = new javax.swing.JPasswordField();
        toggleVisibility = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 460));
        setResizable(false);

        container.setBackground(new java.awt.Color(51, 51, 51));
        container.setForeground(new java.awt.Color(255, 255, 255));

        usernameLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");

        registerUserField.setBackground(new java.awt.Color(102, 102, 102));
        registerUserField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        registerUserField.setForeground(new java.awt.Color(255, 255, 255));

        passwordLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        registerPasswordField.setBackground(new java.awt.Color(102, 102, 102));
        registerPasswordField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        registerPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        registerPasswordField.setText("enterpassword");

        toggleVisibility.setText("jLabel1");

        registerButton.setBackground(new java.awt.Color(102, 0, 102));
        registerButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordLabel)
                    .addComponent(usernameLabel)
                    .addComponent(registerUserField)
                    .addComponent(registerPasswordField)
                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(toggleVisibility)
                .addGap(51, 51, 51))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(usernameLabel)
                .addGap(18, 18, 18)
                .addComponent(registerUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(passwordLabel)
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toggleVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void passwordFieldFocusListener() {
        registerPasswordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                registerPasswordField.selectAll();
            }
        });
    }
    
    public void togglePasswordVisibility() {
        Image showImage = showToggle.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);
        Image hideImage = hideToggle.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);

        showToggle = new ImageIcon(showImage);
        hideToggle = new ImageIcon(hideImage);
        
        toggleVisibility.setIcon(hideToggle);
        toggleVisibility.setText(null);
        
        toggleVisibility.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        toggleVisibility.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (registerPasswordField.getEchoChar() == (char) 0) {
                    registerPasswordField.setEchoChar('*');
                    toggleVisibility.setIcon(hideToggle);
                } else {
                    registerPasswordField.setEchoChar((char) 0);
                    toggleVisibility.setIcon(showToggle);
                }
            }
        });
    }
    
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String user = registerUserField.getText();
        String pass = new String(registerPasswordField.getPassword());

        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //String hashedPassword = PasswordHashing.hashPassword(pass);
            //InsertToDatabase.InsertUserData(user, hashedPassword);
            InsertUserToDatabase.InsertUserData(user, pass);
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        
        this.dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }//GEN-LAST:event_registerButtonActionPerformed

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JPasswordField registerPasswordField;
    private javax.swing.JTextField registerUserField;
    private javax.swing.JLabel toggleVisibility;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
