package ch7;

public class AbstractExample1 {

   
   public static void main(String[] args) {
      // TODO Auto-generated method stub

   }

}

// 도형 클래스(추상 클래스)

// 추상 클래스 (abstract 클래스)
//  abstract를 사용하는 클래스는 추상 클래스, 추상 클래스는 추상 메서드를 포함하고 있습니다.
//  추상 클래스는 인스턴스화를 할 수 없음. 
// 추상 메서드 (abstract 메서드)
//  abstract를 사용하는 메서드로 선언한 부분에서 구현하지 않고, 상속 받은 자식 클래스서 구현됨. 

// 추상 클래스(*)
abstract class Shape {

   // 1. 멤버변수(필드)
   private int x;
   private int y;
   
   // 2. 생성자
   public Shape() {}
   
   public Shape(int x, int y) {
      this.x = x;
      this.y = y;
   }
   
   // 3. 메서드
   public String position() {
      return "[x = " + x + ", y = " + y + "]";
   }
   
   // 추상 메서드(*) - 추상 메서드가 있는 경우에는 해당 클래스는 추상 클래스가 되어야 함. 
   public abstract double getArea();    // 도형넓이.. 
}

// 추상 클래스를 상속받은 클래스
class Circle extends Shape {
   
   // 1. 필드(멤버변수)
   private int radius;   // 반지름
   
   // 2. 생성자
   public Circle(int r) {
      this(0, 0, r);
   }
   
   public Circle(int x, int y, int r) {
      super(x, y);  // 부모 클래스의 생성자
      this.radius = r;
   }
   
   // 3. 메서드
   @Override
   public double getArea() {  // 추상 메서드에 대한 구현부분... 
      return (Math.PI * radius * radius);
   }
   
}

// 사각형... 
class Rectangle extends Shape {
   
   // 1. 필드(멤버변수)
   private int height;
   private int width;
   
   // 2. 생성자
   public Rectangle() {}
   
   public Rectangle(int x, int y, int h, int w) {
      super(x, y);
      this.height = h;
      this.width = w;
   }
   
   public Rectangle(int h, int w) {
      this(0,0,h,w);
   }
   
   // 3. 메서드
   @Override
   public double getArea() {
      return (height * width);
   }
}







