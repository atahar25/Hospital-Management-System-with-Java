package hospital.management.app;

import com.itextpdf.text.Document;
import java.awt.BorderLayout;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mehed
 */
public class PatientDetails extends javax.swing.JFrame {

    private Connection connection;

    /**
     * Creates new form PatientDetails
     */
    public PatientDetails() {
        initComponents();
        initializeTable();
        setTitle("Hospital Management - Patient Section");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }

    private void connectToDatabase() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing_hospital", "root", "root");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Connection Failed.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatientDetailTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PatientName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PatientAge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PatientContact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        GenderBox = new javax.swing.JComboBox<>();
        AddPatientButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        DeletPatientButton = new javax.swing.JButton();
        PrintButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("All Patient Details");

        PatientDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        PatientDetailTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PatientDetailTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(PatientDetailTable);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Patient Name       :");

        PatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Patient Age          :");

        PatientAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientAgeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Contact               :");

        PatientContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientContactActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Patient Gender     :");

        GenderBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        GenderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderBoxActionPerformed(evt);
            }
        });

        AddPatientButton.setBackground(new java.awt.Color(204, 204, 0));
        AddPatientButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddPatientButton.setText("Add Patient");
        AddPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPatientButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        BackButton.setBackground(new java.awt.Color(0, 0, 0));
        BackButton.setForeground(new java.awt.Color(255, 255, 51));
        BackButton.setText("<-Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Add Patient");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(GenderBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(PatientContact))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientContact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        DeletPatientButton.setBackground(new java.awt.Color(255, 0, 0));
        DeletPatientButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DeletPatientButton.setForeground(new java.awt.Color(255, 255, 255));
        DeletPatientButton.setText("Delete");
        DeletPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletPatientButtonActionPerformed(evt);
            }
        });

        PrintButton.setBackground(new java.awt.Color(0, 102, 102));
        PrintButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrintButton.setForeground(new java.awt.Color(255, 255, 255));
        PrintButton.setText("Print");
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeletPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeletPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void initializeTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Age", "Contact", "Gender"});
        PatientDetailTable.setModel(model);
    }


    private void AddPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPatientButtonActionPerformed
        String patientName = PatientName.getText().trim();
        String patientAgeText = PatientAge.getText().trim();
        String patientGender = (String) GenderBox.getSelectedItem();
        String patientContact = PatientContact.getText().trim();

        if (patientName.isEmpty() || patientAgeText.isEmpty() || patientContact.isEmpty() || patientGender == null) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int patientAge = Integer.parseInt(patientAgeText);

            try (PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO patient (PatientName, PatientAge, PatientGender, Contact) VALUES (?, ?, ?, ?)"
            )) {
                // Set the parameters for the query
                stmt.setString(1, patientName);
                stmt.setInt(2, patientAge);
                stmt.setString(3, patientGender);
                stmt.setString(4, patientContact);

                // Execute the insert operation
                stmt.executeUpdate();

                // Add new row to the JTable
                DefaultTableModel tableModel = (DefaultTableModel) PatientDetailTable.getModel();
                tableModel.addRow(new Object[]{patientName, patientAge, patientGender, patientContact});

                // Display success message
                JOptionPane.showMessageDialog(this, "Patient added successfully!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_AddPatientButtonActionPerformed

    private void PatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientNameActionPerformed

    private void PatientAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientAgeActionPerformed

    private void PatientContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientContactActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose(); // Close current screen
        HomePage dashboard = new HomePage();
        dashboard.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void GenderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderBoxActionPerformed

    private void DeletPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletPatientButtonActionPerformed
        int selectedRow = PatientDetailTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a patient to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel tb1Model = (DefaultTableModel) PatientDetailTable.getModel();

        // Ensure the table has at least 4 columns (indices 0 to 3 for your database structure)
        if (tb1Model.getColumnCount() < 4) {
            JOptionPane.showMessageDialog(this, "Table structure is incorrect. Please verify the columns.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Extract patient details from the selected row
        String patientName = (String) tb1Model.getValueAt(selectedRow, 0); // Assuming Name is in the first column
        String patientAge = tb1Model.getValueAt(selectedRow, 1).toString(); // Age in second column
        String patientGender = (String) tb1Model.getValueAt(selectedRow, 2); // Gender in third column
        String patientContact = (String) tb1Model.getValueAt(selectedRow, 3); // Contact in fourth column

        try (PreparedStatement stmt = connection.prepareStatement(
                "DELETE FROM patient WHERE PatientName = ? AND PatientAge = ? AND PatientGender = ? AND Contact = ?"
        )) {
            // Set query parameters
            stmt.setString(1, patientName);
            stmt.setString(2, patientAge);
            stmt.setString(3, patientGender);
            stmt.setString(4, patientContact);

            // Execute the DELETE query
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                // Remove the row from the table model if the database operation succeeded
                tb1Model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Patient deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "No matching patient found in the database.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error while deleting patient: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_DeletPatientButtonActionPerformed

    private void PatientDetailTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PatientDetailTableAncestorAdded
        connectToDatabase();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM patient");
            while (rs.next()) {
                String patientName = rs.getString("PatientName");
                String patientAge = String.valueOf(rs.getInt("PatientAge"));
                String patientGender = rs.getString("PatientGender");
                String patientContact = rs.getString("Contact");

                String tbData[] = {patientName, patientAge, patientGender, patientContact};
                DefaultTableModel tb1Model = (DefaultTableModel) PatientDetailTable.getModel();
                tb1Model.addRow(tbData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_PatientDetailTableAncestorAdded

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed
       JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save File");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        // Add file filter to allow only PDF files
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PDF Documents (*.pdf)", "pdf"));

        // Show save dialog and capture user action
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            // Ensure the file has a .pdf extension
            if (!filePath.toLowerCase().endsWith(".pdf")) {
                filePath += ".pdf";
            }

            // Create the PDF document
            Document document = new Document();

            try {
                PdfWriter.getInstance(document, new FileOutputStream(filePath));
                document.open();

                // Add title to the document
                Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 20);
                Paragraph title1 = new Paragraph("JAVA Hospital", titleFont);

                title1.setAlignment(Element.ALIGN_CENTER);
                title1.setSpacingAfter(40);
                document.add(title1);

                Paragraph title = new Paragraph("Patient Details");
                title.setAlignment(Element.ALIGN_CENTER);
                title.setSpacingAfter(20);
                document.add(title);

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String currentDateTime = dateFormat.format(new Date());
                Font dateFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
                Paragraph dateTime = new Paragraph("Generated on: " + currentDateTime, dateFont);
                dateTime.setAlignment(Element.ALIGN_RIGHT);
                dateTime.setSpacingAfter(20);
                document.add(dateTime);

                // Create a table for the PDF
                DefaultTableModel model = (DefaultTableModel) PatientDetailTable.getModel();
                int columnCount = model.getColumnCount();
                PdfPTable pdfTable = new PdfPTable(columnCount);

                // Add headers to the table
                for (int i = 0; i < columnCount; i++) {
                    PdfPCell header = new PdfPCell(new Phrase(model.getColumnName(i), FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    header.setHorizontalAlignment(Element.ALIGN_CENTER);
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    pdfTable.addCell(header);
                }

                // Add rows to the table
                int rowCount = model.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < columnCount; j++) {
                        pdfTable.addCell(model.getValueAt(i, j).toString());
                    }
                }

                // Add table to the document
                pdfTable.setWidthPercentage(100);
                pdfTable.setSpacingBefore(10);
                document.add(pdfTable);

                // Close the document
                document.close();

                // Show success message
                JOptionPane.showMessageDialog(null, "PDF saved successfully at: " + filePath);

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error while creating PDF: " + e.getMessage());
            }
        } else {
            // User cancelled the save operation
            JOptionPane.showMessageDialog(null, "Save operation cancelled.");
        }
    }//GEN-LAST:event_PrintButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPatientButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeletPatientButton;
    private javax.swing.JComboBox<String> GenderBox;
    private javax.swing.JTextField PatientAge;
    private javax.swing.JTextField PatientContact;
    private javax.swing.JTable PatientDetailTable;
    private javax.swing.JTextField PatientName;
    private javax.swing.JButton PrintButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
