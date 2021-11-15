package bai5.chuong4;

import java.util.Calendar;
public class KhachHangVN extends KhachHang {
	protected String doiTuong;
	final double DMSH=50, DMKD=100, DMSX=200;
	// Đóng gói dữ liệu
	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String dt) throws Exception {
		if (doiTuong!=null) {
			this.doiTuong = dt;
		} else {
			throw new Exception("Lỗi");
		}
		
	}
	// Tạo constructor
	public KhachHangVN() {
		
	}
	public KhachHangVN(String maKH, String hoTenKH, Calendar ngayLapHD, double donGia, double soKW, String dt) {
		super(maKH, hoTenKH, ngayLapHD, donGia, soKW);
		this.doiTuong=dt;
	}
	@Override
	public double getThanhTien() {
		double tt=0;
		if (getDoiTuong()=="Sản xuất")
			if(getSoKW()>=DMSX)
				tt=getDonGia()*DMSX+(getSoKW()-DMSX)*getDonGia()*2.5;
			else
					tt=getDonGia()*getSoKW();
		if (getDoiTuong()=="Kinh doanh")
			if(getSoKW()>=DMKD)
				tt=getDonGia()*DMSX+(getSoKW()-DMKD)*getDonGia()*2.5;
			else
					tt=getDonGia()*getSoKW();
		if (getDoiTuong()=="Sinh hoạt")
			if(getSoKW()>=DMSH)
				tt=getDonGia()*DMSH+(getSoKW()-DMSH)*getDonGia()*2.5;
			else 
					tt=getDonGia()*getSoKW();
		return tt;
	}
	@Override
	public String toString() {
		String s1="", s2="";
		s1=s1.format("%-10s|",getDoiTuong());
		s2=s2.format("%15s|",super.sf.format(getThanhTien()));
		return super.toString()+s1+s2;
	}
	
}


	