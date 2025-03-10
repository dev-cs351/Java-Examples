package ExClass;

public class ExClass_5 {
	static int[] arr = new int[10];
	
	static {
		System.out.println("클래스 초기화 블럭 생성");
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}
	
	{
		System.out.println("인스턴스 초기화 블럭 생성");
		System.out.println("클래스 초기화 블럭에서 선언한 arr 배열 중 무작위의 수: " + arr[(int)(Math.random()*10)]);
	}
	
	public ExClass_5() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		System.out.println("ExClass_5 ex = new ExClass_5();");
		ExClass_5 ex = new ExClass_5();
		
		System.out.println("ExClass_5 ex2 = new ExClass_5();");
		ExClass_5 ex2 = new ExClass_5();

	}

}
