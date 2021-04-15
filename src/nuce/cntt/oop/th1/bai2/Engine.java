package nuce.cntt.oop.th1.bai2;

public class Engine {
	private String hangsx;
	private int congsuat;
	private boolean trangthai;

	public Engine(String hangsx, int congsuat, boolean trangthai) {
		this.hangsx = hangsx;
		this.congsuat = congsuat;
		this.trangthai = trangthai;
	}

	public String getHangsx() {
		return hangsx;
	}

	public void setHangsx(String hangsx) {
		this.hangsx = hangsx;
	}

	public int getCongsuat() {
		return congsuat;
	}

	public void setCongsuat(int congsuat) {
		this.congsuat = congsuat;
	}

	public boolean isTrangthai() {
		return trangthai;
	}

	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}

	public void khoidong() {
		this.trangthai = true;
	}

	public void tat() {
		this.trangthai = false;
	}

	public void output() {
		System.out.println("Hang san xuat: " + hangsx);
		System.out.println("Cong suat: " + congsuat);
	}
}
