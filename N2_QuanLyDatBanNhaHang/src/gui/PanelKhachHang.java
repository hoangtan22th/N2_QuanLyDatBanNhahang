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

public class PanelKhachHang extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtMaKh;
	private JTextField txtTenKh;
	private JTextField txtNgaySinh;
	private JTextField txtSDT;
	private JTextField textField;
	private JTable tblNhanVien;

	/**
	 * Create the panel.
	 */
	public PanelKhachHang() {
		setLayout(null);
		Label lblTT = new Label("Thông tin");
		lblTT.setBackground(new Color(65, 41, 224));
		lblTT.setBounds(10, 10, 150, 40);
		add(lblTT);
		lblTT.setAlignment(Label.CENTER);
		lblTT.setForeground(new Color(255, 255, 255));
		lblTT.setFont(new Font("Arial", Font.BOLD, 17));

		JLabel lblNhanVien = new JLabel("    Quản lý khách hàng");
		lblNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
		lblNhanVien.setBackground(new Color(65, 41, 224)); // Set màu nền
		lblNhanVien.setForeground(new Color(255, 255, 255)); // Set màu chữ
		lblNhanVien.setFont(new Font("Arial", Font.BOLD, 18));
		lblNhanVien.setBounds(387, 10, 1524, 40);
		lblNhanVien.setOpaque(true); // Bật hiển thị nền
		add(lblNhanVien);

		JPanel panelTTKH = new JPanel();
		panelTTKH.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelTTKH.setBounds(10, 56, 367, 939);
		add(panelTTKH);
		panelTTKH.setLayout(null);

		txtMaKh = new JTextField();
		txtMaKh.setBounds(10, 35, 347, 35);
		panelTTKH.add(txtMaKh);
		txtMaKh.setColumns(10);

		JLabel lblMa = new JLabel("Mã khách hàng");
		lblMa.setBounds(15, 10, 111, 26);
		panelTTKH.add(lblMa);
		lblMa.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblTen = new JLabel("Tên khách hàng");
		lblTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTen.setBounds(15, 85, 111, 26);
		panelTTKH.add(lblTen);

		txtTenKh = new JTextField();
		txtTenKh.setColumns(10);
		txtTenKh.setBounds(10, 109, 347, 35);
		panelTTKH.add(txtTenKh);

		JLabel lblNgaySinh = new JLabel("Ngày sinh");
		lblNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNgaySinh.setBounds(15, 159, 111, 26);
		panelTTKH.add(lblNgaySinh);

		txtNgaySinh = new JTextField();
		txtNgaySinh.setColumns(10);
		txtNgaySinh.setBounds(10, 185, 347, 35);
		panelTTKH.add(txtNgaySinh);

		JLabel lblSDT = new JLabel("Số điện thoại");
		lblSDT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSDT.setBounds(15, 235, 111, 26);
		panelTTKH.add(lblSDT);

		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		txtSDT.setBounds(10, 258, 347, 35);
		panelTTKH.add(txtSDT);

		JButton btnThem = new JButton("Thêm");
		btnThem.setForeground(Color.WHITE);
		btnThem.setBackground(new Color(0, 191, 0));
		btnThem.setBounds(10, 303, 70, 30);
		panelTTKH.add(btnThem);

		JButton btnSua = new JButton("Sửa");
		btnSua.setForeground(Color.WHITE);
		btnSua.setBackground(new Color(255, 128, 64));
		btnSua.setBounds(104, 303, 70, 30);
		panelTTKH.add(btnSua);

		JButton btnXoa = new JButton("Xóa");
		btnXoa.setForeground(Color.WHITE);
		btnXoa.setBackground(Color.RED);
		btnXoa.setBounds(198, 303, 70, 30);
		panelTTKH.add(btnXoa);

		JButton btnLuu = new JButton("Lưu");
		btnLuu.setForeground(Color.WHITE);
		btnLuu.setBackground(Color.BLUE);
		btnLuu.setBounds(287, 303, 70, 30);
		panelTTKH.add(btnLuu);

		JLabel lblMaNV = new JLabel("Nhập mã khách hàng cần tìm:");
		lblMaNV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaNV.setBounds(779, 69, 199, 29);
		add(lblMaNV);

		textField = new JTextField();
		textField.setBounds(1017, 68, 746, 30);
		add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 208, 0));
		btnNewButton.setBounds(1793, 68, 118, 29);
		add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(387, 107, 1524, 888);
		add(scrollPane);

		tblNhanVien = new JTable();
		tblNhanVien.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null }, },
				new String[] { "M\u00E3", "T\u00EAn nh\u00E2n vi\u00EAn", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i",
						"Ng\u00E0y sinh", "Ng\u00E0y \u0111\u0103ng k\u00FD" }));
		scrollPane.setViewportView(tblNhanVien);

	}
}
