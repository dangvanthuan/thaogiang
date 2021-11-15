package bai5.chuong4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KhachHangNN extends KhachHang {
	private String quocTich;
	// Đóng gói dữ liệu
	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	public KhachHangNN() {
		
	}
	public KhachHangNN(String maKH, String hoTenKH, Calendar ngayLapHD, 
			double donGia, double soKW, String qt) {
		super(maKH, hoTenKH, ngayLapHD, donGia, soKW);// Thừa kế
		this.quocTich=qt;
	}
	@Override
	public double getThanhTien() {
		return getSoKW()*getDonGia();
	}
@Override
public String toString() {
	String s1="", s2="";
	s1=s1.format("%-10s|",getQuocTich());
	s2=s2.format("%15s|",super.sf.format(getThanhTien()));// thừa kế
	// Thừa kế
	return super.toString()+s1+s2;
}

	

}
