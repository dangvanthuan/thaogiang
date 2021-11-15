package bai5.chuong4;

import java.util.Calendar;

public class KhachHangVN1 extends KhachHang1 {
	private String doiTuong;
	public final double DMSH = 100, DMKD = 200, DMSX = 300;

	@Override
	public double getThanhTien() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(String dt) {
		try {
			if (dt != null) {
				this.doiTuong = dt;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public KhachHangVN1(String ma, String hoTenKH, Calendar ngayLapHD, double donGia, double soKW, String doiTuong) {
		super(ma, hoTenKH, ngayLapHD, donGia, soKW);
		this.doiTuong = doiTuong;
	}

	public KhachHangVN1(String ma, String hoTenKH, Calendar ngayLapHD, double donGia, double soKW) {
		super(ma, hoTenKH, ngayLapHD, donGia, soKW);
		// TODO Auto-generated constructor stub
	}

	public double getThanhThien() {
		double tt = 0;
		if (getDoiTuong() == "Sản xuất")
			if (getSoKW() >= DMSX)
				tt = getDonGia() * DMSX + (getSoKW() - DMSX) * getDonGia() * 2.5;
			else
				tt = getDonGia() * getSoKW();
		if (getDoiTuong() == "Kinh doanh")
			if (getSoKW() >= DMKD)
				tt = getDonGia() * DMSX + (getSoKW() - DMKD) * getDonGia() * 2.5;
			else
				tt = getDonGia() * getSoKW();
		if (getDoiTuong() == "Sinh hoạt")
			if (getSoKW() >= DMSH)
				tt = getDonGia() * DMSH + (getSoKW() - DMSH) * getDonGia() * 2.5;
			else
				tt = getDonGia() * getSoKW();
		return tt;
	}

	@Override
	public String toString() {
		String s1 = "", s2 = "";
		s1 = s1.format("%-10s|", getDoiTuong());
		s2 = s2.format("%15s|", super.sf.format(getThanhTien()));
		return super.toString() + s1 + s2;
	}

}
