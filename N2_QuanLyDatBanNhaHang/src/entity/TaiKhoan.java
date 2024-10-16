package entity;

import java.time.LocalDate;

public class TaiKhoan {
	private String taiKhoan;
	private String matKhau;
	private boolean role;
	private LocalDate ngayTaoTK;
	
	public TaiKhoan(String taiKhoan, String matKhau, boolean role, LocalDate ngayTaoTK) {
		super();
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.role = role;
		this.ngayTaoTK = ngayTaoTK;
	}
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public boolean isRole() {
		return role;
	}
	public void setRole(boolean role) {
		this.role = role;
	}
	public LocalDate getNgayTaoTK() {
		return ngayTaoTK;
	}
	public void setNgayTaoTK(LocalDate ngayTaoTK) {
		this.ngayTaoTK = ngayTaoTK;
	}
	@Override
	public String toString() {
		return "TaiKhoan [taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + ", role=" + role + ", ngayTaoTK=" + ngayTaoTK
				+ "]";
	}
	public boolean checkTK() {
		
		return true;
	}
}
