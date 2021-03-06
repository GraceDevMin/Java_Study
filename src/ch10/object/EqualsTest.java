package ch10.object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student) {
			Student std = (Student)obj; //다운캐스팅
			return (this.studentNum == std.studentNum);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;	//주소 같음
		Student Shin = new Student(100, "이순신");
		
		System.out.println(Lee == Shin);	//false (물리적 주소 다름)
		System.out.println(Lee.equals(Shin));
		
		System.out.println(Lee.hashCode());
		System.out.println(Shin.hashCode());
		
		Integer i3 = 200;
		Integer i4 = 200;
		
		System.out.println(i3.equals(i4));
		System.out.println(i3.hashCode());
		System.out.println(i4.hashCode());
		
		System.out.println(System.identityHashCode(i3));
		System.out.println(System.identityHashCode(i4));
	}

}
