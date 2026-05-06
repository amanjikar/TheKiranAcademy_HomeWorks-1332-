package method_calling;

public class Calculator {
	int addThree(int a,int b,int c) {
		int sum=a+b+c;
		return sum;
	}
	
	void average(int num1,int num2,int num3) {
		Calculator c1=new Calculator();
		int res=c1.addThree(num1,num2,num3);
		int avg=res/3;
		System.out.println("Average is : "+avg);
	}
	
	
}
