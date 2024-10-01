package entity;

public class LoaiThe {
	private String maLoaiTTV;
	private String tenLoaiTTV;
	private double chietKhau;
	public LoaiThe(String maLoaiTTV, String tenLoaiTTV, double chietKhau) {
		super();
		this.maLoaiTTV = maLoaiTTV;
		this.tenLoaiTTV = tenLoaiTTV;
		this.chietKhau = chietKhau;
	}
	public String getMaLoaiTTV() {
		return maLoaiTTV;
	}
	public void setMaLoaiTTV(String maLoaiTTV) {
		this.maLoaiTTV = maLoaiTTV;
	}
	public String getTenLoaiTTV() {
		return tenLoaiTTV;
	}
	public void setTenLoaiTTV(String tenLoaiTTV) {
		this.tenLoaiTTV = tenLoaiTTV;
	}
	public double getChietKhau() {
		return chietKhau;
	}
	public void setChietKhau(double chietKhau) {
		this.chietKhau = chietKhau;
	}
	public String toString() {
		return "LoaiThe [maLoaiTTV=" + maLoaiTTV + ", tenLoaiTTV=" + tenLoaiTTV + ", chietKhau=" + chietKhau + "]";
	}
	
}
