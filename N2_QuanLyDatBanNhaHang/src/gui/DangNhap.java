package gui; 

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DangNhap extends JFrame implements ActionListener{
    private JPanel pnCenter;
    private JLabel lblTitle;
    private JTextField txtDangNhap;
    private JTextField txtMatKhau;
    private JButton btnDangNhap;
    private JButton btnQuenMatKhau;
    private JButton btnTroGiup;
    private JButton btnThoat;
    private JButton btnDoiMatKhau;
    private JLabel lblDangNhap;
    private JLabel lblMatKhau;
    private JLabel lblRong;
    private JPanel pnBoxDangNhap;

    
    private Image backgroundImage;
	

    public DangNhap() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(""));
        setTitle("Đăng nhập");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(1600, 900);      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        
        backgroundImage = Toolkit.getDefaultToolkit().getImage("img/hinhNen.jpg");
        pnCenter = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
         
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        pnBoxDangNhap = new JPanel();
        pnBoxDangNhap.setLayout(new FlowLayout());

        Box b, b0, b1, b2, b3, b4;

        b = Box.createVerticalBox();
        b.setBounds(591, 293, 369, 159);
        b0 = Box.createHorizontalBox();
        b1 = Box.createHorizontalBox();
        b2 = Box.createHorizontalBox();
        b3 = Box.createHorizontalBox();
        b4 = Box.createHorizontalBox();
        Dimension buttonSize = new Dimension(120, 26); 

        txtDangNhap = new JTextField(25);
        txtMatKhau = new JTextField(25);
        txtDangNhap.setPreferredSize(new Dimension(400, 30)); 
        txtMatKhau.setPreferredSize(new Dimension(400, 30)); 
        lblDangNhap = new JLabel("Tên đăng nhập: ");
        lblMatKhau = new JLabel("Mật khẩu: ");
        lblMatKhau.setPreferredSize(lblDangNhap.getPreferredSize()); 
        
        btnDangNhap = new JButton("Đăng nhập");
        btnDangNhap.setPreferredSize(buttonSize);
        btnDangNhap.setBackground(Color.decode("#00972A")); 
        btnDangNhap.setForeground(Color.WHITE); 
        btnDangNhap.setMinimumSize(buttonSize); 
        btnDangNhap.setMaximumSize(buttonSize); 
        
        btnQuenMatKhau = new JButton("Quên mật khẩu");
        btnQuenMatKhau.setPreferredSize(buttonSize);
        btnQuenMatKhau.setBackground(Color.decode("#E28D0E")); 
        btnQuenMatKhau.setForeground(Color.WHITE); 
        btnQuenMatKhau.setMinimumSize(buttonSize);
        btnQuenMatKhau.setMaximumSize(buttonSize); 
        pnCenter.setLayout(null);
        b1.add(lblDangNhap);
        b1.add(txtDangNhap);
        b1.add(Box.createHorizontalStrut(10)); 
        b2.add(lblMatKhau);
        b2.add(txtMatKhau);
        b2.add(Box.createHorizontalStrut(10)); 
        
        b3.add(Box.createHorizontalStrut(85));    
        b3.add(btnDangNhap);
        b3.add(Box.createHorizontalStrut(8));
        b3.add(btnQuenMatKhau);
        
        b.add(b0);
        b.add(Box.createVerticalStrut(15)); 
        b.add(b1);
        b.add(Box.createVerticalStrut(15)); 
        b.add(b2);
        b.add(Box.createVerticalStrut(15)); 
        b.add(b3);
        pnCenter.add(b);
        btnDangNhap.setPreferredSize(buttonSize);
        btnQuenMatKhau.setPreferredSize(buttonSize);
        getContentPane().add(pnCenter, BorderLayout.CENTER);
        
        btnTroGiup = new JButton("Trợ giúp");
        btnTroGiup.setBounds(1130, 809, 120, 26);
        pnCenter.add(btnTroGiup);
        btnTroGiup.setBackground(Color.decode("#0E30E2")); 
        btnTroGiup.setForeground(Color.white);
        
                btnTroGiup.setPreferredSize(buttonSize);
                btnDoiMatKhau = new JButton("Đổi mật khẩu");
                btnDoiMatKhau.setBounds(1270, 809, 120, 26);
                pnCenter.add(btnDoiMatKhau);
                btnDoiMatKhau.setBackground(Color.decode("#E28D0E")); 
                btnDoiMatKhau.setForeground(Color.white);
                btnDoiMatKhau.setPreferredSize(buttonSize);
                btnThoat = new JButton("Thoát");
                btnThoat.setBounds(1410, 809, 120, 26);
                pnCenter.add(btnThoat);
                btnThoat.setBackground(Color.decode("#E12020")); 
                btnThoat.setForeground(Color.white);
                btnThoat.setPreferredSize(buttonSize);
                
                JLabel lblNewLabel = new JLabel("");
                lblNewLabel.setIcon(new ImageIcon("Dimg\\Logo.png"));
                lblNewLabel.setBounds(0, -17, 225, 181);
                pnCenter.add(lblNewLabel);
                
                lblTitle = new JLabel("ĐĂNG NHẬP");
                lblTitle.setBounds(735, 271, 145, 28);
                pnCenter.add(lblTitle);
                lblTitle.setForeground(new Color(0, 0, 128));
                lblTitle.setFont(new Font("Arial", Font.BOLD, 24)); 
        btnDangNhap.addActionListener(this);
    }

    public static void main(String[] args) {
        DangNhap frame = new DangNhap();
        frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == btnDangNhap) {	        
	        setVisible(false);
			new Menu().setVisible(true);
	    }
	}
}
