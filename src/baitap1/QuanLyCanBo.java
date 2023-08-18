package baitap1;

import java.util.ArrayList;

public class QuanLyCanBo {
	private ArrayList<CanBo> quanLy;

	public QuanLyCanBo() {
		this.quanLy = new ArrayList<CanBo>();
	}
	
	public QuanLyCanBo(ArrayList<CanBo> quanLy) {
		this.quanLy = quanLy;
	}
	
	//1. Thêm mới cán bộ
	public void themCanBo(CanBo cb) {
		this.quanLy.add(cb);
	}
	
	//2. Tìm kiếm theo họ tên
	public void timTheoHoTen(String hoTen) {
		for (CanBo canBo : quanLy) {
			if (canBo.getHoTen().indexOf(hoTen) >= 0)
				System.out.println(canBo);
		}
	}
	
	//3. Hiện thị thông tin về danh sách các cán bộ
	public void hienThiDanhSachCanBo() {
		for (CanBo canBo : quanLy) {
			System.out.println(canBo);
		}
	}
}
