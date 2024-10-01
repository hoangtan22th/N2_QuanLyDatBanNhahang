package gui;

import javax.swing.JFrame;

import dao.KhachHangDAO;

public class gui1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(300,400);
		
		KhachHangDAO khDao= new KhachHangDAO();
		khDao.xuatKhachHangDauTien();
	}
}
