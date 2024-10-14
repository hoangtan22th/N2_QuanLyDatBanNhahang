package gui; 

import javax.swing.*;
import java.awt.*;

public class DangNhap extends JFrame {

    private JPanel pnNorth;
    private JLabel lblLogo;
    private JPanel pnSouth;
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

    public DangNhap() {
        // Thiết lập khung chính
        setTitle("Đăng nhập");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        pnNorth = new JPanel();
        pnCenter = new JPanel();
        pnSouth = new JPanel();

        lblLogo = new JLabel("LOGO");

        Box b, b0, b1, b2, b3, b4;

        b = Box.createVerticalBox();
        b0 = Box.createHorizontalBox();
        b1 = Box.createHorizontalBox();
        b2 = Box.createHorizontalBox();
        b3 = Box.createHorizontalBox();
        b4 = Box.createHorizontalBox();

        lblTitle = new JLabel("ĐĂNG NHẬP");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24)); // Thiết lập phông chữ cho lblTitle

        txtDangNhap = new JTextField(20);
        txtMatKhau = new JTextField(20);
        txtDangNhap.setPreferredSize(new Dimension(300, 30)); 
        txtMatKhau.setPreferredSize(new Dimension(300, 30)); 
        lblDangNhap = new JLabel("Tên đăng nhập: ");
        lblMatKhau = new JLabel("Mật khẩu: ");
        lblMatKhau.setPreferredSize(lblDangNhap.getPreferredSize()); 
        
        lblRong = new JLabel("");
        lblRong.setPreferredSize(lblDangNhap.getPreferredSize()); 
        
        btnDangNhap = new JButton("Đăng nhập");
        btnDangNhap.setBackground(Color.decode("#00972A")); 
        btnDangNhap.setForeground(Color.WHITE); 
      
        
        btnQuenMatKhau = new JButton("Quên mật khẩu");
        btnQuenMatKhau.setBackground(Color.decode("#E28D0E")); 
        btnQuenMatKhau.setForeground(Color.WHITE); 
       
        
        btnTroGiup = new JButton("Trợ giúp");
        btnDoiMatKhau = new JButton("Đổi mật khẩu");
        btnThoat = new JButton("Thoát");

        b0.add(lblTitle);
        b0.add(Box.createHorizontalStrut(10)); // Khoảng cách giữa tiêu đề và ô nhập
        b1.add(lblDangNhap);
        b1.add(txtDangNhap);
        b1.add(Box.createHorizontalStrut(10)); // Khoảng cách giữa ô nhập và nút
        b2.add(lblMatKhau);
        b2.add(txtMatKhau);
        b2.add(Box.createHorizontalStrut(10)); // Khoảng cách giữa ô nhập và nút
        b3.add(Box.createHorizontalStrut(85)); // Khoảng cách bên trái cho nút Đăng nhập
        b3.add(btnDangNhap);
        b3.add(Box.createHorizontalStrut(8)); // Khoảng cách giữa nút đăng nhập và quên mật khẩu
        b3.add(btnQuenMatKhau);
        
        b.add(b0);
        b.add(Box.createVerticalStrut(15)); // Khoảng cách giữa các hàng
        b.add(b1);
        b.add(Box.createVerticalStrut(15)); // Khoảng cách giữa các hàng
        b.add(b2);
        b.add(Box.createVerticalStrut(15)); // Khoảng cách giữa các hàng
        b.add(b3);

        pnNorth.add(lblLogo);
        pnCenter.add(b);
        
        pnSouth.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
        pnSouth.add(btnTroGiup);
        pnSouth.add(Box.createHorizontalStrut(10)); 
        pnSouth.add(btnDoiMatKhau);
        pnSouth.add(Box.createHorizontalStrut(10)); 
        pnSouth.add(btnThoat);
        btnTroGiup.setBackground(Color.decode("#0E30E2")); // Màu cho nút Trợ giúp
        btnDoiMatKhau.setBackground(Color.decode("#E28D0E")); // Màu cho nút Đổi mật khẩu
        btnThoat.setBackground(Color.decode("#E12020")); // Màu cho nút Thoát
        btnTroGiup.setForeground(Color.white);
        btnDoiMatKhau.setForeground(Color.white);
        btnThoat.setForeground(Color.white);

        
        
        pnCenter.setBackground(Color.black);
        pnNorth.setBackground(Color.black);
        pnSouth.setBackground(Color.black);
        add(pnNorth, BorderLayout.NORTH);
        add(pnCenter, BorderLayout.CENTER);
        add(pnSouth, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        DangNhap frame = new DangNhap();
        frame.setVisible(true);
    }
}
