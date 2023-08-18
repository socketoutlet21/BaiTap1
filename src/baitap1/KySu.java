package baitap1;

public class KySu extends CanBo {
	private String nganhDaoTao;

	public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	@Override
	public String toString() {
		return "Kỹ sư\nHọ và tên : " + getHoTen() + "\nTuổi : " + getTuoi()
				+ "\nGiới tính : " + getGioiTinh() + "\nĐịa chỉ : " + getDiaChi() + "\nNgành đào tạo : " + getNganhDaoTao()+ "\n";
	}
}
