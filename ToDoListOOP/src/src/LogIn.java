package src;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogIn extends javax.swing.JFrame {
    
    ImageIcon showToggle = new ImageIcon("src\\images\\showPassword.png");
    ImageIcon hideToggle = new ImageIcon("src\\images\\hidePassword.png");
    
    public LogIn() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Log In");
        registerLinkActionPerformed();
        togglePasswordVisibility();
        passwordFieldFocusListener();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        registerLabel = new javax.swing.JLabel();
        registerLink = new javax.swing.JLabel();
        logInButton = new javax.swing.JButton();
        toggleVisibility = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        container.setBackground(new java.awt.Color(51, 51, 51));
        container.setForeground(new java.awt.Color(51, 51, 51));
        container.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        container.setFocusable(false);

        usernameLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");

        usernameField.setBackground(new java.awt.Color(102, 102, 102));
        usernameField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));

        passwordLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        passwordField.setBackground(new java.awt.Color(102, 102, 102));
        passwordField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setText("enterpassword");

        registerLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerLabel.setText("Don't have an account? ");

        registerLink.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        registerLink.setForeground(new java.awt.Color(102, 0, 102));
        registerLink.setText("Register here");

        logInButton.setBackground(new java.awt.Color(102, 0, 102));
        logInButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        toggleVisibility.setText("jLabel2");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(registerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerLink))
                    .addComponent(passwordLabel)
                    .addComponent(usernameLabel)
                    .addComponent(passwordField)
                    .addComponent(logInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toggleVisibility)
                .addGap(57, 57, 57))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(usernameLabel)
                .addGap(18, 18, 18)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(passwordLabel)
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toggleVisibility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerLabel)
                    .addComponent(registerLink))
                .addGap(18, 18, 18)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void passwordFieldFocusListener() {
        passwordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                passwordField.selectAll();
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
                if (passwordField.getEchoChar() == (char) 0) {
                    passwordField.setEchoChar('*');
                    toggleVisibility.setIcon(hideToggle);
                } else {
                    passwordField.setEchoChar((char) 0);
                    toggleVisibility.setIcon(showToggle);
                }
            }
        });
    }
    
    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        String user = usernameField.getText();
        String pass = new String(passwordField.getPassword());
    
        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean isAuthenticated = InsertUserToDatabase.checkCredentials(user, pass);
            if (isAuthenticated) {
                JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                
                this.dispose(); 

                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new TaskifyApp(user).setVisible(true);
                    }
                });
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_logInButtonActionPerformed

    public void registerLinkActionPerformed() {
        registerLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        registerLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Register registerWindow = new Register();
                registerWindow.setVisible(true);
                LogIn.this.dispose();
            } @Override
            public void mouseEntered(MouseEvent e) {
                registerLink.setText("<html><u>Register Here</u></html>");
            } @Override
            public void mouseExited(MouseEvent e) {
                registerLink.setText("Register Here");
            }
        });
    }
    
    public static void main(String args[]) {
        FlatDarkLaf.setup();
        
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch( Exception ex ) {
            System.err.println("Failed to initialize LaF");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JButton logInButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel registerLink;
    private javax.swing.JLabel toggleVisibility;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
