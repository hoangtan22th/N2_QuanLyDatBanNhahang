package entity;

public class MonAnUong {
	private String maMonAnUong;
	private String tenMonAnUong;
	private double giaTien;
	private String loai;
<<<<<<< HEAD
	private int soLuong;

	public MonAnUong(String maMonAnUong, String tenMonAnUong, double giaTien, String loai, int soLuong) {
=======

	public MonAnUong(String maMonAnUong, String tenMonAnUong, double giaTien, String loai) {
>>>>>>> d7b736e85fac5dda061e9782de5fcaf98def3e83
		super();
		this.maMonAnUong = maMonAnUong;
		this.tenMonAnUong = tenMonAnUong;
		this.giaTien = giaTien;
		this.loai = loai;
		
	}

	public MonAnUong() {

	}
<<<<<<< HEAD

=======
public MonAnUong(String maMonAnUong) {
	super();
	this.maMonAnUong = maMonAnUong;
	}
>>>>>>> d7b736e85fac5dda061e9782de5fcaf98def3e83
	public String getMaMonAnUong() {
		return maMonAnUong;
	}

	public void setMaMonAnUong(String maMonAnUong) {
		this.maMonAnUong = maMonAnUong;
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
<<<<<<< HEAD
		this.loai = loai;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

=======
		this.loai = loai;}
	
>>>>>>> d7b736e85fac5dda061e9782de5fcaf98def3e83
	@Override
	public String toString() {
		return "MonAnUong [monAnUong=" + maMonAnUong + ", tenMonAnUong=" + tenMonAnUong + ", giaTien=" + giaTien
				+ ", loai=" + loai + ",]";
	}

}
