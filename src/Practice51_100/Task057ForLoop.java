package Practice51_100;

public class Task057ForLoop {

	public static void main(String[] args) {
		/*
		 * Create a for loop that prints out odd numbers from 5 to 22

Must not include the number 22 in the output 

Expected Output:  
5
7
9
11
13
15
17
19
21
		 */

		for(int i=5; i<22; i++) {
			if(i%2!=0)
			System.out.println(i);
		}
	}

}
