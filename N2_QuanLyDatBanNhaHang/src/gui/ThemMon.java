/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;



/**
 *
 * @author Admin
 */
public class ThemMon extends javax.swing.JFrame {

    public ThemMon() {
        initComponents();
        setSize(1300, 900);
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();        
        searchButton = new javax.swing.JButton("Tìm kiếm");


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Số lượng", "Tên hàng", "Tiền hàng"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Mã phiếu");

        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Ngày đặt");

        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Số khách");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("4,150,000");

        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setText("Tên khách đặt");

        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("Ghi chú");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("HA08");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Bàn đặt: ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 255));
        jLabel17.setText("0891234567");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 255));
        jLabel19.setText("Tên nhân viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel9)
        					.addPreferredGap(ComponentPlacement.RELATED, 374, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(9)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel5))
        							.addGap(18)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel8)))
        						.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel10)
        						.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel11)
        						.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(6)
        							.addComponent(jLabel19)
        							.addGap(110)
        							.addComponent(jLabel17))))
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(10))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(97)
        			.addComponent(jLabel13)
        			.addGap(67)
        			.addComponent(jLabel12)
        			.addGap(0, 195, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel12)
        				.addComponent(jLabel13))
        			.addGap(9)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel10)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(7)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jLabel8))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel11)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel17)
        				.addComponent(jLabel19))
        			.addGap(5)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
        			.addGap(769)
        			.addComponent(jLabel9)
        			.addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel4.setBackground(new java.awt.Color(0, 51, 255));
        jPanel4.setForeground(new java.awt.Color(0, 51, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Thêm món");
        jLabel14.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thêm");

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Món ăn");

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Nước");

        Dimension size = new Dimension(50, 30);
        jButton2.setPreferredSize(size);
        jButton3.setPreferredSize(size);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Số lượng", "Tên hàng", "Tiền hàng"
            }
        ));
        jScrollPane3.setViewportView(jTable2);



        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(20)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jScrollPane3)))
        				.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(30)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        					.addGap(48)
        					.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        		.addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        			.addContainerGap(619, Short.MAX_VALUE)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        			.addGap(24))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        			.addGap(26)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        			.addGap(35)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        			.addGap(300)
        			.addComponent(jLabel1)
        			.addGap(462))
        );
        jPanel3.setLayout(jPanel3Layout);



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 507, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 515, GroupLayout.PREFERRED_SIZE))
        			.addGap(709))
        );
        getContentPane().setLayout(layout);

        pack();
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemMon().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;   
    private javax.swing.JButton searchButton;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
