
//사칙연산에 사용할 계산기 프로그램
class cal{	//부수적인 클래스 : 필요할때만 사용되는 클래스
	//접근 제어자 없이 멤버를 선언하면 public으로 자동으로 선언이 됨.
	private int num1;	//멤버 변수 (필드)
	private int num2;
	
	//생성자 : 메소드 중 하나이지만, 클래스명과 반드시 동일해야함
	//생성자는 반드시 public으로 설정해야함
	public cal() {		
		this.num1=1;
		this.num2=2;
	}
	public cal(int n1, int n2) {
		//보통 멤버 변수를 초기화하는 데에 많이 쓰임
		this.num1=n1;
		this.num2=n2;
	}
	//오버로딩:매개변수의 구성이 다르면 같은 이름의 메소드라도 함께 
	
	
	//set():특정 값을 변경하는 메소드
	//get():특정 값을 결과값으로 반환하는 메소드
	public void setnum1(int n) {
		this.num1=n;
	}
	public int getnum1() {
		return num1;
	}
	public void setnum2(int n) {this.num2=n;}
	public int setnum2() {return num2;}
	
	
	
	public int sum() {return num1+num2;}	//멤버 함수 (메소드)
	public int sub() {return num1-num2;}
	public int mul() {return num1*num2;}
	public int div() {return num1/num2;}
	public int rest() {return num1%num2;}
}



public class Main {

	public static void main(String[] args) {	//대표 클래스:이 클래스를 위로 실행이 됨
		cal c1=new cal();
		cal c2=new cal();
		c1.setnum1(1);	//c1의 num1을 1로 설정한다.
		c2.setnum1(2);	//c2의 num1을 2로 설정한다.
		System.out.println("c1의 첫번째 숫자는 "+c1.getnum1());
		System.out.println("c2의 첫번째 숫자는 "+c2.getnum1());
		
		
	}

}
