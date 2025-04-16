package src.PromptWindows;

import src.TaskDatabase;
import java.util.Date;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import src.TaskifyApp;
import javax.swing.*;

public class AddTaskWindow extends javax.swing.JFrame {
    private TaskifyApp parent;
    private String currentUser;

    public AddTaskWindow(TaskifyApp taskifyApp, String username) {
        initComponents();
        setLocationRelativeTo(parent);
        this.parent = parent;
        this.currentUser = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        taskTitleLabel = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        descLabel = new javax.swing.JLabel();
        scrollableTextArea = new javax.swing.JScrollPane();
        descTextArea = new javax.swing.JTextArea();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        selectDeadline = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(590, 455));

        container.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        taskTitleLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        taskTitleLabel.setText("Task Title:");

        titleTextField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        descLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        descLabel.setText("Description:");

        descTextArea.setColumns(20);
        descTextArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        descTextArea.setRows(5);
        scrollableTextArea.setViewportView(descTextArea);

        confirmButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        selectDeadline.setFocusable(false);
        selectDeadline.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(44, 44, 44)
                .addComponent(confirmButton)
                .addGap(195, 195, 195))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(taskTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(descLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollableTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskTitleLabel)
                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descLabel)
                    .addComponent(scrollableTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(selectDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(confirmButton))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String getTitle = titleTextField.getText().trim();
        String getDescription = descTextArea.getText().trim();
        Date deadline = selectDeadline.getDate();
        
        if (getTitle.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Task title cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        // Actually save to database (using the stored currentUsername)
        boolean success = TaskDatabase.insertTask(getTitle, getDescription, deadline, currentUser);
        
        if (success && parent != null) {
            parent.addTaskToPanel(getTitle, getDescription, deadline);
            JOptionPane.showMessageDialog(this, "Task added successfully!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to save task!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    public static void main(String args[]) {
        FlatDarkLaf.setup();

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(() -> {
            TaskifyApp taskifyApp = new TaskifyApp("testuser");
            taskifyApp.setVisible(true);

            AddTaskWindow addWindow = new AddTaskWindow(taskifyApp, "testuser");
            addWindow.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel descLabel;
    private javax.swing.JTextArea descTextArea;
    private javax.swing.JScrollPane scrollableTextArea;
    private com.toedter.calendar.JDateChooser selectDeadline;
    private javax.swing.JLabel taskTitleLabel;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}
