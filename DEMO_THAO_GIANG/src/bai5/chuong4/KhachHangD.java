package bai5.chuong4;

import java.util.Calendar;

public abstract class KhachHangD {
	//mã khách hàng, họ tên, ngày lập hoá đơn, đơn giá, số kw, 
		protected String maKH, hoTenKH;
		protected Calendar ngayLapHD;
		protected double donGia, soKW;
		//Phương thức abstract
		public abstract double getThanhTien();
		// Đóng gói 
		public String getMaKH() {
			return maKH;
		}
		// Tạo ràng buộc
		public void setMaKH(String ma) {
			try {
				if (ma!="") {
					this.maKH = maKH;
				}
			} catch (Exception e) {
				System.out.println(e);
			}	
		}
		public String getHoTenKH() {
			return hoTenKH;
		}
		public void setHoTenKH(String ht) {
			try {
				if (ht!=null) {
					this.hoTenKH = hoTenKH;
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		public Calendar getNgayLapHD() {
			return ngayLapHD;
		}
		public void setNgayLapHD(Calendar ngayLapHD) {
			this.ngayLapHD = ngayLapHD;
		}
		public double getDonGia() {
			return donGia;
		}
		public void setDonGia(double donGia) {
			this.donGia = donGia;
		}
		public double getSoKW() {
			return soKW;
		}
		public void setSoKW(double soKW) {
			this.soKW = soKW;
		}
		// cóntructor
		public KhachHangD(String maKH, String hoTenKH, Calendar ngayLapHD, double donGia, double soKW) {
			try {
				if (maKH!=null) {
					this.maKH = maKH;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			this.hoTenKH = hoTenKH;
			this.ngayLapHD = ngayLapHD;
			this.donGia = donGia;
			this.soKW = soKW;
		}
		
		
	

}
