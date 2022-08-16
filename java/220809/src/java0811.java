class Student4{
	//멤버 변수 선언부
	private String name;
	private int num;
	private String major;
	
	public String getName() {return name;}
	public int GetNum() {return num;}
	public String getMajor() { return major;}
	
	public Student4(String na, int n, String m) {
		this.name=na;
		this.num=n;
		this.major=m;
	}
}

public class java0811 {

	public static void main(String[] args) {
		Student4 stu=new Student4("NMY", 20220811, "토목");
		
		System.out.println("이름은 "+stu.getName());
		System.out.println("학번은 "+stu.GetNum());
		System.out.println("전공은 "+stu.getMajor());
	}

}
