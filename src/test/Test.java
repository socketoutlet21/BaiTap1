package test;

import java.util.Scanner;

import baitap1.CongNhan;
import baitap1.KySu;
import baitap1.NhanVien;
import baitap1.QuanLyCanBo;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLyCanBo qlcb = new QuanLyCanBo();
		int luaChon = 0;
		do {
			System.out.println("MENU--------------------");
			System.out.println("Chọn chức năng");
			System.out.println(
					"1. Thêm mới cán bộ.\n"
				  + "2. Tìm kiếm theo họ tên.\n"
				  + "3. Hiện thị thông tin về danh sách các cán bộ.\n"
				  + "0. Thoát khỏi chương trình.");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			switch (luaChon) {
			case 1:
			// Thêm mới cán bộ
			System.out.println("\nChức năng 1");
			{
				int canBoLa = 0;
				do {
					System.out.println("Cán bộ của bạn là : ");
					System.out.println(
								"1. Công nhân\n"
							  + "2. Kỹ sư\n"
							  + "3. Nhân viên\n");
					
					canBoLa = sc.nextInt();
					sc.nextLine();
					
					switch (canBoLa) {
					case 1:
					//Cán bộ là Công nhân
					{
						System.out.println("Nhập họ tên: "); String hoTen = sc.nextLine();
						System.out.println("Nhập tuổi: "); int tuoi = sc.nextInt();
						sc.nextLine();
						System.out.println("Nhập giới tính (nam, nữ, khác): "); String gioiTinh = sc.nextLine();
						System.out.println("Nhập địa chỉ: "); String diaChi = sc.nextLine();
						System.out.println("Nhập bậc (1-10): "); int bac = sc.nextInt();
						CongNhan cn = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
						qlcb.themCanBo(cn);
					}	
						break;
						
					case 2:
					// Cán bộ là Kỹ sư
					{
						System.out.println("Nhập họ tên: "); String hoTen = sc.nextLine();
						System.out.println("Nhập tuổi: "); int tuoi = sc.nextInt();
						sc.nextLine();
						System.out.println("Nhập giới tính (nam, nữ, khác): "); String gioiTinh = sc.nextLine();
						System.out.println("Nhập địa chỉ: "); String diaChi = sc.nextLine();
						System.out.println("Nhập ngành đào tạo: "); String nganhDaoTao = sc.nextLine();
						KySu cn = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
						qlcb.themCanBo(cn);
					}
						break;
						
					case 3:
					// Cán bộ là Nhân viên
					{
						System.out.println("Nhập họ tên: "); String hoTen = sc.nextLine();
						System.out.println("Nhập tuổi: "); int tuoi = sc.nextInt();
						sc.nextLine();
						System.out.println("Nhập giới tính (nam, nữ, khác): "); String gioiTinh = sc.nextLine();
						System.out.println("Nhập địa chỉ: "); String diaChi = sc.nextLine();
						System.out.println("Nhập công việc: "); String congViec = sc.nextLine();
						NhanVien cn = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
						qlcb.themCanBo(cn);
					}
						break;

					default:
					// Nhập dữ liệu không phù hợp
						System.out.println("Nhập dữ liệu sai. Hãy nhập lại !");
						break;
					}
				} while (!(canBoLa==1 || canBoLa==2 || canBoLa==3));
				
			}
				break;
				
			case 2:
			// Tìm kiếm theo họ tên	
			{
				System.out.println("\nChức năng 2");
				System.out.println("Nhập họ và tên cần tìm: "); String hoTen = sc.nextLine();
				System.out.println("Kết quả tìm kiếm: ");
				qlcb.timTheoHoTen(hoTen);
			}
				break;
				
			case 3:
			// Hiện thị thông tin về danh sách các cán bộ
				System.out.println("\nChức năng 3"); 
				qlcb.hienThiDanhSachCanBo();
				break;

			default:		
				break;
			}
			
		}while(luaChon != 0);
		System.out.println("Đã thoát khỏi chương trình !");
	}
}
