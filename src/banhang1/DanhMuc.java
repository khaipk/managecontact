package banhang1;


import java.util.ArrayList;
import java.util.Scanner;

public class DanhMuc {
	private String maDanhMuc;
	private String tenDanhMuc;
	ArrayList<SanPham> listSP = new ArrayList<SanPham>();
	Scanner sc = new Scanner(System.in);

	public DanhMuc(String maDanhMuc, String tenDanhMuc, ArrayList<SanPham> listSP) {
		super();
		this.maDanhMuc = maDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
		this.listSP = listSP;
	}

	public DanhMuc() {
		super();
	}

	public String getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(String maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	public String getTenDanhMuc() {
		return tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}

	public DanhMuc Nhap() {
		System.out.println("\n ------ Nhập thông tin danh mục -----");
		System.out.print("Mã danh mục: ");
		String maDanhmuc = sc.nextLine();
		System.out.print("Tên danh mục: ");
		String tenDanhMuc = sc.nextLine();
		NhapSanPham();
		DanhMuc temp = new DanhMuc(maDanhmuc, tenDanhMuc, listSP);
		return temp;
	}

	public void NhapSanPham() {
		System.out.print("Số sản phẩm cần nhập: ");
		String line = sc.nextLine();
		int size = Integer.parseInt(line);

		String tenSP, maSP, xuatXu;
		float gia;
		for (int i = 0; i < size; i++) {
			SanPham temp = new SanPham();
			listSP.add(temp.Nhap());
		}
	}

	public void SuaTTSanPham() {
		System.out.print("\nMã sản phẩm cần cập nhật: ");
		String maSP = sc.nextLine();
		for (SanPham temp : listSP) {
			if (maSP.equals(temp.getMaSP())) {
				System.out.println("1.Cập nhật mã sản phẩm.");
				System.out.println("2.Cập nhật tên sản phẩm.");
				System.out.println("3.Cập nhật giá cả.");
				System.out.println("4.Cập nhật xuất xứ.");
				System.out.print("Select: ");

				String line = sc.nextLine();
				int select = Integer.parseInt(line);
				System.out.print("Thông tin cập nhật: ");
				String data = sc.nextLine();
				switch (select) {
				case 1: {
					temp.setMaSP(data);
					break;
				}
				case 2: {
					temp.setTenSP(data);
					break;
				}
				case 3: {
					float gia = Float.parseFloat(data);
					temp.setGia(gia);
					break;
				}
				case 4: {
					temp.setXuatXu(data);
					break;
				}
				}
			}
		}
	}

	public void XoaSanPham() {
		// TODO Auto-generated method stub
		
	}

	public float TongGia() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void LietKe(String tq) {
		// TODO Auto-generated method stub
		
	}
}
	
