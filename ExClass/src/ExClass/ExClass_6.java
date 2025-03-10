package ExClass;

import java.io.IOException;
import java.sql.SQLException;

public class ExClass_6 {

	public static void main(String[] args) throws IOException {
		Point point = new Point(2, 4);
		Point3D p = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D();
		Circle c = new Circle(point, 9);
		System.out.println("point1: " + p.getLocation());
		System.out.println("point2: " + p2.getLocation());
		System.out.println("circle: " + c.getCircleLocation());
	}

}

class Point {
	int x, y;
	Point() {}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	String getLocation() throws IOException, SQLException {
		return "x = " + x + ", y = " + y;
	}
}

// 상속 관계, ~는 ~이다. (is) // Point3D 는 Point 이다.
class Point3D extends Point { // Point 를 상속받는 Point3D
	int z;
	Point3D(int x, int y, int z) {
		super(x, y); // super() 는 조상의 생성자를 호출하는데 사용 즉, Point(x, y) // this() 는 같은 클래스의 다른 생성자를 호출하는데 사용
		this.z = z;  
	}
	Point3D() {
		this(0, 0, 0); // this() 는 같은 클래스의 다른 생성자를 호출하는데 사용 즉, Point3D(0, 0, 0)
	}
	
	// overriding
	String getLocation() throws IOException { 
		return "x = " + x + ", y = " + y + ", z = " + z;
	}
	/* 1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
	 * 2. 접근 제어자(public, private, protected)를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
	 * 3. 예외는 조상클래스의 메서드보다 많이 선언할 수 없다.
	 * */
}
/* 자손 클래스는 조상 클래스의 모든 멤버를 상속받지만, 생성자와 초기화 블럭은 상속받지 않는다. 
 * */

//포함 관계, ~는 ~를 가지고 있다. (has) // circle 은 point 를 가지고 있다.
class Circle {
	Point c = new Point(); 
	int r;
	
	Circle() {}
	Circle(Point p, int x) {
		c = p;
		r = x;
	}
	
	String getCircleLocation() { // 상속 관계가 아니므로 getLocation() 을 overriding 할 수 없다.
		return "x = " + c.x + ", y = " + c.y + ", r = " + r;
	}
}