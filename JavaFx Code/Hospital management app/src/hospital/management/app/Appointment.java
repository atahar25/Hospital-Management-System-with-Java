package hospital.management.app;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.*;
import javax.swing.table.DefaultTableModel;
import com.mysql.cj.xdevapi.Table;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.control.Cell;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Appointment extends javax.swing.JFrame {

    private Connection connection;

    public Appointment() {
        initComponents();
        setTitle("Hospital Management - Appointment Section");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        connectToDatabase();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DoctorPanel = new javax.swing.JPanel();
        Doctors = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorList = new javax.swing.JList<>();
        specializationComboBox = new javax.swing.JComboBox<>();
        AppoinmentPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        doctorDetailsArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientNameField = new javax.swing.JTextField();
        patientAgeField = new javax.swing.JTextField();
        patientGenderComboBox = new javax.swing.JComboBox<>();
        patientContactField = new javax.swing.JTextField();
        scheduleComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        dateAppoint = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        BookAppointmentButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        DeleteAppointmentButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();
        PrintButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Book Appointment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("jLabel1");

        DoctorPanel.setBackground(new java.awt.Color(0, 102, 102));

        Doctors.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Doctors.setForeground(new java.awt.Color(255, 255, 255));
        Doctors.setText("Doctors");

        doctorList.setBackground(new java.awt.Color(0, 102, 102));
        doctorList.setForeground(new java.awt.Color(255, 255, 255));
        doctorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        doctorList.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                doctorListAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(doctorList);

        specializationComboBox.setBackground(new java.awt.Color(0, 102, 102));
        specializationComboBox.setEditable(true);
        specializationComboBox.setForeground(new java.awt.Color(255, 255, 255));
        specializationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Neurology", "Pediatrics", "Orthopedics", "Oncology", "Radiology", "Pathology", "Gastroenterology", "Psychiatry", "Urology", "Gynecology", "Ophthalmology", "Nephrology", "Endocrinology", "Hematology", "Rheumatology", "Pulmonology", "Immunology", "General Surgery", "Dermatology" }));
        specializationComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        specializationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specializationComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DoctorPanelLayout = new javax.swing.GroupLayout(DoctorPanel);
        DoctorPanel.setLayout(DoctorPanelLayout);
        DoctorPanelLayout.setHorizontalGroup(
            DoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoctorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(DoctorPanelLayout.createSequentialGroup()
                        .addComponent(Doctors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(specializationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        DoctorPanelLayout.setVerticalGroup(
            DoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoctorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(specializationComboBox)
                    .addComponent(Doctors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        AppoinmentPanel.setBackground(new java.awt.Color(0, 102, 51));
        AppoinmentPanel.setForeground(new java.awt.Color(255, 255, 255));

        doctorDetailsArea.setBackground(new java.awt.Color(0, 51, 51));
        doctorDetailsArea.setColumns(20);
        doctorDetailsArea.setForeground(new java.awt.Color(255, 255, 255));
        doctorDetailsArea.setRows(5);
        doctorDetailsArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        doctorDetailsArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                doctorDetailsAreaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(doctorDetailsArea);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Doctor Details:");

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Name:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Schedule:");

        patientNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameFieldActionPerformed(evt);
            }
        });

        patientAgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientAgeFieldActionPerformed(evt);
            }
        });

        patientGenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        patientGenderComboBox.setToolTipText("");

        patientContactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientContactFieldActionPerformed(evt);
            }
        });

        scheduleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("e.g.:  2024-12-11");

        BookAppointmentButton.setBackground(new java.awt.Color(0, 51, 0));
        BookAppointmentButton.setForeground(new java.awt.Color(255, 255, 255));
        BookAppointmentButton.setText("Book Appointment");
        BookAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookAppointmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientContactField)
                            .addComponent(patientGenderComboBox, 0, 251, Short.MAX_VALUE)
                            .addComponent(patientNameField)
                            .addComponent(patientAgeField)
                            .addComponent(scheduleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateAppoint)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BookAppointmentButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(patientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(patientAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(patientGenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(patientContactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(scheduleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(dateAppoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(BookAppointmentButton)
                .addGap(21, 21, 21))
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Appointment");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Appointment");

        javax.swing.GroupLayout AppoinmentPanelLayout = new javax.swing.GroupLayout(AppoinmentPanel);
        AppoinmentPanel.setLayout(AppoinmentPanelLayout);
        AppoinmentPanelLayout.setHorizontalGroup(
            AppoinmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppoinmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AppoinmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppoinmentPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(AppoinmentPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(AppoinmentPanelLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel10)
                .addGap(0, 142, Short.MAX_VALUE))
            .addGroup(AppoinmentPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AppoinmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        AppoinmentPanelLayout.setVerticalGroup(
            AppoinmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppoinmentPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablePanel.setBackground(new java.awt.Color(0, 102, 102));
        tablePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DeleteAppointmentButton.setBackground(new java.awt.Color(0, 51, 51));
        DeleteAppointmentButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteAppointmentButton.setText("Delete Appointment");
        DeleteAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAppointmentButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Appointment Details:");

        scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Patient Age", "Doctor Name", "Schedule", "Date"
            }
        ));
        scheduleTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                scheduleTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(scheduleTable);

        PrintButton.setBackground(new java.awt.Color(0, 102, 102));
        PrintButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrintButton.setForeground(new java.awt.Color(255, 255, 255));
        PrintButton.setText("Print");
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addGroup(tablePanelLayout.createSequentialGroup()
                        .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteAppointmentButton)))
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteAppointmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrintButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        Back.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("<-Back");
        Back.setContentAreaFilled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DoctorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppoinmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AppoinmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DoctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tablePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void specializationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specializationComboBoxActionPerformed
        String specialization = (String) specializationComboBox.getSelectedItem();
        try (PreparedStatement stmt = connection.prepareStatement(
                specialization.equals("All") ? "SELECT name FROM doctors" : "SELECT name FROM doctors WHERE specialization = ?"
        )) {
            if (!specialization.equals("All")) {
                stmt.setString(1, specialization);
            }
            ResultSet rs = stmt.executeQuery();
            DefaultListModel<String> model = new DefaultListModel<>();
            while (rs.next()) {
                model.addElement(rs.getString("name"));
            }
            doctorList.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }//GEN-LAST:event_specializationComboBoxActionPerformed
    private void displayDoctorDetails() {
        String doctorName = doctorList.getSelectedValue();
        if (doctorName != null) {
            try (PreparedStatement stmt = connection.prepareStatement(
                    "SELECT * FROM doctors WHERE name = ?"
            )) {
                stmt.setString(1, doctorName);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    doctorDetailsArea.setText(String.format(
                            "Name: %s\nGender: %s\nSpecialization: %s\nSchedule: %s",
                            rs.getString("name"), rs.getString("gender"),
                            rs.getString("specialization"), rs.getString("schedule")
                    ));
                    scheduleComboBox.removeAllItems(); // Clear existing items
                    // Add the schedule times to the combo box
                    String[] schedules = rs.getString("schedule").split(", ");
                    for (String schedule : schedules) {
                        scheduleComboBox.addItem(schedule);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void DeleteAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAppointmentButtonActionPerformed
        int selectedRow = scheduleTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an appointment to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultTableModel tb1Model = (DefaultTableModel) scheduleTable.getModel();
        String patientName = (String) tb1Model.getValueAt(selectedRow, 0);
        String doctorName = (String) tb1Model.getValueAt(selectedRow, 2);
        String doctorSchedule = (String) tb1Model.getValueAt(selectedRow, 3);

        try (PreparedStatement stmt = connection.prepareStatement(
                "DELETE FROM appointments WHERE patient_name = ? AND doctor_name = ? AND appointment_schedule = ?"
        )) {
            stmt.setString(1, patientName);
            stmt.setString(2, doctorName);
            stmt.setString(3, doctorSchedule);
            stmt.executeUpdate();

            // Remove row from table
            tb1Model.removeRow(selectedRow);
            JOptionPane.showMessageDialog(this, "Appointment deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DeleteAppointmentButtonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        dispose();
        HomePage dashboard = new HomePage();
        dashboard.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void doctorListAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_doctorListAncestorAdded
        String specialization = (String) specializationComboBox.getSelectedItem();
        try (PreparedStatement stmt = connection.prepareStatement(
                specialization.equals("All") ? "SELECT name FROM doctors" : "SELECT name FROM doctors WHERE specialization = ?"
        )) {
            if (!specialization.equals("All")) {
                stmt.setString(1, specialization);
            }
            ResultSet rs = stmt.executeQuery();
            DefaultListModel<String> model = new DefaultListModel<>();
            while (rs.next()) {
                model.addElement(rs.getString("name"));
            }
            doctorList.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        doctorList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                displayDoctorDetails();
            }
        });

    }//GEN-LAST:event_doctorListAncestorAdded

    private void doctorDetailsAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_doctorDetailsAreaAncestorAdded
        displayDoctorDetails();
    }//GEN-LAST:event_doctorDetailsAreaAncestorAdded

    private void BookAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookAppointmentButtonActionPerformed
        String patientName = patientNameField.getText();
        String patientAgeText = patientAgeField.getText();
        String patientGender = (String) patientGenderComboBox.getSelectedItem();
        String patientContact = patientContactField.getText();
        String doctorName = doctorList.getSelectedValue();
        String doctorSchedule = (String) scheduleComboBox.getSelectedItem();
        String date = dateAppoint.getText();

        if (patientName.isEmpty() || patientAgeText.isEmpty() || patientContact.isEmpty() || doctorName == null || doctorSchedule == null || date == null) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int patientAge = Integer.parseInt(patientAgeText);

            try (PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO appointments (patient_name, patient_age, patient_gender, patient_contact, doctor_name, doctor_specialization, appointment_schedule ,appointment_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            )) {
                stmt.setString(1, patientName);
                stmt.setInt(2, patientAge);
                stmt.setString(3, patientGender);
                stmt.setString(4, patientContact);
                stmt.setString(5, doctorName);

                try (PreparedStatement doctorStmt = connection.prepareStatement(
                        "SELECT specialization FROM doctors WHERE name = ?"
                )) {
                    doctorStmt.setString(1, doctorName);
                    ResultSet rs = doctorStmt.executeQuery();
                    if (rs.next()) {
                        stmt.setString(6, rs.getString("specialization"));
                    }
                }

                stmt.setString(7, doctorSchedule);
                stmt.setString(8, date);
                stmt.executeUpdate();

                // Add new row to the table,
                DefaultTableModel tb1Model = (DefaultTableModel) scheduleTable.getModel();
                tb1Model.addRow(new Object[]{patientName, patientAge, doctorName, doctorSchedule, date});
                JOptionPane.showMessageDialog(this, "Appointment booked successfully!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BookAppointmentButtonActionPerformed

    private void patientContactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientContactFieldActionPerformed

    }//GEN-LAST:event_patientContactFieldActionPerformed

    private void patientAgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientAgeFieldActionPerformed

    }//GEN-LAST:event_patientAgeFieldActionPerformed

    private void patientNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameFieldActionPerformed

    }//GEN-LAST:event_patientNameFieldActionPerformed
    @SuppressWarnings("empty-statement")
    private void scheduleTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_scheduleTableAncestorAdded
        connectToDatabase();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM appointments");
            while (rs.next()) {
                String patientName = rs.getString("patient_name");
                String patientAge = String.valueOf(rs.getInt("patient_age"));
                String doctorName = rs.getString("doctor_name");
                String schedule = rs.getString("appointment_schedule");
                String date = rs.getString("appointment_date");

                String tbData[] = {patientName, patientAge, doctorName, schedule,date};
                DefaultTableModel tb1Model = (DefaultTableModel) scheduleTable.getModel();
                tb1Model.addRow(tbData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_scheduleTableAncestorAdded

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

            // Change the title to "Appointment Schedule"
            Paragraph title = new Paragraph("Appointment Schedule");
            title.setAlignment(Element.ALIGN_CENTER);
            title.setSpacingAfter(20);
            document.add(title);

            // Add current date and time
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String currentDateTime = dateFormat.format(new Date());
            Font dateFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
            Paragraph dateTime = new Paragraph("Generated on: " + currentDateTime, dateFont);
            dateTime.setAlignment(Element.ALIGN_RIGHT);
            dateTime.setSpacingAfter(20);
            document.add(dateTime);

            // Create a table for the PDF with appointment details
            DefaultTableModel model = (DefaultTableModel) scheduleTable.getModel(); // Reference to the appointment schedule table
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

            // Add the table to the document
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppoinmentPanel;
    private javax.swing.JButton Back;
    private javax.swing.JButton BookAppointmentButton;
    private javax.swing.JButton DeleteAppointmentButton;
    private javax.swing.JPanel DoctorPanel;
    private javax.swing.JLabel Doctors;
    private javax.swing.JButton PrintButton;
    private javax.swing.JTextField dateAppoint;
    private javax.swing.JTextArea doctorDetailsArea;
    private javax.swing.JList<String> doctorList;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField patientAgeField;
    private javax.swing.JTextField patientContactField;
    private javax.swing.JComboBox<String> patientGenderComboBox;
    private javax.swing.JTextField patientNameField;
    private javax.swing.JComboBox<String> scheduleComboBox;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JComboBox<String> specializationComboBox;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Appointment.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment().setVisible(true);
            }
        });
    }
}
