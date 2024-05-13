
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		double b;
		Calculator cal1 = new Calculator();
		// Calculator 클래스로 new연산자를 사용하여 cal1 객체를 생성
		// Calculator cal2 = new Calculator();
		a = cal1.add(100, 200);
		b = cal1.divid(10, 3);
		
		System.out.println(a);
		
		cal1.pow(10);//100
		
		Car car = new Car(4);  // Car 클래스로 car라는 객체를 선언
		
		System.out.println(car.company);
		car.speed = 150;
		
		System.out.println(car.speed);
		
		System.out.println(car.price[0]);
		
		System.out.print(car.tire);
		
		Car car2 = new Car(2);
		
		Car2 car3 = new Car2("기아자동차", "K5", "회색", 200);
		
		System.out.println(car3.model);
		
		Car2 car4 = new Car2("기아자동차", "K5", "회색");
		
		Car2 car5 = new Car2();
		
		Test test = new Test();
		int[] arrTest = {1,2,3,4,5};
		test.sum1(arrTest);
		test.sum2(car2);
		
		System.out.println();
		
	}

}
