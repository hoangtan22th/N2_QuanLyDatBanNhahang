package entity;

public class MonAnUong {
	private String monAnUong;
	private String tenMonAnUong;
	private double giaTien;
	private String loai;
	private int soLuong;
	public MonAnUong(String monAnUong, String tenMonAnUong, double giaTien, String loai, int soLuong) {
		super();
		this.monAnUong = monAnUong;
		this.tenMonAnUong = tenMonAnUong;
		this.giaTien = giaTien;
		this.loai = loai;
		this.soLuong = soLuong;
	}
	public String getMonAnUong() {
		return monAnUong;
	}
	public void setMonAnUong(String monAnUong) {
		this.monAnUong = monAnUong;
	}
	public String getTenMonAnUong() {
		return tenMonAnUong;
	}
	public void setTenMonAnUong(String tenMonAnUong) {
		this.tenMonAnUong = tenMonAnUong;
	}
	public double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "MonAnUong [monAnUong=" + monAnUong + ", tenMonAnUong=" + tenMonAnUong + ", giaTien=" + giaTien
				+ ", loai=" + loai + ", soLuong=" + soLuong + "]";
	}
	
}