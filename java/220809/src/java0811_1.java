class ex{
	//멤버 변수 선언부
	private int a;
	private int b;
	private double n1;
	private double n2;
	//생성자 선언부
	//오버로딩 : 매개변수의 수와 타입이 다르면 같은 이름의 함수도 함께 사용할 수 있다.
	//주의점 : 반환형만 다른건 오버로딩이 불가능
	public ex() { //매개변수가 없음
		this.a=1;
		this.b=2;
	}
	public ex(int a, int b) { //int형 매개변수가 있음
		this.a=a;
		this.b=b;
	}
	public ex(double a, double b) { // double형 매개변수가 있음
		this.n1=a;
		this.n2=b;
	}	
	
	public int getA() {return this.a;}
	public int getB() {return this.b;}
	public double getN1() {return this.n1;}
	public double getN2() {return this.n2;}

	
	public int sum(int a,int b) {
		return a+b;
	}
	public double sum(double a, double b) {
		return a+b;
	}
	
	
}
public class java0811_1 {

	public static void main(String[] args) {
		//매개변수가 없는 생성자를 지동 실행
		ex test1=new ex();		
		//int형 매개변수가 있는 생성자 자동 실행
		ex test2=new ex(7,7);
		//double형 매개변수가 있는 생성자 자동 실행
		ex test3=new ex(7.7,77.7);
		
		int t1=test1.sum(test1.getA(),test1.getB());
		int t2=test2.sum(test2.getA(), test2.getB());
		double t3=test3.sum(test3.getN1(), test3.getN2());
		
		System.out.println("test1의 덧셈 결과: "+t1);
		System.out.println("test2의 덧셈 결과: "+t2);
		System.out.println("test3의 덧셈 결과: "+t3);

		//객체배열
		//int i[]=new int [3];
		ex s[]=new ex[3];
		s[0].getN1();
	}

}
