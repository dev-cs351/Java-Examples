package ExClass;

// 참조변수의 형변환
public class ExClass_7 {

	public static void main(String[] args) {
		AutoCar car = null; // 객체 주소(null) 선언
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = (AutoCar)fe;  // car 의 객체 주소에 fe 객체 주소를 저장.
							// fe 를 조상 클래스인 AutoCar 로 형변환 시켜서 가능해짐
							// car 는 여전히 AutoCar 객체이기 때문에 water() 메소드 사용 불가능
		car.drive();
		
		fe2 = (FireEngine)car;
		fe2.water();
	}

}

class AutoCar {
	String color;
	int door;
	
	void drive() {
		System.out.println("Drive on");
	}
	void stop() {
		System.out.println("Stoped");
	}
}

class FireEngine extends AutoCar {
	void water() {
		System.out.println("water shot");
	}
}