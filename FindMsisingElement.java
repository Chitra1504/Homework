package week1.homework;

import java.util.Arrays;

public class FindMsisingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1, 4,3,2,8, 6, 7},sum=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];//1+4+3+2+8+6+7=31
		int max=arr[arr.length-1];
		int missingnum=(max*(max+1)/2)-sum;//(8*9/2)-31->(72/2)-31->36-31=5
		System.out.println(missingnum);
	}

}
