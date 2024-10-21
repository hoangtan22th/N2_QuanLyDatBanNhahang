package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.BanDAO;
import dao.KhuVucBanDAO;
import entity.Ban;
import entity.KhuVucBan;

import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PanelNhaHangMenu1 extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JPanel panel_6;
	private JButton btnChuyenBan;
	private JButton btnGhepBan;
	private JComboBox cbThuong;
	private JPanel pnDanhSachBan;
	private JButton btnTatCa;

	public PanelNhaHangMenu1() {
		setBackground(Color.WHITE);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(81, 0, 161, 64);
		panel.setBackground(Color.WHITE);
		add(panel);
		panel.setLayout(null);

		JLabel lblPhieu = new JLabel("Phiếu");
		lblPhieu.setForeground(new Color(255, 255, 255));
		lblPhieu.setBackground(new Color(226, 141, 14));
		lblPhieu.setOpaque(true); 
		lblPhieu.setBounds(10, 11, 141, 42);

		panel.add(lblPhieu);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(81, 75, 806, 77);
		panel_1.setBackground(Color.WHITE);
		add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNhanVien = new JLabel("Nguyễn Văn A");
		lblNhanVien.setBounds(10, 11, 188, 55);
		panel_1.add(lblNhanVien);

		JLabel lblKhachHang = new JLabel("Khách hàng 1");
		lblKhachHang.setBounds(218, 11, 188, 55);
		panel_1.add(lblKhachHang);

		JLabel lblSoLuongKhach = new JLabel("4 khách");
		lblSoLuongKhach.setBounds(432, 11, 188, 55);
		panel_1.add(lblSoLuongKhach);

		JLabel lblThoiGianDen = new JLabel("11:00");
		lblThoiGianDen.setBounds(643, 10, 153, 56);
		panel_1.add(lblThoiGianDen);


		lblKhachHang.setBorder(BorderFactory.createTitledBorder("Khách hàng"));
		lblNhanVien.setBorder(BorderFactory.createTitledBorder("Nhân viên"));
		lblSoLuongKhach.setBorder(BorderFactory.createTitledBorder("Số lượng khách"));
		lblThoiGianDen.setBorder(BorderFactory.createTitledBorder("Thời gian đến"));

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(81, 163, 806, 507);
		panel_2.setBackground(Color.WHITE);
		add(panel_2);
		panel_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 39, 786, 431);
		panel_2.add(scrollPane);

		table = new JTable();

		table.setRowHeight(30); 

	
		DefaultTableModel model = new DefaultTableModel(new Object[][] { { "abc", null, null }

		}, new String[] { "Số Lượng", "Hàng Bán", "Tiền Hàng" });
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);

		scrollPane.setViewportView(table);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(80, 706, 742, 70);
		panel_3.setBackground(Color.WHITE);
		add(panel_3);
		panel_3.setLayout(null);

		JLabel lblDaDat = new JLabel("Đã đặt");

		lblDaDat.setForeground(new Color(255, 255, 255));
		lblDaDat.setBackground(new Color(226, 141, 14));
		lblDaDat.setOpaque(true);
		lblDaDat.setBounds(211, 11, 191, 48);
		panel_3.add(lblDaDat);

		JLabel lblCoKhach = new JLabel("Có khách");

		lblCoKhach.setForeground(new Color(255, 255, 255));
		lblCoKhach.setBackground(new Color(51, 153, 102));
		lblCoKhach.setOpaque(true);
		lblCoKhach.setBounds(10, 11, 191, 48);
		panel_3.add(lblCoKhach);

		JLabel lblTrong = new JLabel("Trống");

		lblTrong.setForeground(new Color(255, 255, 255));
		lblTrong.setBackground(new Color(0, 117, 225));
		lblTrong.setOpaque(true);
		lblTrong.setBounds(412, 11, 182, 48);
		panel_3.add(lblTrong);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(930, 11, 778, 138);
		add(panel_4);
		panel_4.setLayout(null);

		btnTatCa = new JButton("Tất cả");
		btnTatCa.setForeground(new Color(255, 255, 255));
		btnTatCa.setBackground(new Color(14, 48, 226)); // Màu 0E30E2

		btnTatCa.setBounds(277, 11, 234, 101);
		panel_4.add(btnTatCa);

		cbThuong = new JComboBox<>();
		cbThuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cbThuong.setBounds(10, 11, 234, 101);
		panel_4.add(cbThuong);

		KhuVucBanDAO khuVucBanDAO = new KhuVucBanDAO();
		List<String> khuVucBans = khuVucBanDAO.getAllTenKhuVucBan();

		for (String khuVucBan : khuVucBans) {
			cbThuong.addItem(khuVucBan);
		}

		pnDanhSachBan = new JPanel();
		pnDanhSachBan.setBackground(new Color(255, 255, 255));
		pnDanhSachBan.setBounds(940, 165, 768, 505);
		add(pnDanhSachBan);
		pnDanhSachBan.setLayout(new GridLayout(0, 4, 15, 15));

		panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBounds(940, 712, 768, 64);
		add(panel_6);
		panel_6.setLayout(null);
		btnChuyenBan = new JButton("Chuyển bàn");
		btnChuyenBan.setForeground(Color.WHITE);
		btnChuyenBan.setBackground(new Color(0, 117, 225));
		btnChuyenBan.setBounds(156, 6, 143, 53);
		panel_6.add(btnChuyenBan);

		btnGhepBan = new JButton("Ghép bàn");
		btnGhepBan.setForeground(Color.WHITE);
		btnGhepBan.setBackground(new Color(226, 141, 14));
		btnGhepBan.setBounds(309, 6, 143, 53);
		panel_6.add(btnGhepBan);

		JButton btnNewButton_16 = new JButton("Tách bàn");
		btnNewButton_16.setForeground(Color.WHITE);

		btnNewButton_16.setBackground(new Color(226, 141, 14));
		btnNewButton_16.setBounds(462, 6, 143, 53);
		panel_6.add(btnNewButton_16);

		JButton btnNewButton_17 = new JButton("Phiếu kiểm món");
		btnNewButton_17.setForeground(Color.WHITE);
		btnNewButton_17.setBackground(new Color(209, 14, 226));
		btnNewButton_17.setBounds(615, 6, 153, 53);
		panel_6.add(btnNewButton_17);

		JButton btnNewButton_13 = new JButton("Thêm món");
		btnNewButton_13.setForeground(Color.WHITE);
		btnNewButton_13.setBackground(new Color(14, 48, 226));
		btnNewButton_13.setBounds(0, 6, 146, 53);
		panel_6.add(btnNewButton_13);

		btnChuyenBan.addActionListener(this);
		btnGhepBan.addActionListener(this);
		cbThuong.addActionListener(this);

		String firstKhuTen = cbThuong.getItemAt(0).toString();
		BanDAO banDAO = new BanDAO();
		List<String> tenBans = banDAO.getTenBansByKhu(firstKhuTen);

		for (String tenBan : tenBans) {
			JButton button = new JButton(tenBan);
			button.setForeground(new Color(255, 255, 255));
			button.setBackground(new Color(0, 117, 225));
			pnDanhSachBan.add(button);
		}

		pnDanhSachBan.revalidate();
		pnDanhSachBan.repaint();
		btnTatCa.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnChuyenBan) {
			new ChuyenBan().setVisible(true);
		} else if (e.getSource() == btnGhepBan) {

			new GhepBan().setVisible(true);
		} else if (e.getSource() == cbThuong) {
			String selectedKhuTen = cbThuong.getSelectedItem().toString();

			BanDAO banDAO = new BanDAO();
			List<String> tenBans = banDAO.getTenBansByKhu(selectedKhuTen);

			pnDanhSachBan.removeAll();
			pnDanhSachBan.revalidate();
			pnDanhSachBan.repaint();

			for (String tenBan : tenBans) {
				JButton button = new JButton(tenBan);
				button.setForeground(new Color(255, 255, 255));

				button.setBackground(new Color(0, 117, 225));
				pnDanhSachBan.add(button);
			}

			pnDanhSachBan.revalidate();
			pnDanhSachBan.repaint();
		}else if (e.getSource() == btnTatCa) {
		    BanDAO banDAO = new BanDAO();
		    List<Ban> bans = banDAO.getAllBans(); 

		    pnDanhSachBan.removeAll(); 
		    pnDanhSachBan.revalidate();
		    pnDanhSachBan.repaint();

		    for (Ban ban : bans) {
		        JButton button = new JButton(ban.getTenBan());
		        button.setForeground(new Color(255, 255, 255));
		        button.setBackground(new Color(0, 117, 225));
		        
		   
		        button.setToolTipText("Mã bàn: " + ban.getMaBan());
		        pnDanhSachBan.add(button); 
		    }

		    pnDanhSachBan.revalidate();
		    pnDanhSachBan.repaint();
		}


	}
}
