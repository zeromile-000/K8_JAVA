package Chap5;

class Person2 {
	private String name; 
	private int age;
	private float weight;

	    public void setName(String name) { // private으로 선언한 name에 접근하기 위해 setName( ) 생성 
	        this.name = name;
	    }
	    public String getName() { // private으로 선언한 name 필드의 값을 반환받기 위해 getName( ) 생성
	    	return name;
	    }
	    
	    public int getAge() {
	    	return age;
	    }
	    public void setAge(int age) {
	    	this.age = age;
	    }
	    public float getWeight() {
	    	return weight;
	    }
	    public void setWeight(float weight) {
	    	this.weight = weight;
	    }
	    
		public void show() { // 5.아래 출력문 출력
	    	System.out.println("name= "+ name + ", " + "age = " + age + ", " + "weight = "+weight);
		} // Person 클래스 안에 위치해 있기 때문에 get() 메서드를 사용하지 않아도 된다.

		// 오버로딩된 show 메소드 (message를 출력)
	    public void show(String msg) { //6. 아래 출력물 출력
	        System.out.println("메시지 = " + msg);
	        System.out.println("name= "+ name + ", " + "age = " + age + ", " + "weight = "+weight);
	    }
	}

	public class 실습_5_2메소드오버로딩 {
	    public static void main(String[] args) {
	        // 객체 생성
	        Person2 p = new Person2(); // 1. person 클래스의 객체 생성 후 참조변수 p에 대입
//	        p.name = "홍길동"; // 오류 발생 : private 필드에 접근할 떄 setName( );으로 접근해야한다.
	        p.setName("홍길동"); // 2. private name 필드의 값을 변경하기 위해 참조변수명.setName( ); 선언
	        p.setAge(25); 
	        p.setWeight(62.123f);
	        //다음 코드를 디버깅
	        System.out.println("이름 = " + p.getName() + ", 나이 = " + p.getAge() + ", 몸무게 = " + p.getWeight()); 
	        // 3. 출력 
	        //오류발생 : private 필드의 값을 반환받기위해서는 참조변수명.getName()으로 접근해야 한다.
	        
	        p.show(); // 4. Person 클래스 안의 기본 메서드(파라미터가 없는) 메서드 호출
	        p.show("오버로딩"); // 매개변수가 있는 show 호출 
	    }
	}