package entity;
import java.time.LocalDate;

public class TheThanhVien {
	private String maTTV;
	private double diemTichLuy;
	private LocalDate ngayDangKy;
	private LoaiThe loaiThe;
	
	public TheThanhVien(String maTTV, double diemTichLuy, LocalDate ngayDangKy, LoaiThe loaiThe) {
		super();
		this.maTTV = maTTV;
		this.diemTichLuy = diemTichLuy;
		this.ngayDangKy = ngayDangKy;
		this.loaiThe = loaiThe;
	}
	
	public String getMaTTV() {
		return maTTV;
	}
	public void setMaTTV(String maTTV) {
		this.maTTV = maTTV;
	}
	public double getDiemTichLuy() {
		return diemTichLuy;
	}
	public void setDiemTichLuy(double diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}
	public LocalDate getNgayDangKy() {
		return ngayDangKy;
	}
	public void setNgayDangKy(LocalDate ngayDangKy) {
		this.ngayDangKy = ngayDangKy;
	}
	public LoaiThe getLoaiThe() {
		return loaiThe;
	}
	public void setLoaiThe(LoaiThe loaiThe) {
		this.loaiThe = loaiThe;
	}
	public String toString() {
		return "TheThanhVien [maTTV=" + maTTV + ", diemTichLuy=" + diemTichLuy + ", ngayDangKy=" + ngayDangKy
				+ ", loaiThe=" + loaiThe + "]";
	}
	
}
