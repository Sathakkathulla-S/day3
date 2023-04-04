package assignment.week2.home.day1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8,10};
		Arrays.sort(arr);
		System.out.println("The missing number is");
		
		for(int i=arr[0];i<arr.length;i++)
		{
			if(arr[i-1]!=i) {
				System.out.println(i);
				//break;
			}
		}

	}


	}


