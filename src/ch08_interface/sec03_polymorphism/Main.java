package ch08_interface.sec03_polymorphism;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		car.frontLeftTire = new KumhoTire();
		car.backRightTire = new HankookTire();
		car.run();
		
		car.changeFrontTire(new HankookTire());
		car.run();
	}

}
