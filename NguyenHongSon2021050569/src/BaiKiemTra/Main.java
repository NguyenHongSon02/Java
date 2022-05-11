package BaiKiemTra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Saler NV1BH = new  Saler();
     NV1BH.setName("Nguyễn Hồng Sơn ");
     NV1BH.setSalesDoanhSo(332000.0);
     NV1BH.getBonus();
     System.out.println("Name : " + NV1BH.getName() + "Doanh Số»‘ : " + NV1BH.getSalesDoanhSo() + "ThÆ°á»Ÿng : " + NV1BH.getBonus());
     Saler NV2BH = new  Saler();
     NV1BH.setName("Trần Thị Hoa ");
     NV1BH.setSalesDoanhSo(40000.0);
     NV1BH.getBonus();
     System.out.println("Name : " + NV1BH.getName() + "Doanh Số»‘ : " + NV1BH.getSalesDoanhSo() + "ThÆ°á»Ÿng : " + NV1BH.getBonus());
     Saler NVTT = new Trainee();
     NVTT.setName("Trần Ngọc Thảo");
     NVTT.setSalesDoanhSo(50000.0);
     NVTT.getBonus();
     System.out.println("Name : " + NVTT.getName() + "Doanh Số»‘ : " + NVTT.getSalesDoanhSo() + "ThÆ°á»Ÿng : " + NVTT.getBonus());
     
	}

}
