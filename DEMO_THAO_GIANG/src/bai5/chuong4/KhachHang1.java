package bai5.chuong4;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class KhachHang1 {
	//mã khách hàng, họ tên, ngày lập hoá đơn, đơn giá, số kw, 
		protected String maKH, hoTenKH;
		protected Calendar ngayLapHD;
		protected double donGia, soKW;
		//Phương thức abstract
		public abstract double getThanhTien();
	// Đóng gói, tạo ràng buộc
		public String getMaKH() {
			return maKH;
		}
		public void setMaKH(String ma) {
			try {
				if (ma!=null) {
					this.maKH = ma;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		public String getHoTenKH() {
			return hoTenKH;
		}
		public void setHoTenKH(String hoTenKH) {
			this.hoTenKH = hoTenKH;
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
		public void setDonGia(double gia) {
			try {
				if (gia>0) {
					this.donGia = gia;
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		public double getSoKW() {
			return soKW;
		}
		public void setSoKW(double soKW) {
			this.soKW = soKW;
		}
		// constructor
		public KhachHang1(String ma, String hoTenKH, Calendar ngayLapHD, double donGia, double soKW) {
			try {
				if (ma!="") {
					this.maKH = maKH;
				}
				
			} catch (Exception e) {
				System.out.println("Mã khách hàng khác rỗng");
			}
			
			this.hoTenKH = hoTenKH;
			this.ngayLapHD = ngayLapHD;
			this.donGia = donGia;
			this.soKW = soKW;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((maKH == null) ? 0 : maKH.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			KhachHang1 other = (KhachHang1) obj;
			if (maKH == null) {
				if (other.maKH != null)
					return false;
			} else if (!maKH.equals(other.maKH))
				return false;
			return true;
		}
		public SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		public DecimalFormat sf= new DecimalFormat("#,###.00 VND");
		public void tieuDeVN() {
			for (int i = 0; i < 112; i++) {
				System.out.printf("-");
			}
			System.out.println();
			System.out.printf("|%-14s|%-25s|%-16s|%-15s|%-10s|%-10s|%-15s|\n", "Mã Khách hàng", "Tên khách hàng", "Ngày lập hóa đơn","Đơn giá","Số KW","Đối tượng","Thành tiền");
			for (int i = 0; i < 112; i++) {
				System.out.printf("-");
			}
			System.out.println();
		}
		public void tieuDeNN() {
			for (int i = 0; i < 112; i++) {
				System.out.printf("-");
			}
			System.out.println();
			System.out.printf("|%-14s|%-25s|%-16s|%-15s|%-10s|%-10s|%-15s|\n", "Mã Khách hàng", "Tên khách hàng", "Ngày lập hóa đơn","Đơn giá","Số KW","Quốc tịch","Thành tiền");
			for (int i = 0; i < 112; i++) {
				System.out.printf("-");
			}
			System.out.println();
		}
		@Override
		public String toString() {
			String s="";
			s=s.format("|%-14s|%-25s|%-16s|%15s|%10s|", getMaKH(), getHoTenKH(), 
					df.format(getNgayLapHD().getTime()), sf.format(getDonGia()), getSoKW());
			return s;
		}
		
		

}
