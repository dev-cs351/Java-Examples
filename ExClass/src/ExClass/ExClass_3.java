package ExClass;

public class ExClass_3 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		
		System.out.println("main() : x = " + d.x);
		System.out.println("After change");
		change_x(d.x);
		System.out.println(", main() : x = " + d.x);
		change_d(d);
		System.out.println(", main() : x = " + d.x);

	}
	
	// 기본형 매개변수
	static void change_x(int x) { 
		x = 1000;
		System.out.print("change_x() : x = " + x);
	}
	
	// 참조형 매개변수
	static void change_d(Data d) {
		d.x=1000;
		System.out.print("change_d() : x = " + d.x);
	}
	
}

class Data { int x; }
