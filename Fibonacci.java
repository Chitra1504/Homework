package week1.homework;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=8,num1=0,num2=1;
		for(int i=0;i<input;i++) {
			System.out.print(num1+" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}

}
