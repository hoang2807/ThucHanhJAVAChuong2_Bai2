package nuce.cntt.oop.th1.bai2;

public class MainClass {

	public static void main(String[] args) {
		SeatBelt seatbelt = new SeatBelt("Berger", 40, false);
		Engine engine = new Engine("Mercedes", 500, false);
		Car car = new Car("Mercedes", "Mercedes-Benz", seatbelt, engine);
		car.display();
		car.khoidong();
		car.chay();
		car.dung();
		car.rakhoixe();
	}

}
