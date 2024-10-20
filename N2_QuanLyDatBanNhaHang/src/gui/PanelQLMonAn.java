package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.util.List;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import dao.MonAnUongDAO;
import entity.MonAnUong;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelQLMonAn extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtMa;
	private JTextField txtTen;
	private JTextField txtGia;
	private JTextField txtSoLuong;
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	 public void loadDataToTable() {
	        MonAnUongDAO monAnUongDAO = new MonAnUongDAO();
	        List<MonAnUong> listMonAn = monAnUongDAO.loadAllMonAnUong();
	        
	        DefaultTableModel model = (DefaultTableModel) table.getModel();
	        model.setRowCount(0); 

	        int stt = 1;
	        for (MonAnUong monAn : listMonAn) {
	            model.addRow(new Object[] {
	                stt++,
	                monAn.getMaMonAnUong(),
	                monAn.getTenMonAnUong(), 
	                monAn.getSoLuong(), 
	                monAn.getGiaTien(), 
	                monAn.getLoai()
	               
	            });
	        }
	    }
	public PanelQLMonAn() {
	
		setLayout(null);
		Label lblTT = new Label("Thông tin");
        lblTT.setBackground(new Color(65, 41, 224));
        lblTT.setBounds(10, 10, 150, 40);
        add(lblTT);
        lblTT.setAlignment(Label.CENTER);
        lblTT.setForeground(new Color(255, 255, 255));
        lblTT.setFont(new Font("Arial", Font.BOLD, 17));
        
        JLabel lblDsMonAn = new JLabel("    Danh sách món ăn");
        lblDsMonAn.setHorizontalAlignment(SwingConstants.LEFT);
        lblDsMonAn.setBackground(new Color(65, 41, 224));  // Set màu nền
        lblDsMonAn.setForeground(new Color(255, 255, 255));  // Set màu chữ
        lblDsMonAn.setFont(new Font("Arial", Font.BOLD, 18));
        lblDsMonAn.setBounds(387, 10, 1524, 40);
        lblDsMonAn.setOpaque(true);  // Bật hiển thị nền
        add(lblDsMonAn);
        
        JPanel pnlTT = new JPanel();
        pnlTT.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(192, 192, 192)));
        pnlTT.setBounds(10, 56, 367, 935);
        add(pnlTT);
        pnlTT.setLayout(null);
        
        JLabel lblMa = new JLabel("Mã món");
        lblMa.setFont(new Font("Arial", Font.PLAIN, 15));
        lblMa.setBounds(20, 10, 89, 24);
        pnlTT.add(lblMa);
        
        txtMa = new JTextField();
        txtMa.setBounds(10, 35, 347, 35);
        pnlTT.add(txtMa);
        txtMa.setColumns(10);
        
        JLabel lblTen = new JLabel("Tên món");
        lblTen.setFont(new Font("Arial", Font.PLAIN, 15));
        lblTen.setBounds(20, 80, 89, 24);
        pnlTT.add(lblTen);
        
        txtTen = new JTextField();
        txtTen.setColumns(10);
        txtTen.setBounds(10, 105, 347, 35);
        pnlTT.add(txtTen);
        
        JLabel lblGia = new JLabel("Giá tiền");
        lblGia.setFont(new Font("Arial", Font.PLAIN, 15));
        lblGia.setBounds(20, 149, 89, 24);
        pnlTT.add(lblGia);
        
        txtGia = new JTextField();
        txtGia.setColumns(10);
        txtGia.setBounds(10, 175, 347, 35);
        pnlTT.add(txtGia);
        JLabel lblNgayTao = new JLabel("Ngày tạo");
        lblNgayTao.setForeground(Color.BLACK);
        lblNgayTao.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNgayTao.setBounds(20, 220, 59, 18);
        pnlTT.add(lblNgayTao);
        
        // Date picker setup
        UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        properties.put("text.today", "Hôm nay");
        properties.put("text.month", "Tháng");
        properties.put("text.year", "Năm");

        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

        // Tải icon từ đường dẫn
        ImageIcon calendarIcon = new ImageIcon("D:\\Data\\tailieuvuive\\PTUD\\N2_QuanLyDatBanNhahang\\N2_QuanLyDatBanNhaHang\\img\\lich.png");

        // Lấy nút của datePicker và đặt icon cho nó
        JButton calendarButton = (JButton) datePicker.getComponent(1); // Lấy nút calendar
        calendarButton.setIcon(calendarIcon);

        // Set vị trí và kích thước của datePicker
        datePicker.setBounds(10, 245, 180, 35);
        pnlTT.add(datePicker);

        // Đặt kích thước và font chữ cho trường nhập ngày
        datePicker.getJFormattedTextField().setPreferredSize(new Dimension(100, 35));
        datePicker.getJFormattedTextField().setFont(new Font("Arial", Font.PLAIN, 15)); 
        
        JLabel lblSoLuong = new JLabel("Số lượng");
        lblSoLuong.setForeground(Color.BLACK);
        lblSoLuong.setFont(new Font("Arial", Font.PLAIN, 15));
        lblSoLuong.setBounds(240, 220, 76, 18);
        pnlTT.add(lblSoLuong);
        
        txtSoLuong = new JTextField();
        txtSoLuong.setColumns(10);
        txtSoLuong.setBounds(243, 245, 114, 35);
        pnlTT.add(txtSoLuong);
        
        JLabel lblGhiChu = new JLabel("Ghi chú");
        lblGhiChu.setFont(new Font("Arial", Font.PLAIN, 15));
        lblGhiChu.setBounds(20, 285, 114, 29);
        pnlTT.add(lblGhiChu);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(192, 192, 192)));
        panel.setBounds(10, 315, 347, 99);
        pnlTT.add(panel);
        panel.setLayout(null);
        
        JTextPane txpGhiChu = new JTextPane();
        txpGhiChu.setBounds(0, 0, 346, 96);
        panel.add(txpGhiChu);
        
        JButton btnSua = new JButton("Sửa");
        btnSua.setForeground(Color.WHITE);
        btnSua.setBackground(new Color(255, 128, 64));
        btnSua.setBounds(102, 424, 70, 30);
        pnlTT.add(btnSua);
        
        JButton btnThem = new JButton("Thêm");
        btnThem.setForeground(Color.WHITE);
        btnThem.setBackground(new Color(0, 191, 0));
        btnThem.setBounds(10, 424, 70, 30);
        pnlTT.add(btnThem);
        
        JButton btnXoa = new JButton("Xóa");
        btnXoa.setForeground(Color.WHITE);
        btnXoa.setBackground(Color.RED);
        btnXoa.setBounds(195, 424, 70, 30);
        pnlTT.add(btnXoa);
        
        JButton btnLuu = new JButton("Lưu");
        btnLuu.setForeground(Color.WHITE);
        btnLuu.setBackground(Color.BLUE);
        btnLuu.setBounds(287, 424, 70, 30);
        pnlTT.add(btnLuu);
        
        JButton btnPL1 = new JButton("Cơm cuộng");
        btnPL1.setForeground(new Color(255, 255, 255));
        btnPL1.setBackground(new Color(0, 128, 255));
        btnPL1.setBounds(387, 60, 124, 49);
        add(btnPL1);
        
        JButton btnPL2 = new JButton("Mì");
        btnPL2.setForeground(Color.WHITE);
        btnPL2.setBackground(new Color(0, 128, 255));
        btnPL2.setBounds(521, 60, 124, 49);
        add(btnPL2);
        
        JButton btnPL3 = new JButton("Sasimi");
        btnPL3.setForeground(Color.WHITE);
        btnPL3.setBackground(new Color(0, 128, 255));
        btnPL3.setBounds(655, 60, 124, 49);
        add(btnPL3);
        
        JButton btnPL4 = new JButton("Đồ nướng");
        btnPL4.setForeground(Color.WHITE);
        btnPL4.setBackground(new Color(0, 128, 255));
        btnPL4.setBounds(797, 60, 124, 49);
        add(btnPL4);
        
        JButton btnPL5 = new JButton("Salad");
        btnPL5.setForeground(Color.WHITE);
        btnPL5.setBackground(new Color(0, 128, 255));
        btnPL5.setBounds(930, 60, 124, 49);
        add(btnPL5);
        
        JButton btnPL6 = new JButton("Trang miệng");
        btnPL6.setForeground(Color.WHITE);
        btnPL6.setBackground(new Color(0, 128, 255));
        btnPL6.setBounds(1064, 60, 124, 49);
        add(btnPL6);
        
        JButton btnPL7 = new JButton("Nước");
        btnPL7.setForeground(Color.WHITE);
        btnPL7.setBackground(new Color(0, 128, 255));
        btnPL7.setBounds(1198, 60, 124, 49);
        add(btnPL7);
        
        JButton btnPL8 = new JButton("Best sellers");
        btnPL8.setForeground(Color.WHITE);
        btnPL8.setBackground(new Color(0, 0, 255));
        btnPL8.setBounds(1332, 60, 124, 49);
        add(btnPL8);
        
        textField = new JTextField();
        textField.setBounds(925, 134, 852, 34);
        add(textField);
        textField.setColumns(10);
        
        JButton btnTimKiem = new JButton("Tìm kiếm");
        btnTimKiem.setForeground(Color.WHITE);
        btnTimKiem.setBackground(new Color(0, 217, 0));
        btnTimKiem.setBounds(1803, 133, 108, 34);
        add(btnTimKiem);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(387, 188, 1524, 800);
        add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"STT", "M\u00E3", "T\u00EAn h\u00E0ng", "S\u1ED1 l\u01B0\u1EE3ng", "Ti\u1EC1n h\u00E0ng", "Ng\u00E0y t\u1EA1o", "Ghi ch\u00FA"
        	}
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(29);
        table.getColumnModel().getColumn(2).setPreferredWidth(105);
        scrollPane.setViewportView(table);
        table.setRowHeight(30); 

        JLabel lblNewLabel = new JLabel("Nhập mã món ăn cần tìm:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(668, 134, 203, 34);
        add(lblNewLabel);
    	loadDataToTable();
	}
}
