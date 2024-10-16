package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Scrollbar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;

public class PanelDsThanhVien extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField txtMaThe;
    private JTextField txtTenTV;
    private JTextField txtSDT;
    private JTextField txtDiaChi;
    private JTextField txtTimKiem;
    private JTable table;

    /**
     * Create the panel.
     */
    public PanelDsThanhVien() {
    	setForeground(new Color(255, 255, 255));
        setLayout(null);
        
        Label lblTT = new Label("Thông tin");
        lblTT.setBackground(new Color(65, 41, 224));
        lblTT.setBounds(10, 10, 150, 40);
        add(lblTT);
        lblTT.setAlignment(Label.CENTER);
        lblTT.setForeground(new Color(255, 255, 255));
        lblTT.setFont(new Font("Arial", Font.BOLD, 17));
        
        JLabel lblDiem = new JLabel("0 đ");
        lblDiem.setForeground(new Color(244, 0, 6));
        lblDiem.setFont(new Font("Arial", Font.BOLD, 22));
        lblDiem.setBounds(171, 10, 105, 58);
        add(lblDiem);
        
        JPanel pnlTT = new JPanel();
        pnlTT.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(192, 192, 192)));
        pnlTT.setForeground(new Color(192, 192, 192));
        pnlTT.setBounds(10, 56, 367, 939);
        add(pnlTT);
        pnlTT.setLayout(null);
        
        txtMaThe = new JTextField();
        txtMaThe.setFont(new Font("Arial", Font.PLAIN, 14));
        txtMaThe.setBounds(10, 30, 347, 35);
        pnlTT.add(txtMaThe);
        txtMaThe.setColumns(10);
        
        JLabel lblMaThe = new JLabel("Mã thẻ");
        lblMaThe.setForeground(new Color(0, 0, 0));
        lblMaThe.setFont(new Font("Arial", Font.PLAIN, 15));
        lblMaThe.setBounds(20, 10, 45, 18);
        pnlTT.add(lblMaThe);
        
        JLabel lblTenTV = new JLabel("Tên thành viên");
        lblTenTV.setForeground(Color.BLACK);
        lblTenTV.setFont(new Font("Arial", Font.PLAIN, 15));
        lblTenTV.setBounds(20, 72, 98, 18);
        pnlTT.add(lblTenTV);
        
        txtTenTV = new JTextField();
        txtTenTV.setFont(new Font("Arial", Font.PLAIN, 14));
        txtTenTV.setColumns(10);
        txtTenTV.setBounds(10, 92, 347, 35);
        pnlTT.add(txtTenTV);
        
        JLabel lblSDT = new JLabel("Số điện thoại");
        lblSDT.setForeground(Color.BLACK);
        lblSDT.setFont(new Font("Arial", Font.PLAIN, 15));
        lblSDT.setBounds(20, 134, 88, 18);
        pnlTT.add(lblSDT);
        
        txtSDT = new JTextField();
        txtSDT.setFont(new Font("Arial", Font.PLAIN, 14));
        txtSDT.setColumns(10);
        txtSDT.setBounds(10, 156, 347, 35);
        pnlTT.add(txtSDT);
        
        JLabel lblNgayTao = new JLabel("Ngày tạo");
        lblNgayTao.setForeground(Color.BLACK);
        lblNgayTao.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNgayTao.setBounds(20, 201, 59, 18);
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
        datePicker.setBounds(10, 229, 180, 35);
        pnlTT.add(datePicker);

        // Đặt kích thước và font chữ cho trường nhập ngày
        datePicker.getJFormattedTextField().setPreferredSize(new Dimension(100, 35));
        datePicker.getJFormattedTextField().setFont(new Font("Arial", Font.PLAIN, 15));   
        
        JLabel lblLoaiThe = new JLabel("Loại thẻ");
        lblLoaiThe.setForeground(Color.BLACK);
        lblLoaiThe.setFont(new Font("Arial", Font.PLAIN, 15));
        lblLoaiThe.setBounds(239, 201, 59, 18);
        pnlTT.add(lblLoaiThe);
        
        JComboBox cbxLoaiThe = new JComboBox();
        cbxLoaiThe.setModel(new DefaultComboBoxModel(new String[] {"Đồng", "Bạc", "Vàng", "Kim cương"}));
        cbxLoaiThe.setFont(new Font("Arial", Font.PLAIN, 15));
        cbxLoaiThe.setBounds(239, 229, 118, 35);
        pnlTT.add(cbxLoaiThe);
        
        JLabel lblDiaChi = new JLabel("Địa chỉ");
        lblDiaChi.setForeground(Color.BLACK);
        lblDiaChi.setFont(new Font("Arial", Font.PLAIN, 15));
        lblDiaChi.setBounds(20, 272, 88, 18);
        pnlTT.add(lblDiaChi);
        
        txtDiaChi = new JTextField();
        txtDiaChi.setFont(new Font("Arial", Font.PLAIN, 14));
        txtDiaChi.setColumns(10);
        txtDiaChi.setBounds(10, 290, 347, 35);
        pnlTT.add(txtDiaChi);
        
        JButton btnSua = new JButton("Sửa");
        btnSua.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnSua.setBackground(new Color(255, 128, 64));
        btnSua.setForeground(new Color(255, 255, 255));
        btnSua.setFont(new Font("Arial", Font.BOLD, 12));
        btnSua.setBounds(100, 347, 72, 26);
        pnlTT.add(btnSua);
        
        JButton btnXoa = new JButton("Xóa");
        btnXoa.setForeground(new Color(255, 255, 255));
        btnXoa.setBackground(new Color(255, 0, 0));
        btnXoa.setFont(new Font("Arial", Font.BOLD, 12));
        btnXoa.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnXoa.setBounds(195, 347, 72, 26);
        pnlTT.add(btnXoa);
        
        JButton btnLuu = new JButton("Lưu");
        btnLuu.setForeground(new Color(255, 255, 255));
        btnLuu.setBackground(new Color(0, 128, 0));
        btnLuu.setFont(new Font("Arial", Font.BOLD, 12));
        btnLuu.setBounds(285, 347, 72, 26);
        pnlTT.add(btnLuu);
        
        JButton btnThem = new JButton("Thêm");
        btnThem.setForeground(Color.WHITE);
        btnThem.setFont(new Font("Arial", Font.BOLD, 12));
        btnThem.setBackground(new Color(0, 0, 255));
        btnThem.setBounds(8, 347, 72, 26);
        pnlTT.add(btnThem);
        
        JLabel lblDsTV = new JLabel("    Danh sách thành viên");
        lblDsTV.setHorizontalAlignment(SwingConstants.LEFT);
        lblDsTV.setBackground(new Color(65, 41, 224));  // Set màu nền
        lblDsTV.setForeground(new Color(255, 255, 255));  // Set màu chữ
        lblDsTV.setFont(new Font("Arial", Font.BOLD, 18));
        lblDsTV.setBounds(387, 10, 1524, 40);
        lblDsTV.setOpaque(true);  // Bật hiển thị nền
        add(lblDsTV);
        
        txtTimKiem = new JTextField();
        txtTimKiem.setBounds(387, 60, 974, 37);
        add(txtTimKiem);
        txtTimKiem.setColumns(10);
        
        JButton btnTimKiem = new JButton("Tìm kiếm");
        btnTimKiem.setForeground(new Color(255, 255, 255));
        btnTimKiem.setFont(new Font("Arial", Font.BOLD, 18));
        btnTimKiem.setBackground(new Color(0, 128, 255));
        btnTimKiem.setBounds(1770, 56, 141, 37);
        add(btnTimKiem);
        
        JComboBox cbxSapXep = new JComboBox();
        cbxSapXep.setToolTipText("Sắp xếp theo");
        cbxSapXep.setModel(new DefaultComboBoxModel(new String[] {"Loại thẻ", "Số điểm cao nhất", "Mã thẻ"}));
        cbxSapXep.setBounds(1525, 107, 386, 30);
        add(cbxSapXep);
        
        JLabel lblNewLabel = new JLabel("Sắp xếp theo:");
        lblNewLabel.setBounds(1418, 107, 97, 30);
        add(lblNewLabel);
        
        JScrollPane scpTable = new JScrollPane();
        scpTable.setBounds(387, 147, 1524, 848);
        add(scpTable);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"M\u00E3 th\u1EBB", "T\u00EAn kh\u00E1ch h\u00E0ng", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Lo\u1EA1i th\u1EBB", "S\u1ED1 \u0111i\u1EC3m", "\u0110\u1ECBa ch\u1EC9", "Ng\u00E0y \u0111\u0103ng k\u00FD"
        	}
        ));
        table.getColumnModel().getColumn(1).setPreferredWidth(91);
        scpTable.setViewportView(table);
    }
}

class DateLabelFormatter extends AbstractFormatter {

    private static final long serialVersionUID = 1L;
    private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }
        return "";
    }
}
