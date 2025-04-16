package src.PromptWindows;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import src.TaskifyApp;
import java.util.Date;
import javax.swing.*;
import java.awt.Component;
import java.text.SimpleDateFormat;
import src.TaskDatabase;
public class EditTaskWindow extends javax.swing.JFrame {

    private TaskifyApp taskifyApp;
    
    public EditTaskWindow(TaskifyApp taskifyApp) {
        initComponents();
        setLocationRelativeTo(null);
        this.taskifyApp = taskifyApp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        descTextArea = new javax.swing.JTextArea();
        titleField = new javax.swing.JTextField();
        selectDeadline = new com.toedter.calendar.JDateChooser();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        titleLabel.setText("Task Title:");

        descLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        descLabel.setText("Description:");

        descTextArea.setColumns(20);
        descTextArea.setRows(5);
        scrollPane.setViewportView(descTextArea);

        cancelButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        confirmButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descLabel)
                            .addComponent(titleLabel))
                        .addGap(18, 18, 18)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(cancelButton)
                        .addGap(44, 44, 44)
                        .addComponent(confirmButton)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descLabel)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(selectDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(confirmButton))
                .addContainerGap(97, Short.MAX_VALUE))
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
        JTabbedPane taskEntries = taskifyApp.getTaskEntries();
        Component selected = taskEntries.getSelectedComponent();

        String getTitle = titleField.getText();
        String getDescription = descTextArea.getText();
        Date deadline = selectDeadline.getDate();

        if (getTitle == null || getTitle.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Task title cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } if (deadline == null) {
            JOptionPane.showMessageDialog(this, "Please select a valid deadline date!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String originalTitle = taskEntries.getTitleAt(taskEntries.getSelectedIndex());

        boolean success = TaskDatabase.updateTask(originalTitle, getTitle, getDescription, deadline);

        if(success) {
            if(taskifyApp != null) {
                JTabbedPane tabbedPane = taskifyApp.getTaskEntries();
                Component selectedTab = tabbedPane.getSelectedComponent();
                if(selectedTab instanceof JPanel) {
                    JPanel taskPanel = (JPanel) selectedTab;
                    for(Component comp : taskPanel.getComponents()) {
                        String name = comp.getName();
                        if(name == null) continue;
                        switch(name) {
                            case "titleLabel":
                                ((JLabel) comp).setText(getTitle);
                                break;
                            case "descriptionArea":
                                ((JTextArea) comp).setText(getDescription);
                                break;
                            case "deadlineLabel":
                                String formattedDate = new SimpleDateFormat("dd/MM/yyyy").format(deadline);
                                ((JLabel) comp).setText(formattedDate);
                                break;
                        } 
                        comp.invalidate();
                        comp.validate();
                        comp.repaint();
                    } 
                    taskEntries.revalidate();
                    taskEntries.repaint();
                    JOptionPane.showMessageDialog(this, "Task updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Selected tab is not a task panel.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Something went wrong. App reference is null.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update task in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        } this.dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed
    
    public static void main(String args[]) {
        FlatDarkLaf.setup();

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel descLabel;
    private javax.swing.JTextArea descTextArea;
    private javax.swing.JScrollPane scrollPane;
    private com.toedter.calendar.JDateChooser selectDeadline;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
