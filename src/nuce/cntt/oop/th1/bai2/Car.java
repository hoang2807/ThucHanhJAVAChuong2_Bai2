package nuce.cntt.oop.th1.bai2;

public class Car {
	private String tenxe;
	private String hangsx;
	private SeatBelt seatbelt;
	private Engine engine;
	private boolean trangthai;

	public Car(String tenxe, String hangsx, SeatBelt seatbelt, Engine engine) {
		this.tenxe = tenxe;
		this.hangsx = hangsx;
		this.seatbelt = seatbelt;
		this.engine = engine;
	}

	public String getTenxe() {
		return tenxe;
	}

	public void setTenxe(String tenxe) {
		this.tenxe = tenxe;
	}

	public String getHangsx() {
		return hangsx;
	}

	public void setHangsx(String hangsx) {
		this.hangsx = hangsx;
	}

	public SeatBelt getSeatbelt() {
		return seatbelt;
	}

	public void setSeatbelt(SeatBelt seatbelt) {
		this.seatbelt = seatbelt;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public boolean isTrangthai() {
		return trangthai;
	}

	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}

	public void khoidong() {
		System.out.println("Khoi dong xe");
		this.trangthai = true;
		if (!seatbelt.isTrangthai())
			seatbelt.setTrangthai(true);
		engine.setTrangthai(true);
		System.out.println();
	}

	public void chay() {
		System.out.println("Chay xe");
		String tt = engine.isTrangthai() ? "bat" : "tat";
		System.out.println("Dong co dang " + tt);
		System.out.println();
	}

	public void dung() {
		System.out.println("Dung xe");
		engine.setTrangthai(false);
		System.out.println("Dong co da tat");
		this.trangthai = false;
		System.out.println();
	}

	public void rakhoixe() {
		System.out.println("Ra khoi xe");
		seatbelt.setTrangthai(false);
		String tb = engine.isTrangthai() ? "Dong co chua tat" : "";
		System.out.println(tb);
	}

	public void display() {
		System.out.println("Ten xe: " + tenxe);
		System.out.println("Ten hang san xuat: " + hangsx);
		System.out.println();
		System.out.println("SeatBelt:");
		seatbelt.output();
		System.out.println();
		System.out.println("Engine:");
		engine.output();
		System.out.println();

	}

}
