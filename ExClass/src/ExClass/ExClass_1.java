package ExClass;

public class ExClass_1 {

	public static void main(String[] args) {
		Tv t; // 객체 주소 선언
		t = new Tv(); // 객체 생성
		t.channel = 7;
		t.channelUp();
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
		
		//Tv[] tvArr = {new Tv(), new Tv(), new Tv()}; // 객체 주소와 함께 생성
		Tv[] tvArr = new Tv[3]; // 객체 주소 선언
		tvArr[0] = new Tv(); // 객체 생성
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		tvArr[0].channel = 5;
		tvArr[1].channel = 6;
		System.out.println(tvArr[0].channel);
		System.out.println(tvArr[1].channel);
	}

}

class Tv {
	// TV 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	// TV 기능(메서드)
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}