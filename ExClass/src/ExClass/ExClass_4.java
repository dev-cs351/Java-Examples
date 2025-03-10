package ExClass;

public class ExClass_4 {

	public static void main(String[] args) {
		Cart car = new Cart();
		Cart truck = new Cart("blue", "A", 4);
		
		car.viewCart();
		System.out.println();
		truck.viewCart();

	}

}

class Cart {
	String color;
	String gearType;
	int door;
	
	Cart() {
		/*
		color = "None";
		gearType = "None";
		door = 0;
		*/
		this("None", "None", 0); // 생성자 내에서 또 다른 생성자를 호출할 시 this를 이용한다.
	}
	
	Cart(String color, String g, int d) {
		// this 는 참조변수로 인스턴스 자신을 가리킨다.
		this.color = color; // this.color는 인스턴스 변수, color는 생성자의 매개변수로 정의된 지역변수
		gearType = g;
		door = d;
	}
	
	void viewCart() {
		System.out.println(color);
		System.out.println(gearType);
		System.out.println(door);
	}
}