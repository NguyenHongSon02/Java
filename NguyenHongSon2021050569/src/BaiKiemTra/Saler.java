package BaiKiemTra;

import java.util.*;

public class Saler {
	private String name;
	private Double salesDoanhSo;
	private Double Bonus;
	public static Scanner s = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalesDoanhSo() {
		return salesDoanhSo;
	}

	public void setSalesDoanhSo(Double salesDoanhSo) {
		this.salesDoanhSo = salesDoanhSo;
	}

	public Double getBonus() {
		setBonus(Bonus);
		return Bonus;
	}

	public void setBonus(Double bonus) {
		Bonus=(salesDoanhSo*0.05);
	}

}
