
public class Car {
	
	public Car(int tire) { // 생성자(클래스의 이름과 같은 메소드)->생성자는 반환타입 없음!!
		System.out.println("생성자 호출!!");
		System.out.println("타이어 수:"+tire);
		this.tire = tire; // 생성자를 통해서 인수를 입력받아서 필드값을 초기화
	}
	
	int tire;
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxspeed = 350;
	int speed; // 초기값 없음
	
	int[] price = {1000, 2000}; //정수형 배열->필드
	
}
