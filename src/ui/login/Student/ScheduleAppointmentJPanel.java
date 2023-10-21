/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.login.Student;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.AdminPkg.Faculty;
import model.AdminPkg.Student;
import model.DateAndTime.MeetTimeSchedule;

/**
 *
 * @author Sathya
 */
public class ScheduleAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form scheduleAppointmentJPanel
     */
    JPanel userProcessContainer;
    Student student;
    Faculty faculty;

    
    public ScheduleAppointmentJPanel(JPanel userProcessContainer, Student student, Faculty faculty) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.student = student;
        this.faculty = faculty;
        welcomeLbl.setText(this.student.getFull_name());
        availPopulateTable();
        bookedPopulateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        welcomeLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookedAppTbl = new javax.swing.JTable();
        bookAptBtn = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        availAppTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        moreInfoBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Welcome");

        bookedAppTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Appointment ID", "Date", "Timing"
            }
        ));
        jScrollPane1.setViewportView(bookedAppTbl);

        bookAptBtn.setText("Book");
        bookAptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAptBtnActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        availAppTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Appointment ID", "Date", "Timing"
            }
        ));
        jScrollPane2.setViewportView(availAppTbl);

        jLabel2.setText("Your appointments");

        jLabel3.setText("Available Appointments");

        moreInfoBtn.setText(">> More Info");
        moreInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreInfoBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(bookAptBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(moreInfoBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(93, 93, 93)
                                            .addComponent(jLabel2))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(backBtn)))
                        .addGap(0, 85, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(welcomeLbl))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moreInfoBtn)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bookAptBtn)
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        bookedPopulateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void bookAptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAptBtnActionPerformed
        // TODO add your handling code here:
        int index = this.availAppTbl.getSelectedRow();
        if(index==-1)
            JOptionPane.showMessageDialog(this, "Select a booking id"," ERROR",JOptionPane.ERROR_MESSAGE);
        else{
            DefaultTableModel dtm = (DefaultTableModel)availAppTbl.getModel();
            MeetTimeSchedule schedule = (MeetTimeSchedule)dtm.getValueAt(index, 0);
            if(schedule.isActive()){
                schedule.setActive(false);
                availPopulateTable();
                this.student.setApptSchedule(schedule);
                schedule.setStudent(this.student);
                bookedPopulateTable();
                JOptionPane.showMessageDialog(this, "Appointment Booked Successfully");
            }
            
        }
        
    }//GEN-LAST:event_bookAptBtnActionPerformed

    private void moreInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreInfoBtnActionPerformed
        // TODO add your handling code here:
        int index = this.bookedAppTbl.getSelectedRow();
        if(index==-1)
            JOptionPane.showMessageDialog(this, "Select a booking id"," ERROR",JOptionPane.ERROR_MESSAGE);
        else{
            DefaultTableModel dtm = (DefaultTableModel)bookedAppTbl.getModel();
            MeetTimeSchedule schedule = (MeetTimeSchedule)dtm.getValueAt(index, 0);
            MoreScheduleInfoJPanel moreScheduleInfoJPanel = new MoreScheduleInfoJPanel(userProcessContainer, student, faculty, schedule);
            this.userProcessContainer.add("moreScheduleInfoJPanel",moreScheduleInfoJPanel);
            ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
        }
        
    }//GEN-LAST:event_moreInfoBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availAppTbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookAptBtn;
    private javax.swing.JTable bookedAppTbl;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton moreInfoBtn;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables

    private void availPopulateTable() {
      DefaultTableModel dtm = (DefaultTableModel)availAppTbl.getModel();
      dtm.setRowCount(0);
      for(MeetTimeSchedule schedule : this.faculty.getMeetTimeScheduleList()){
          if(schedule.isActive()){
            Object[] obj = new Object[3];
            obj[0] = schedule;
            obj[1] = schedule.getDay();
            obj[2] = schedule.getTiming();
            dtm.addRow(obj);
          }
      }

    }

    private void bookedPopulateTable() {
         DefaultTableModel dtm = (DefaultTableModel)bookedAppTbl.getModel();
         dtm.setRowCount(0);
         for(MeetTimeSchedule schedule : this.student.getApptSchedule()){
             Object[] obj = new Object[4];
             obj[0] = schedule;
             obj[1] = schedule.getDay();
             obj[2] = schedule.getTiming();
             dtm.addRow(obj);
         }
     
    }
}
