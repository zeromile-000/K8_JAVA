package Chap5;

class Person {
	private String name;
	private int	age;
	private float weight;
		
		public void setName(String name) { // 3. name이 private으로 선언되어 있기에 접근하기 위해 set을 선언
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setWeight(float weight) {
			this.weight = weight;
		}


	    // 메소드
	    void show() { // 5. 아래 출력문 실행
	    	System.out.println("name = "+ name + ", "+ "age = "+ age + ", "+"weight = "+ weight);

	    }
	    


	}

	public class 실습5_1클래스객체 {
	    public static void main(String[] args) {
	        // 객체 생성
	        Person p = new Person(); //1. 객체 생성
	        p.setName("홍길동"); // 2. set을 사용했으므로 setName( ); 를 이용하여 name 필드에 값 대입
	        p.setAge(25);
	        p.setWeight(60.56f); // float형이기에 f 표기
	        p.show(); // 4. void형 메서드 show 호출
	        
	        Person p2 = new Person();
	        p2.setName("강감찬");
	        p2.setAge(55);
	        p2.setWeight(62.34f);
	        p2.show();

	    }
	}
