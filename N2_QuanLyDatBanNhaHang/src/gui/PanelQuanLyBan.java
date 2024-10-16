package gui;

import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList; // Import ArrayList
import java.util.Properties;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;

public class PanelQuanLyBan extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField txtMaBan;
    private JTextField txtTenBan;
    private JTextField txtSoCho;
    private ArrayList<String> banNames; // Danh sách tên bàn
    private JTextField txtMa;
    private JTextField txtTen;
    private JTextField txtSo;

    public PanelQuanLyBan() {
        setLayout(null);
        createHeaderLabels();
        createInputPanel();
        createActionButtons();
        createBanList(); // Gọi phương thức tạo danh sách bàn
        createBanButtons();
    }

    private void createHeaderLabels() {
        Label lblTT = new Label("Thông tin");
        lblTT.setBackground(new Color(65, 41, 224));
        lblTT.setBounds(10, 10, 150, 40);
        add(lblTT);
        lblTT.setAlignment(Label.CENTER);
        lblTT.setForeground(Color.WHITE);
        lblTT.setFont(new Font("Arial", Font.BOLD, 17));

        JLabel lblDatCho = new JLabel("    Quản lý bàn");
        lblDatCho.setHorizontalAlignment(SwingConstants.LEFT);
        lblDatCho.setBackground(new Color(65, 41, 224));
        lblDatCho.setForeground(Color.WHITE);
        lblDatCho.setFont(new Font("Arial", Font.BOLD, 18));
        lblDatCho.setBounds(390, 10, 1524, 40);
        lblDatCho.setOpaque(true);
        add(lblDatCho);
    }

    private void createInputPanel() {
        JPanel pnlTT = new JPanel();
        pnlTT.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(192, 192, 192)));
        pnlTT.setBounds(10, 56, 371, 926);
        add(pnlTT);
        pnlTT.setLayout(null);

        // Date picker setup
        JDatePickerImpl datePicker = createDatePicker();
        datePicker.setBounds(10, 188, 180, 35);
        pnlTT.add(datePicker);

        // Create the radio buttons
        ButtonGroup group = new ButtonGroup();
        addRadioButton(pnlTT, group, "Bàn thường", 113, 231);
        addRadioButton(pnlTT, group, "Bàn VIP", 218, 231);
        JTextPane txpGhiChu = new JTextPane();
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(192, 192, 192)));
        panel.setBounds(10, 273, 351, 99);
        panel.setLayout(null);
        txpGhiChu.setBounds(1, 1, 348, 96);
        panel.add(txpGhiChu);
        pnlTT.add(panel);
        
        JButton btnThem = new JButton("Thêm");
        btnThem.setForeground(new Color(255, 255, 255));
        btnThem.setBackground(new Color(0, 191, 0));
        btnThem.setBounds(10, 386, 70, 30);
        pnlTT.add(btnThem);
        
        JButton btnSua = new JButton("Sửa");
        btnSua.setBackground(new Color(255, 128, 64));
        btnSua.setForeground(new Color(255, 255, 255));
        btnSua.setBounds(100, 386, 70, 30);
        pnlTT.add(btnSua);
        
        JButton btnXoa = new JButton("Xóa");
        btnXoa.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnXoa.setForeground(new Color(255, 255, 255));
        btnXoa.setBackground(new Color(255, 0, 0));
        btnXoa.setBounds(198, 386, 70, 30);
        pnlTT.add(btnXoa);
        
        JButton btnLuu = new JButton("Lưu");
        btnLuu.setBackground(new Color(0, 0, 255));
        btnLuu.setForeground(new Color(255, 255, 255));
        btnLuu.setBounds(291, 386, 70, 30);
        pnlTT.add(btnLuu);
        
        JLabel lblMaBan = new JLabel("Mã bàn");
        lblMaBan.setFont(new Font("Arial", Font.PLAIN, 14));
        lblMaBan.setBounds(20, 10, 70, 21);
        pnlTT.add(lblMaBan);
        
        txtMa = new JTextField();
        txtMa.setBounds(10, 36, 351, 35);
        pnlTT.add(txtMa);
        txtMa.setColumns(10);
        
        JLabel lblTen = new JLabel("Tên bàn");
        lblTen.setFont(new Font("Arial", Font.PLAIN, 14));
        lblTen.setBounds(20, 81, 70, 21);
        pnlTT.add(lblTen);
        
        txtTen = new JTextField();
        txtTen.setColumns(10);
        txtTen.setBounds(10, 112, 351, 35);
        pnlTT.add(txtTen);
        
        JLabel lblNgyTo = new JLabel("Ngày tạo");
        lblNgyTo.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNgyTo.setBounds(20, 157, 70, 21);
        pnlTT.add(lblNgyTo);
        
        JLabel lblSoCho = new JLabel("Số chỗ");
        lblSoCho.setFont(new Font("Arial", Font.PLAIN, 14));
        lblSoCho.setBounds(234, 157, 70, 21);
        pnlTT.add(lblSoCho);
        
        txtSo = new JTextField();
        txtSo.setBounds(222, 188, 139, 35);
        pnlTT.add(txtSo);
        txtSo.setColumns(10);
        
        JPanel pnlBan = new JPanel();
        pnlBan.setBounds(390, 60, 1524, 922);
        add(pnlBan);
        pnlBan.setLayout(new GridLayout(0, 5, 6, 15));
        
        JButton btn1 = new JButton("HA01");
        btn1.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn1);
        
        JButton btn2 = new JButton("HA02");
        btn2.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn2);
        
        JButton btn3 = new JButton("HA03");
        btn3.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn3);
        
        JButton btn4 = new JButton("HA04");
        btn4.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn4);
        
        JButton btn5 = new JButton("HA05");
        btn5.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn5);
        
        JButton btn6 = new JButton("HA06");
        btn6.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn6);
        
        JButton btn7 = new JButton("HA07");
        btn7.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn7);
        
        JButton btn8 = new JButton("HA08");
        btn8.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn8);
        
        JButton btn9 = new JButton("HA09");
        btn9.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn9);
        
        JButton btn10 = new JButton("HA10");
        btn10.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn10);
        
        JButton btn11 = new JButton("Bàn NULL");
        btn11.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn11);
        
        JButton btn12 = new JButton("Bàn NULL");
        btn12.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn12);
        
        JButton btn13 = new JButton("Bàn NULL");
        btn13.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn13);
        
        JButton btn14 = new JButton("Bàn NULL");
        btn14.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn14);
        
        JButton btn15 = new JButton("Bàn NULL");
        btn15.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn15);
        
        JButton btn25 = new JButton("Bàn NULL");
        btn25.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn25);
        
        JButton btn16 = new JButton("Bàn NULL");
        btn16.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn16);
        
        JButton btn17 = new JButton("Bàn NULL");
        btn17.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn17);
        
        JButton btn18 = new JButton("Bàn NULL");
        btn18.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn18);
        
        JButton btn19 = new JButton("Bàn NULL");
        btn19.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn19);
        
        JButton btn20 = new JButton("Bàn NULL");
        btn20.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn20);
        
        JButton btn21 = new JButton("Bàn NULL");
        btn21.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn21);
        
        JButton btn22 = new JButton("Bàn NULL");
        btn22.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn22);
        
        JButton btn23 = new JButton("Bàn NULL");
        btn23.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn23);
        
        JButton btn24 = new JButton("Bàn NULL");
        btn24.setBackground(new Color(0, 128, 255));
        pnlBan.add(btn24);
    }

    private void createActionButtons() {
        JPanel pnlTT = (JPanel) getComponent(2);
        
        JButton btnSua = createButton(pnlTT, "Sửa", new Color(255, 128, 64), Color.WHITE, 10, 382);
        JButton btnXoa = createButton(pnlTT, "Xóa", new Color(255, 0, 0), Color.WHITE, 115, 382);
        JButton btnLuu = createButton(pnlTT, "Lưu", new Color(0, 128, 0), Color.WHITE, 223, 382);
    }

    private void createBanList() {
        banNames = new ArrayList<>();
    }

    private void createBanButtons() {
        for (int i = 0; i < banNames.size(); i++) {
            createBanButton(banNames.get(i), 345 + (i % 8) * 170, 80 + (i / 8) * 111);
        }
    }

    private void createBanButton(String name, int x, int y) {
        JButton button = createButton(null, name, new Color(0, 128, 255), Color.WHITE, x, y);
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        
        // Đặt kích thước nút bàn tại đây
        button.setBounds(x, y, 150, 90); // Kích thước nút bàn
        
        add(button);
    }

    private JButton createButton(JPanel panel, String text, Color bgColor, Color fgColor, int x, int y) {
        JButton button = new JButton(text);
        button.setForeground(fgColor);
        button.setBackground(bgColor);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        
        
        if (panel != null) {
            panel.add(button);
        }
        return button;
    }

    private void addRadioButton(JPanel panel, ButtonGroup group, String text, int x, int y) {
        JRadioButton radioButton = new JRadioButton(text);
        radioButton.setFont(new Font("Arial", Font.PLAIN, 14));
        radioButton.setBounds(x, y, 103, 21);
        panel.add(radioButton);
        group.add(radioButton);
    }

    private JDatePickerImpl createDatePicker() {
        UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        properties.put("text.today", "Hôm nay");
        properties.put("text.month", "Tháng");
        properties.put("text.year", "Năm");
        
        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        
        ImageIcon calendarIcon = new ImageIcon("D:\\Data\\tailieuvuive\\PTUD\\N2_QuanLyDatBanNhahang\\N2_QuanLyDatBanNhaHang\\img\\lich.png");
        JButton calendarButton = (JButton) datePicker.getComponent(1);
        calendarButton.setIcon(calendarIcon);
        datePicker.getJFormattedTextField().setPreferredSize(new Dimension(80, 35));
        datePicker.getJFormattedTextField().setFont(new Font("Arial", Font.PLAIN, 15));
        
        return datePicker;
    }
}
