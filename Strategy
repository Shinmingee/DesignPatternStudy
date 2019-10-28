#Design Pattern Study

###Strategy Pattern
: 인터페이스의 구현으로 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴.

>Ex. Shape
>>삼각형, 사각형, 원을 등록할 수 있고
>>각각의 도형들에는 console로 각도형의 형태를 프린트
>>collection에 등록된 모든 도형은 allDraw 메소드로 한번에 그려져야함.
 
```java
 public class MainStrategy {

    public static void main(String[] args) {
        Shapes s = new Shapes();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rect rect = new Rect();
        
        triangle.draw();
        circle.draw();
        rect.draw();

        s.registerShape("Triangle");
        s.registerShape("Rect");
        s.registerShape("Triangle");
        s.registerShape("Circle");

        s.drawAll();

    }

}
```
