package bai5.chuong4;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestKH {
	public static KhachHang nhap() {
		Scanner sc = new Scanner(System.in);
		String maKH, hoTenKH;
		String ngay;
		double donGia, soKW;
		int dt;
		String doiTuong=null;
		String quocTich;
		System.out.println("Nhap thong tin cho khach hang:");
		System.out.println("Mã Khách hàng;");
		maKH=sc.nextLine();
		System.out.println("Họ tên Khách hàng:");
		hoTenKH=sc.nextLine();
		System.out.println("Ngày lập hóa đơn:");
		ngay = sc.nextLine();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar ngayLapHD = new GregorianCalendar();
		try {
			Date d=df.parse(ngay);
			ngayLapHD.setTime(d);
			
		} catch (Exception e) {
			System.out.println("1");
		}
		int chon;
		System.out.println("Chọn loại Khách hàng:(1 là khách hàng trong nước, 2 là KH nước ngoài)");
		chon=sc.nextInt();
		if (chon==1) {
			System.out.println("Đối tương: Sinh hoạt=1, Kinh doanh=2,Sản xuất=3");
			dt = sc.nextInt();
			if (dt==1) {
				doiTuong="Sinh hoạt";
				donGia=1000;
				System.out.println("Đơn giá: "+ donGia +" VND" );
				}
			else
			if (dt==2) {
				doiTuong="Kinh doanh";
				donGia=2000;
				System.out.println("Đơn giá: "+ donGia +" VND" );
			}
			else {
				doiTuong="Sản xuất";
				donGia=3000;
				System.out.println("Đơn giá: "+ donGia +" VND" );
			}
		
			System.out.println("Số kw dùng điện:");
			soKW=sc.nextDouble();
			
			KhachHang kvn= new KhachHangVN(maKH, hoTenKH, ngayLapHD, donGia, soKW, doiTuong);
			return kvn;
		} else {
			System.out.println("Quốc tịch:");
			quocTich = sc.nextLine();
			System.out.println("Đơn giá:");
			donGia=sc.nextDouble();
			System.out.println("Số kw dùng điện:");
			soKW=sc.nextDouble();
			KhachHang knn = new KhachHangNN(maKH, hoTenKH, ngayLapHD, donGia, soKW, quocTich);
			return knn;
		}
	}

	public static void main(String[] args) {
		KhachHang k= new KhachHangNN();
		Calendar ngay1, ngay2, ngay3, ngay4, ngay5, ngay6;
		Calendar cal = Calendar.getInstance();
			cal.set(Calendar.MONTH,12);
			cal.roll(Calendar.MONTH,-1);
			cal.set(Calendar.DAY_OF_MONTH,31);
			cal.set(Calendar.YEAR,2019);
			ngay2= new GregorianCalendar(2019,5,8);
			ngay2.roll(Calendar.MONTH,-1);
			ngay3= new GregorianCalendar(2019,7,10);
			ngay3.roll(Calendar.MONTH,-1);
			ngay4= new GregorianCalendar(2019,10,12);
			ngay4.roll(Calendar.MONTH,-1);
			ngay5= new GregorianCalendar(2019,9,18);
			ngay5.roll(Calendar.MONTH,-1);
			ngay6= new GregorianCalendar(2019,11,13);
			ngay6.roll(Calendar.MONTH,-1);
		// Tính đa hình	
		KhachHang k1= new KhachHangNN("12345678", "Li Chang",cal,1000, 12, "Trung Quốc");
		KhachHang k2= new KhachHangNN("12345670", "Osa Kawa",ngay2,1000, 120, "Nhật Bản");
		KhachHang k3= new KhachHangNN("12345677", "Lena Tia",ngay3,1000, 50, "Nga");
		
		KhachHang k4= new KhachHangVN("12345688", "Trương Anh Kiệt",ngay4,1000, 120, "Sinh hoạt");
		KhachHang k5= new KhachHangVN("12345690", "Huỳnh Trần Nam",ngay5,5000, 100, "Sản xuất");
		KhachHang k6= new KhachHangVN("12345657", "Trần Ngọc Nam",ngay6,10000, 20, "Kinh doanh");
		
		k.tieuDeNN();
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		k.tieuDeVN();
		System.out.println(k4);
		System.out.println(k5);
		System.out.println(k6);
		int chon;
		Scanner sc = new Scanner(System.in);
		ListKH  kh = new ListKH();
		do {
			System.out.println("Chọn chức năng menu: (1-5)");
			System.out.println("1. Thêm KH");
			System.out.println("2. xuat ket Quả");
			chon=sc.nextInt();
			switch (chon) {
			case 1: {kh.themKH(nhap());break;}
			case 2: {k.tieuDeVN();kh.inKQ();break;}
			
			default:chon=13;
				break;
			}
			
		} while (chon!=13);

	}

}
