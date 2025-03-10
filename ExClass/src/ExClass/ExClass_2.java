package ExClass;

public class ExClass_2 {

	public static void main(String[] args) {
		Car car, truck;
		car = new Car();
		truck = new Car();
		
		car.set();
		truck.set();
		
		car.gear=5;
		//car.version = 20;
		for(int i=0; i<20; i++) {
			car.versionUp();
		}
		
		
		System.out.println(car.gear);
		System.out.println(car.versionShow());
		System.out.println(truck.gear);
		System.out.println(truck.versionShow());
	}
}

class Car {
	static int version; // 클래스 변수
	int gear; // 인스턴스 변수
	
	void set() {gear=0; version=0;}
	void gearUp() {++gear;}
	void gearDown() {--gear;}
	void versionUp() {++version;}
	void versionDown() {--version;}
	int versionShow() {return version;}
}
