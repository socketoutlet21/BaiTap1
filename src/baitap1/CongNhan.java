package baitap1;

public class CongNhan extends CanBo {
	private int bac;

	public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	@Override
	public String toString() {
		return "Công nhân\nHọ và tên : " + getHoTen() + "\nTuổi : " + getTuoi()
				+ "\nGiới tính : " + getGioiTinh() + "\nĐịa chỉ : " + getDiaChi() + "\nBậc : " + getBac() + "\n";
	}

}
