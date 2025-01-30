package hw1;

//added comment

public class GitHw1 {
	
public static void main (String args []) {
		
		/**
		 * boolean data type:
		 * 		can store either true/false as a value
		 */
		
		boolean isJavaFun = true;
		boolean isTodaySunday = false;
		
		System.out.println(isJavaFun);//true
		System.out.println(isTodaySunday);//false
		
		
		/**
		 * In this example on the right side (after equal) we have NUMBERS
		 * 		BUT we are comparing 1 number against another number, 
		 * 			the OUTCOME of this comparison is BOOLEAN 
		 */
		
		
		boolean result1 = 11 > 3; // because the outcone of comparison will be BOOLEAN_VALUE
		System.out.println(result1); //true
		
		boolean result2 = 1 > 2;
		System.out.println(result2); //false
		
		boolean result3 = (10 > 2) && (11 < 3);
		System.out.println(result3); //false
		
		boolean result4 = !((11 != 10) && (!false && true) || (4 < 10));
		System.out.println(result4); //false 
		
		/**
		 * !((11 != 10) && (!false && true) || (4 < 10))
		 *       !(T    &&         T        ||     T)
		 *       !true
		 *       FALSE
		 * 
		 */           
		
		
	}


}
