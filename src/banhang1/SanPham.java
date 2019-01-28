package banhang1;

import java.util.Scanner;

public class SanPham {
	private String maSP;
	private String tenSP;
	private float gia;
	private String xuatXu;
	
	public SanPham(String maSP, String tenSP, float gia, String xuatXu) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.xuatXu = xuatXu;
	}
	
	public SanPham() {
		super();
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}
	
	public SanPham Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n ----- Nhập thông tin sản phẩm ----- ");
		System.out.print("Mã sản phẩm: ");
		maSP = sc.nextLine();
		System.out.print("Tên sản phẩm: ");
		tenSP = sc.nextLine();
		System.out.print("Gia: ");
		String line = sc.nextLine();
		gia = Float.parseFloat(line);
		System.out.print("Xuất xứ: ");
		xuatXu = sc.nextLine();
		SanPham temp = new SanPham(maSP, tenSP, gia, xuatXu);
		return temp;
	}

	@Override
	public String toString() {
		return "\nSanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", gia=" + gia + ", xuatXu=" + xuatXu + "]";
	}
}
