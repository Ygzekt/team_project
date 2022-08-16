
// 클래스 내용 복습
//클래스 구성 : 필드(멤버 변수), 메소드(멤버함수), 생성자
//접근 제어자: public(외부로 공개), private(외부로 공개x)
// 객체 생성 : new 키워드 사용, 클래스명을 사용(클래스명은 int, double과 같은 타입명과 비슷한 취급)
//멤버 참조 및 호출과 같은 사용은 구조체와 비슷함(.을 사용)
//오버로딩->메소드 오버로딩, 생성자 오버로딩
//오버로딩 : 매개변수의 구성을 다르게 하여 동일한 함수명을 함께 사용하는 것
//this 문법 : 객체 자신을 가리키는 포인터 개념(저는 습관 들여져있어요.)

//오늘 예제: 도형 넓이를 계산하는 클래스 만들고 사용하기
//도형은 원, 사각형, 직각삼각형으로 한정

import java.util.Scanner;

class Shape{
	//멤버 변수 선언부
	private String name;
	private int a;
	private int b;
	
	//원의 넓이를 구하는 데에는 원의 반지름이 필요 -> a만 사용
	// 사각형의 넓이를 구하는 데에는 가로, 세로 길이가 필요 -> a,b 사용
	// 직각삼각형 넓이를 구하는 데 밑변, 높이가 필요 -> a,b 사용
	
	//생성자 선언부
	public Shape(String n, int a) {// 원 도형 생성 시 사용
		//매개 변수 2개 : 도형이름, 반지름
		this.name=n;
		this.a=a;
	}
	public Shape(String n, int a, int b) {// 직각삼각형, 사각형 생성 시 사용
		//매개변수 3개 : 도형이름, 반지름, 높이
		this.name=n;
		this.a=a;
		this.b=b;
	}
	
	//멤버 함수 선언부
	public double getSize(int r) { // 원 넓이를 구하는 함수
		return r*r*3.14;
	}
	public int getSize(int n1,int n2) {	//사각형 넓이 구하는 함수
		return n1*n2;
	}
	public double getSize(int n1,int n2,int t) {	//직각삼각형 넓이를 구하는 함수
		
	}
}

public class Main {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		Shape sh[]=new Shape[3];		//배열만 만들어진 상태
		for(int i=0;i<3;i++)
		{
			String name=s.next();
			if(name.equals("원"))// == 사용하면 안됨
			{
				int a=s.nextInt();
				sh[i]=new Shape(name, a);
			}
			else //사각형이나 직각삼각형일 때
			{
				int a=s.nextInt();
				int b=s.nextInt();
				sh[i]=new Shape(name, a,b);
			}
		}
		
	}
}
