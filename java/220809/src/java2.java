class chart{
	private String name;
	private int number;
	private String gender;
	
	public chart(String n, int num, String g) {
		this.name=n;
		this.number=num;
		this.gender=g;
	}
		
		public String getName() {return this.name;}
		public int getNum() {return this.number;}
		public String getGender() {return this.gender;}
		public void setName(String n) {this.name=n;}
		public void setNum(int num) {this.number=num;}
		public void setGender(String g) {this.gender=g;}
}
public class java2 {
	public static void main(String[] args) {
		chart stu[]=new chart[3];
		
		stu[0]=new chart("이동준",2009038033,"남");
		stu[1]=new chart("이제영",2007012034,"여");
		stu[2]=new chart("박준현",2002012034,"남");
		
		for(int i=0;i<3;i++) {
			if(stu[i].name.equals("이동준")) {
				stu[i].setNum(2019038033);
			}
		}
		stu[2].setName("이뉴나");
		stu[2].setNum(18130956);
		stu[2].setGender("여");
		
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번째 학생");
			System.out.println("이름: "+stu[i].getName());
			System.out.println("학번: "+stu[i].getNum());
			System.out.println("성별: "+stu[i].getGender());
			System.out.println();
		}
	}
}
