package gui;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class PanelNhaHangMenu1 extends JPanel implements ActionListener {
    private JPanel pnChinh;
    private JLabel lblPhai;
    private JLabel lblTrai;
    private JTextField txtKhachHang;
    private TitledBorder borderKH;
    private JTextField txtMaPhieu;
    private TitledBorder borderMP;
    private JTextField txtSoKhach;
    private TitledBorder borderSK;
    private JPanel pnTraiCuoi;
    private JTextField txtNhanVien;
    private TitledBorder borderNV;
    private JTextField txtGio;
    private TitledBorder borderGio;
    private TitledBorder borderTH;
    private JTextField txtTienHang;
    private TitledBorder borderVAT;
    private JTextField txtVAT;
    private JTextField txtGiamGia;
    private TitledBorder borderGG;
    private JButton btnBanThuong;
    private JButton btnBanVIP;
    private JButton btnTatCa;
    private JPanel panelBan; 
    private JPanel pnPhai1;
	private JPanel pnPhai;

    public PanelNhaHangMenu1() {
        pnChinh = new JPanel();
        Box chinh, trai, phai, trai1;
        
        
        chinh = Box.createHorizontalBox();
        trai = Box.createVerticalBox();
        phai = Box.createVerticalBox();

        txtKhachHang = new JTextField(20);
        borderKH = new TitledBorder("Tên Khách Hàng");
        borderKH.setTitleFont(new Font("Arial", Font.PLAIN, 12));
        borderKH.setTitleJustification(TitledBorder.CENTER);
        txtKhachHang.setBorder(borderKH);

        txtMaPhieu = new JTextField(20);
        borderMP = new TitledBorder("Mã Phiếu");
        borderMP.setTitleFont(new Font("Arial", Font.PLAIN, 12));
        borderMP.setTitleJustification(TitledBorder.CENTER);
        txtMaPhieu.setBorder(borderMP);

        txtSoKhach = new JTextField(20);
        borderSK = new TitledBorder("Số Khách");
        borderSK.setTitleFont(new Font("Arial", Font.PLAIN, 12));
        borderSK.setTitleJustification(TitledBorder.CENTER);
        txtSoKhach.setBorder(borderSK);

        trai1 = Box.createHorizontalBox();
        trai1.add(txtKhachHang);
        trai1.add(txtMaPhieu);
        trai1.add(txtSoKhach);

        String[] columnNames = {"Số Lượng", "Tên Sản Phẩm", "Giá Tiền"};
        Object[][] data = {
            {10, "Sản phẩm A", 15000},
            {5, "Sản phẩm B", 25000},
            {20, "Sản phẩm C", 30000},
            {15, "Sản phẩm D", 12000}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        txtNhanVien = new JTextField(20);
        borderNV = new TitledBorder("Nhân Viên");
        borderNV.setTitleFont(new Font("Arial", Font.PLAIN, 12));
        borderNV.setTitleJustification(TitledBorder.CENTER);
        txtNhanVien.setBorder(borderNV);

        txtGio = new JTextField(20);
        borderGio = new TitledBorder("Giờ");
        borderGio.setTitleFont(new Font("Arial", Font.PLAIN, 12));
        borderGio.setTitleJustification(TitledBorder.CENTER);
        txtGio.setBorder(borderGio);

        txtTienHang = new JTextField(20);
        borderTH = new TitledBorder("Tiền Hàng");
        borderTH.setTitleFont(new Font("Arial", Font.PLAIN, 12));
        borderTH.setTitleJustification(TitledBorder.CENTER);
        txtTienHang.setBorder(borderTH);

        txtVAT = new JTextField(20);
        borderVAT = new TitledBorder("VAT");
        borderVAT.setTitleFont(new Font("Arial", Font.PLAIN, 12));
        borderVAT.setTitleJustification(TitledBorder.CENTER);
        txtVAT.setBorder(borderVAT);

        txtGiamGia = new JTextField(20);
        borderGG = new TitledBorder("Giảm Giá");
        borderGG.setTitleFont(new Font("Arial", Font.PLAIN, 12));
        borderGG.setTitleJustification(TitledBorder.CENTER);
        txtGiamGia.setBorder(borderGG);

        pnTraiCuoi = new JPanel();
        pnTraiCuoi.setLayout(new FlowLayout());
        pnTraiCuoi.add(txtNhanVien);
        pnTraiCuoi.add(txtGio);
        pnTraiCuoi.add(txtTienHang);
        pnTraiCuoi.add(txtVAT);
        pnTraiCuoi.add(txtGiamGia);

        btnBanThuong = new JButton("Thường");
        btnBanVIP = new JButton("VIP");
        btnTatCa = new JButton("Tất cả");
   
        btnBanThuong.setBackground(java.awt.Color.decode("#0075E1"));
        btnBanVIP.setBackground(java.awt.Color.decode("#0075E1"));
        btnTatCa.setBackground(java.awt.Color.decode("#0075E1"));
        

        btnBanThuong.setForeground(java.awt.Color.WHITE);
        btnBanVIP.setForeground(java.awt.Color.WHITE);
        btnTatCa.setForeground(java.awt.Color.WHITE);
        btnBanThuong.setPreferredSize(new Dimension(130, 70));
        btnBanVIP.setPreferredSize(new Dimension(130, 70));
        btnTatCa.setPreferredSize(new Dimension(130, 70));

        
   
        btnBanThuong.addActionListener(this);
        btnBanVIP.addActionListener(this);
        btnTatCa.addActionListener(this);

        panelBan = new JPanel();
        panelBan.setLayout(new GridLayout(0,3,15,15));

        pnPhai1 = new JPanel();
        pnPhai1.add(btnBanThuong);
        pnPhai1.add(btnBanVIP);
        pnPhai1.add(btnTatCa);
        JButton test = new JButton("tets");
        pnPhai = new JPanel();
        pnPhai.setLayout(new BorderLayout());
        pnPhai.add(pnPhai1,BorderLayout.NORTH);
        pnPhai.add(panelBan,BorderLayout.CENTER);
        
        phai.add(pnPhai);
//        phai.add(test);
//        phai.add(panelBan);
        
        
        trai.add(trai1);
        trai.add(scrollPane);
        trai.add(pnTraiCuoi);

        chinh.add(trai);
        chinh.add(phai);

        pnChinh.add(chinh);

        add(pnChinh);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        if (e.getSource() == btnBanThuong) {
            panelBan.removeAll();
            addButtonToPanel(panelBan, "Bàn Thường 1", "2");
            addButtonToPanel(panelBan, "Bàn Thường 2", "4");
            addButtonToPanel(panelBan, "Bàn Thường 1", "2");
            addButtonToPanel(panelBan, "Bàn Thường 2", "4");
            addButtonToPanel(panelBan, "Bàn Thường 1", "2");
            addButtonToPanel(panelBan, "Bàn Thường 2", "4");
            addButtonToPanel(panelBan, "Bàn Thường 1", "2");
            addButtonToPanel(panelBan, "Bàn Thường 2", "4");
           
        } else if (e.getSource() == btnBanVIP) {
            panelBan.removeAll();
            addButtonToPanel(panelBan, "Bàn VIP 1", "2");
            addButtonToPanel(panelBan, "Bàn VIP 2", "4");
            addButtonToPanel(panelBan, "Bàn VIP 1", "2");
            addButtonToPanel(panelBan, "Bàn VIP 2", "4");
            addButtonToPanel(panelBan, "Bàn VIP 1", "2");
            addButtonToPanel(panelBan, "Bàn VIP 2", "4");
            addButtonToPanel(panelBan, "Bàn VIP 1", "2");
            addButtonToPanel(panelBan, "Bàn VIP 2", "4");
            
           
        } else if (e.getSource() == btnTatCa) {
            panelBan.removeAll();
            addButtonToPanel(panelBan, "Bàn Thường 1", "2");
            addButtonToPanel(panelBan, "Bàn Thường 2", "4");
            addButtonToPanel(panelBan, "Bàn Thường 1", "2");
            addButtonToPanel(panelBan, "Bàn Thường 2", "4");
            addButtonToPanel(panelBan, "Bàn Thường 1", "2");
            addButtonToPanel(panelBan, "Bàn Thường 2", "4");
            addButtonToPanel(panelBan, "Bàn VIP 1", "2");
            addButtonToPanel(panelBan, "Bàn VIP 2", "4");
            addButtonToPanel(panelBan, "Bàn VIP 1", "2");
            addButtonToPanel(panelBan, "Bàn VIP 2", "4");
            addButtonToPanel(panelBan, "Bàn Thường 1", "2");
            addButtonToPanel(panelBan, "Bàn Thường 2", "4");
            addButtonToPanel(panelBan, "Bàn Thường 1", "2");
            addButtonToPanel(panelBan, "Bàn Thường 2", "4");
            addButtonToPanel(panelBan, "Bàn Thường 1", "2");
            addButtonToPanel(panelBan, "Bàn Thường 2", "4");
            addButtonToPanel(panelBan, "Bàn VIP 1", "2");
            addButtonToPanel(panelBan, "Bàn VIP 2", "4");
            addButtonToPanel(panelBan, "Bàn VIP 1", "2");
            addButtonToPanel(panelBan, "Bàn VIP 2", "4");
           
        }
        panelBan.revalidate();
        panelBan.repaint();
    }

    private void addButtonToPanel(JPanel panel, String tenBan, String soNguoi) {
        JButton btnBan = new JButton("<html>" + tenBan + "<br/>" + soNguoi + " người</html>");
        btnBan.setBackground(java.awt.Color.decode("#0075E1"));
        btnBan.setForeground(java.awt.Color.WHITE);
    
        panel.add(btnBan);
        panel.revalidate();
        panel.repaint();
    }

    public static void main(String[] args) {
        DangNhap frame = new DangNhap();
        frame.setVisible(true);
    }
}
