package week1.homework;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17,flag=0;
		for(int i=2;i<n-1;i++) {
			if(n%i==0)
			{
				System.out.println("The number "+n+" is not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("The number "+n+" is a prime number");
	}

}
