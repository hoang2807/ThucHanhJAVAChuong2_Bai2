package nuce.cntt.oop.th1.bai2;

public class SeatBelt {
	private String hangsx;
	private int dodai;
	private boolean trangthai;

	public SeatBelt(String hangsx, int dodai, boolean trangthai) {
		this.hangsx = hangsx;
		this.dodai = dodai;
		this.trangthai = trangthai;
	}

	public String getHangsx() {
		return hangsx;
	}

	public void setHangsx(String hangsx) {
		this.hangsx = hangsx;
	}

	public int getDodai() {
		return dodai;
	}

	public void setDodai(int dodai) {
		this.dodai = dodai;
	}

	public boolean isTrangthai() {
		return trangthai;
	}

	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}

	public void changeTrangThai(boolean trangthai) {
		this.trangthai = !trangthai;
	}

	public void output() {
		System.out.println("Hang san xuat: " + hangsx);
		System.out.println("Do dai: " + dodai);
	}
}
