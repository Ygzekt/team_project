//1번
class Student3 {
	//멤버 변수 선언부
	private String name;
	private int number;
	private String major;
	
	//멤버 함수 선언부
	public String getName() {return name;}
	public int GetNum() {return this.number;}
	public String getMajor() { return this.major;}
	
	//생성자 선언부
	public Student3(String n, int num, String m) {
		this.name=n;
		this.number=num;
		this.major=m;
	}
}

public class full_e {
	public static void main(String[] args) {
		//2번
		//객체 생성부
		Student3 stu=new Student3("NMY", 26, "토목");
		
		//출력 부분
		System.out.println(stu.getName());
		System.out.println(stu.GetNum());
		System.out.println(stu.getMajor());
	}

}
