package Chap6;



class Student2 {
	private String name;
	private int age;
	private String[] subject;
	private int[] scores;
	private int count; //count는 배열의  index로 사용
	static int NumberStudents=0;
	
//	public Student2(String name, int age) {
//		this.name = name;
//		this.age = age;
//		subject = new String[10];
//		scores = new int [10];
//		count = 0;
//	}
	
     public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 학생 수를 반환하는 정적 메소드
    public static int getCount() {
        return NumberStudents;
    }

    // 학생 정보를 출력하는 메소드 (예시용)
    public void printStudent() {
    	System.out.println("이름 = "+ name + ", "+ "나이 = "+age);
    	for(int i=0;i<subject.length;i++) {
    		System.out.println("과목 = " + subject[i]+ ", " + "점수 = " + scores[i]);
    	}
    	System.out.println("-".repeat(40));
    }
}

public class 실습6_1객체생성자미사용 {
    static Student2 makeStudent(String name, int age, String[] subjects, int[] scores, int value) {
    	Student2 s = new Student2();
    	s.setName(name);
    	s.setAge(age);
    	s.setSubject(subjects);
    	s.setScores(scores);
        return s;
    }
    static void showStudents(Student2[] students) {
    	for(int i = 0; i<students.length; i++) {
    	students[i].printStudent();
    }
    }
    
	public static void main(String[] args) {
        String[] subjects = {"수학", "국어", "영어", "과학", "역사"};

        Student2[] students = {
            makeStudent("홍길동", 21, subjects, new int[]{85, 90, 78, 88, 92}, -1),
            makeStudent("김유신", 22, subjects, new int[]{75, 80, 85, 90, 95}, -1),
            makeStudent("계백", 23, subjects, new int[]{65, 70, 75, 80, 85}, -1),
            makeStudent("강감찬", 24, subjects, new int[]{95, 92, 88, 84, 91}, -1),
            makeStudent("을지문덕", 25, subjects, new int[]{88, 76, 85, 79, 90}, -1)
        };

        // 학생 정보 출력 (예시)
//        실습6_5.showStudents(students); // 정적 메서드는 클래스명.메서드명 형태로 사용해야 한다. 하지만, main 클래스 내에 위치해 있기 떄문에 생략해도 무관하다. 
          showStudents(students); 
    }

	
}

