package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Menu extends JFrame implements ActionListener {

	private JMenuItem itemNhaHang1, itemNhaHang2;
	private JMenuItem itemDatCho1, itemDatCho2;
	private JMenuItem itemNhanVien1, itemNhanVien2;
	private JMenuItem itemKhachHang1, itemKhachHang2;
	private JMenuItem itemThongKe1, itemThongKe2;
	private JMenuItem itemBan1, itemBan2;
	private JMenuItem itemMonAn1, itemMonAn2;
	private JMenuItem itemTheVip1, itemTheVip2;
    private CardLayout cardLayout;
    private JPanel contentPanel;
	private JMenuItem itemNhaHang3;

    public Menu() {
        setTitle("Menu");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(1600, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.setBackground(Color.decode("#0075E1")); 

        JMenu jMenuNhaHang = new JMenu("Nhà hàng");
        itemNhaHang1 = new JMenuItem("Đặt bàn");
        itemNhaHang2 = new JMenuItem("yyy");
        jMenuNhaHang.setIcon(new ImageIcon(new ImageIcon("img/iconNhaHang.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        jMenuNhaHang.setForeground(Color.WHITE); 
        itemNhaHang1 = new JMenuItem("Đặt bàn");
        itemNhaHang2 = new JMenuItem("Đặt chỗ");
        itemNhaHang3 = new JMenuItem("Thanh toán");
        jMenuNhaHang.add(itemNhaHang1);
        jMenuNhaHang.add(itemNhaHang2);
        jMenuNhaHang.add(itemNhaHang3);
        jMenuBar.add(jMenuNhaHang);

        JMenu jMenuDatCho = new JMenu("Đặt chỗ");
        jMenuDatCho.setIcon(new ImageIcon(new ImageIcon("img/iconNhaHang.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        jMenuDatCho.setForeground(Color.WHITE);
        itemDatCho1 = new JMenuItem("xxx");
        itemDatCho2 = new JMenuItem("xxx");
        jMenuDatCho.add(itemDatCho1);
        jMenuDatCho.add(itemDatCho2);

  
        JMenu jMenuNhanVien = new JMenu("Nhân viên");
        itemNhanVien1 = new JMenuItem("Quản lý nhân viên");
//        itemNhanVien2 = new JMenuItem("yyy");
        jMenuNhanVien.setIcon(new ImageIcon(new ImageIcon("img/iconNhanVien.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        jMenuNhanVien.setForeground(Color.WHITE);
        itemNhanVien1 = new JMenuItem("xxx");
        itemNhanVien2 = new JMenuItem("yyy");
        jMenuNhanVien.add(itemNhanVien1);
//        jMenuNhanVien.add(itemNhanVien2);
        jMenuBar.add(jMenuNhanVien);

        JMenu jMenuKhachHang = new JMenu("Khách hàng");
        itemKhachHang1 = new JMenuItem("Quản lý khách hàng");
//        itemKhachHang2 = new JMenuItem("yyy");
        jMenuKhachHang.setIcon(new ImageIcon(new ImageIcon("img/iconNhanVien.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        jMenuKhachHang.setForeground(Color.WHITE);
        itemKhachHang1 = new JMenuItem("xxx");
        itemKhachHang2 = new JMenuItem("yyy");
        jMenuKhachHang.add(itemKhachHang1);
//        jMenuKhachHang.add(itemKhachHang2);
        jMenuBar.add(jMenuKhachHang);

        JMenu jMenuThongKe = new JMenu("Thống kê");
        jMenuThongKe.setIcon(new ImageIcon(new ImageIcon("img/iconThongKe.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        jMenuThongKe.setForeground(Color.WHITE);
        itemThongKe1 = new JMenuItem("xxx");
        itemThongKe2 = new JMenuItem("yyy");
        jMenuThongKe.add(itemThongKe1);
        jMenuThongKe.add(itemThongKe2);
        jMenuBar.add(jMenuThongKe);

        JMenu jMenuBan = new JMenu("Bàn");
        jMenuBan.setIcon(new ImageIcon(new ImageIcon("img/iconBan.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        jMenuBan.setForeground(Color.WHITE);
        itemBan1 = new JMenuItem("Quản lý bàn");
        jMenuBan.add(itemBan1);
        jMenuBar.add(jMenuBan);

        JMenu jMenuMonAn = new JMenu("Món ăn");
        jMenuMonAn.setIcon(new ImageIcon(new ImageIcon("img/iconMonAN.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        jMenuMonAn.setForeground(Color.WHITE);
        itemMonAn1 = new JMenuItem("Quản lý món ăn");
        jMenuMonAn.add(itemMonAn1);
        jMenuBar.add(jMenuMonAn);

        JMenu jMenuTheVip = new JMenu("Thẻ VIP");
//        itemTheVip1 = new JMenuItem("xxx");
        jMenuTheVip.setIcon(new ImageIcon(new ImageIcon("img/iconTheVip.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        jMenuTheVip.setForeground(Color.WHITE);
        itemTheVip1 = new JMenuItem("xxx");
        itemTheVip2 = new JMenuItem("Danh sách thẻ thành viên");
//        jMenuTheVip.add(itemTheVip1);
        jMenuTheVip.add(itemTheVip2);
        jMenuBar.add(jMenuTheVip);

   
        itemNhaHang1.addActionListener(this);
        itemNhaHang2.addActionListener(this);
        itemNhanVien1.addActionListener(this);
//        itemNhanVien2.addActionListener(this);
        itemKhachHang1.addActionListener(this);
//        itemKhachHang2.addActionListener(this);
        itemThongKe1.addActionListener(this);
        itemThongKe2.addActionListener(this);
        itemBan1.addActionListener(this);
        itemMonAn1.addActionListener(this);
//        itemMonAn2.addActionListener(this);
//        itemTheVip1.addActionListener(this);
        itemTheVip1.addActionListener(this);
        itemTheVip2.addActionListener(this);

        setJMenuBar(jMenuBar);
        setLayout(new BorderLayout());

      
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);
        //-----//  LƯU Ý GỌI PANEL MENU TRONG ĐÂY
        contentPanel.add(new PanelNhaHangMenu0(), "MenuNhaHang1"); // trong chuỗi là từ khoá để gọi trùng khớp hàm action ở dưới
        contentPanel.add(new PanelNhaHangMenu2(),"MenuNhaHang2");
        
        //Quản lý nhân viên
        contentPanel.add(new PanelNhanVien(),"QLNhanVien");
        
        //Quản lý khách hàng
        contentPanel.add(new PanelKhachHang(),"QLKhachHang");
        //Thẻ thành viên
       
        contentPanel.add(new PanelNhaHangMenu0(), "MenuNhaHang1");
        contentPanel.add(new PanelNhaHangMenu2(), "MenuNhaHang2");
        contentPanel.add(new PanelDsThanhVien(), "DSThanhVien");
        contentPanel.add(new PanelQuanLyBan(), "QLBan");
        contentPanel.add(new PanelQLMonAn(), "QLMonAn");

        add(contentPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == itemNhaHang1) {
            cardLayout.show(contentPanel, "MenuNhaHang1");
        } else if (e.getSource() == itemNhaHang2) {
            cardLayout.show(contentPanel, "MenuNhaHang2");
        } else if (e.getSource() == itemTheVip2) {
            cardLayout.show(contentPanel, "DSThanhVien");
        } else if (e.getSource() == itemBan1) {
            cardLayout.show(contentPanel, "QLBan");
        } else if (e.getSource() == itemMonAn1) {
            cardLayout.show(contentPanel, "QLMonAn");
        }
        else if(e.getSource()== itemNhaHang2){
        	cardLayout.show(contentPanel, "MenuNhaHang2");
        }
        else if(e.getSource() == itemNhanVien1) {
        	cardLayout.show(contentPanel, "QLNhanVien");
        }
        else if(e.getSource()==itemKhachHang1) {
        	cardLayout.show(contentPanel, "QLKhachHang");
        }
        else if (e.getSource()== itemTheVip2) {
			cardLayout.show(contentPanel, "DSThanhVien");
		}else if (e.getSource()== itemBan1) {
			cardLayout.show(contentPanel, "QLBan");
		}else if (e.getSource()== itemMonAn1) {
			cardLayout.show(contentPanel, "QLMonAn");
		}
    }

    public static void main(String[] args) {
        new Menu();
    }
}