package banhang1;

import java.util.ArrayList;
import java.util.Scanner;


public class QuanLy {
	private ArrayList<DanhMuc> listDanhMuc = new ArrayList<DanhMuc>();
	Scanner sc = new Scanner(System.in);
	
	public void Nhap() {
		System.out.print("Nhập số danh mục: ");
		String line = sc.nextLine();
		int size = Integer.parseInt(line);
		
		for(int i=0;i<size;i++) {
			DanhMuc temp = new DanhMuc();
			listDanhMuc.add(temp.Nhap());
		}
	}
	
	public void Xuat() {		
		System.out.print("Mã danh mục cần xuất: ");
		String maDanhMuc = sc.nextLine();
		for(DanhMuc temp : listDanhMuc) {
			if(maDanhMuc.equals(temp.getMaDanhMuc())){
				System.out.println(temp);
			}
		}
	}
	
	public void CapNhat() {
		System.out.print("Mã danh mục cập nhật: ");
		String maDanhMuc = sc.nextLine();
		for(DanhMuc temp : listDanhMuc) {
			if(maDanhMuc.equals(temp.getMaDanhMuc())){
				temp.SuaTTSanPham();
			}
		}
	}
	
	public void Xoa() {
		System.out.print("Mã danh mục có sản phẩm cần xóa: ");
		String maDanhMuc = sc.nextLine();
		for(DanhMuc temp : listDanhMuc) {
			if(maDanhMuc.equals(temp.getMaDanhMuc())){
				temp.XoaSanPham();
			}
		}
	}
	
	public float ThongKe() {
		float result = 0;
		for(DanhMuc temp : listDanhMuc) {
			result+=temp.TongGia();
		}
		return result;
	}
	
	public void LietKe() {
		String tq = "trung quoc";
		for(DanhMuc temp : listDanhMuc) {
			temp.LietKe(tq);
		}
	}
	
	public void menu() {
		QuanLy ql = new QuanLy();
		while(true) {
		System.out.println("\n\t+++++++++++++++++++++ QUẢN LÝ BÁN HÀNG +++++++++++++++++++++++++++++");
		System.out.println("1.Nhập.");
		System.out.println("2.Xuất.");
		System.out.println("3.Cập nhật.");
		System.out.println("4.Xóa.");
		System.out.println("5.Thống kê.");
		System.out.println("6.Liệt kê.");
		System.out.println("0.Exit");
		System.out.print("Select: ");
		String line = sc.nextLine();
		int select = Integer.parseInt(line);
		
		switch(select) {
		case 1:{
			ql.Nhap();
			break;
		}
		case 2:{
			ql.Xuat();
			break;
		}
		case 3:{
			ql.CapNhat();
			break;
		}
		case 4:{
			ql.Xoa();
			break;
		}
		case 5:{
			System.out.println(ql.ThongKe());
			break;
		}
		case 6:{
			ql.LietKe();
			break;
		}
		case 0:{
			System.exit(1);
		}
		}}
	}
	
	public static void main(String[] args) {
		QuanLy ql = new QuanLy();
		ql.menu();
	}
}

