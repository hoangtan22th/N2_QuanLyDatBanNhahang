package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelNhanVien extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtMaNV;
	private JTextField txtTenNV;
	private JTextField txtNgaySinh;
	private JTextField txtSDT;
	private JTextField txtDiaChi;
	private JTextField txtGmail;
	private JTextField txtLCB;
	private JTextField txtNgayVaoLam;
	private JTextField textField;
	private JTable tblNhanVien;

	/**
	 * Create the panel.
	 */
	public PanelNhanVien() {
		setLayout(null);
		Label lblTT = new Label("Thông tin");
		lblTT.setBackground(new Color(65, 41, 224));
		lblTT.setBounds(10, 10, 150, 40);
		add(lblTT);
		lblTT.setAlignment(Label.CENTER);
		lblTT.setForeground(new Color(255, 255, 255));
		lblTT.setFont(new Font("Arial", Font.BOLD, 17));

		JLabel lblNhanVien = new JLabel("    Danh sách nhân viên");
		lblNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
		lblNhanVien.setBackground(new Color(65, 41, 224)); // Set màu nền
		lblNhanVien.setForeground(new Color(255, 255, 255)); // Set màu chữ
		lblNhanVien.setFont(new Font("Arial", Font.BOLD, 18));
		lblNhanVien.setBounds(388, 10, 1524, 40);
		lblNhanVien.setOpaque(true); // Bật hiển thị nền
		add(lblNhanVien);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 56, 368, 939);
		add(panel);
		panel.setLayout(null);

		txtMaNV = new JTextField();
		txtMaNV.setBounds(10, 114, 348, 35);
		panel.add(txtMaNV);
		txtMaNV.setColumns(10);

		JLabel lblMa = new JLabel("Mã nhân viên");
		lblMa.setBounds(15, 89, 111, 26);
		panel.add(lblMa);
		lblMa.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JButton btnNV = new JButton("Nhân viên");
		btnNV.setBounds(10, 46, 101, 34);
		panel.add(btnNV);
		btnNV.setForeground(new Color(255, 255, 255));
		btnNV.setBackground(new Color(255, 128, 64));

		JButton btnQL = new JButton("Quản lý");
		btnQL.setBounds(131, 46, 101, 34);
		panel.add(btnQL);
		btnQL.setForeground(Color.WHITE);
		btnQL.setBackground(new Color(255, 128, 64));

		JLabel lblNewLabel = new JLabel("Chức vụ:");
		lblNewLabel.setBounds(20, 10, 90, 26);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblTen = new JLabel("Tên nhân viên");
		lblTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTen.setBounds(15, 164, 111, 26);
		panel.add(lblTen);

		txtTenNV = new JTextField();
		txtTenNV.setColumns(10);
		txtTenNV.setBounds(10, 188, 348, 35);
		panel.add(txtTenNV);

		JLabel lblNgaySinh = new JLabel("Ngày sinh");
		lblNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNgaySinh.setBounds(15, 238, 111, 26);
		panel.add(lblNgaySinh);

		txtNgaySinh = new JTextField();
		txtNgaySinh.setColumns(10);
		txtNgaySinh.setBounds(10, 264, 348, 35);
		panel.add(txtNgaySinh);

		JLabel lblSDT = new JLabel("Số điện thoại");
		lblSDT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSDT.setBounds(15, 314, 111, 26);
		panel.add(lblSDT);

		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		txtSDT.setBounds(10, 341, 348, 35);
		panel.add(txtSDT);

		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDiaChi.setBounds(15, 386, 111, 26);
		panel.add(lblDiaChi);

		txtDiaChi = new JTextField();
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(10, 411, 348, 35);
		panel.add(txtDiaChi);

		JLabel lblGmail = new JLabel("Gmail");
		lblGmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGmail.setBounds(15, 456, 111, 26);
		panel.add(lblGmail);

		txtGmail = new JTextField();
		txtGmail.setColumns(10);
		txtGmail.setBounds(10, 479, 348, 35);
		panel.add(txtGmail);

		JLabel lblLCB = new JLabel("Lương CB");
		lblLCB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLCB.setBounds(15, 530, 111, 26);
		panel.add(lblLCB);

		txtLCB = new JTextField();
		txtLCB.setColumns(10);
		txtLCB.setBounds(10, 556, 348, 35);
		panel.add(txtLCB);

		JLabel lblNgayVaoLam = new JLabel("Ngày vào làm");
		lblNgayVaoLam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNgayVaoLam.setBounds(15, 601, 111, 26);
		panel.add(lblNgayVaoLam);

		txtNgayVaoLam = new JTextField();
		txtNgayVaoLam.setColumns(10);
		txtNgayVaoLam.setBounds(10, 627, 348, 35);
		panel.add(txtNgayVaoLam);

		JButton btnThem = new JButton("Thêm");
		btnThem.setForeground(Color.WHITE);
		btnThem.setBackground(new Color(0, 191, 0));
		btnThem.setBounds(10, 677, 70, 30);
		panel.add(btnThem);

		JButton btnSua = new JButton("Sửa");
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSua.setForeground(Color.WHITE);
		btnSua.setBackground(new Color(255, 128, 64));
		btnSua.setBounds(106, 677, 70, 30);
		panel.add(btnSua);

		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoa.setForeground(Color.WHITE);
		btnXoa.setBackground(Color.RED);
		btnXoa.setBounds(197, 677, 70, 30);
		panel.add(btnXoa);

		JButton btnLuu = new JButton("Lưu");
		btnLuu.setForeground(Color.WHITE);
		btnLuu.setBackground(Color.BLUE);
		btnLuu.setBounds(288, 677, 70, 30);
		panel.add(btnLuu);

		JLabel lblMaNV = new JLabel("Nhập mã nhân viên cần tìm:");
		lblMaNV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaNV.setBounds(707, 68, 199, 29);
		add(lblMaNV);

		textField = new JTextField();
		textField.setBounds(1001, 68, 746, 30);
		add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 208, 0));
		btnNewButton.setBounds(1794, 68, 118, 30);
		add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(388, 107, 1524, 888);
		add(scrollPane);

		tblNhanVien = new JTable();
		tblNhanVien.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null }, },
				new String[] { "M\u00E3", "T\u00EAn nh\u00E2n vi\u00EAn", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i",
						"Ch\u1EE9c v\u1EE5", "L\u01B0\u01A1ng c\u01A1 b\u1EA3n", "\u0110\u1ECBa ch\u1EC9",
						"Ng\u00E0y \u0111\u0103ng k\u00FD" }));
		scrollPane.setViewportView(tblNhanVien);

	}
}
