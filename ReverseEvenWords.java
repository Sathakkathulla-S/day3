package assignment.week2.home.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop) 
			
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/
		String test = "I am a software tester";
		String[] sl = test.split(" ");
		char ch[];
		
			for (int i = 0; i < sl.length; i++) {
				//System.out.println(sl[i]);
				if(i%2==1) {
					ch = sl[i].toCharArray();
					for (int j = ch.length-1; j >= 0; j--) { 
				System.out.print(ch[j]);
					}
			} 
					else
					{
				System.out.print(sl[i]);
					}
				System.out.print(" ");
					}
	}
}