
public class ConcatinationUsingOperators {

	public static void main(String[] args) {
		System.out.println("Hello World !");
		
		/*
		 * Q 1 - Length and breadth of a rectangle are 5 and 7 respectively. Write a
		 * program to calculate the area and perimeter of the rectangle. 
		 * Area Formula => a = length * breadth 
		 * Perimeter of rectangle formula => p = 2(l+b)
		 */
		
		System.out.println("Area of Rectangle : " + 5 * 7);
		System.out.println("Perimeter of triangle : " + 2*(5+7));
		
		/*
		 * Q 2 - Write a program to calculate the perimeter of a triangle having sides of
		 * length 2,3 and 5 units.
		 * PERIMETER OF A TRIANGLE FORMULA => P = side + base + side
		 */
		System.out.println("Perimeter of triangle : " + (2+3+5));
		
		/*
		 * Q 3 - Write a program to add 8 to the number 2345 and then divide it by 3. 
		 * Now, the modulus of the quotient is taken with 5 and 
		 * then multiply the resultant value by 5. Display the final result.
		 * step 1 - Add 2 to the number 2345 and divide by 3
		 * Step 2 - quotient modulus % with 5 
		 * Step 3 - Multiply with 5
		 */
		
		System.out.println((((8+2345)/3)%5)*5);
		
		/* Q 4 - Now, solve the above question using assignment operators (eg. +=, -=, *=). */
		
		int a = 8;
		int b = 2345;
		
		a +=2345;
		a /=3;
		a %=5;
		a *=5;
		
		System.out.println(a);
		
		/* Q 5 - Write a program to check if the two numbers 23 and 45 are equal. */
		
		System.out.println("Check that 23 and 45 are equal - " + (23==45));
		
		/* Q 6 - Write a program to print the power of 7 raised to 5 */
		
		System.out.println("Power of 7 raised to 5 : " + Math.pow(7, 5));
		
		/*
		 * Q 7 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then
		 * check if both the conditions 'a < 50' and 'a < b' are true
		 * step 1 - initialize a and b to the variable
		 * Step 2 - Check a< 50 and a<b
		 */
		
		int c = 55;
		int d = 70;
		System.out.println(c<50 && c<d);
		
		/*
		 * Q 8 - Now solve the above question to check if atleast one of the conditions 'a <
		 * 50' or 'a < b' is true.
		 */
		System.out.println(c<50 || c<d);
		
		
	}
	
}
