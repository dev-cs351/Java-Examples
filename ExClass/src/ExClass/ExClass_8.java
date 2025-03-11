package ExClass;

public class ExClass_8 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		b.summary();
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
		System.out.println("현재 남은 포인트는 " + b.bonusPoint + "점 입니다.");
	}

}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product {
	Tv1() {
		super(100); // Product(100)
	}
	public String toString() {return "Tv";}
}

class Computer extends Product {
	Computer() {
		super(200); // Product(100)
	}
	public String toString() {return "Computer";}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] cart = new Product[10]; // 자손 클래스의 객체들을 저장할 수 있는 조상 클래스 객체 배열.
	int i = 0;
	
	// 매개변수의 다형성을 이용해 Tv1, Computer 를 매개변수로 하는 각각의 메소드를 작성하지 않고 조상 클래스 하나만으로 작성이 가능하다.
	void buy(Product p) { 
		if(money < p.price) {
			System.out.println("잔액이 부족하여 구매가 불가능합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; // 제품을 cart 배열에 저장. 
		System.out.println(p + " 구매 완료");
	}
	
	// cart 배열을 이용해 자손 객체들을 한꺼번에 처리.
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + " 입니다.");
	}
}
