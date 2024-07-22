package week1.homework;

public class FindOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		for(int i=0;i<num;i++){
			if(i%2==1) //or (i%2!=0)
				System.out.println("Number is odd: "+i);
		}
	}

}
