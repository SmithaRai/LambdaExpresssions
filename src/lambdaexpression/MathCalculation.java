package lambdaexpression;

import java.util.Scanner;

interface math
   {
	void calculate(int a , int b);
   }
public class MathCalculation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("******************MATH CALCULATIONS USING LAMBDA**************************");
     
		math add = (a,b)->System.out.println("addition : "+(a+b));
		math subtract = (a,b)->System.out.println("subtraction : "+(a-b));
		math division = (a,b)->System.out.println("division : "+(a/b));
		
		add.calculate(3, 4);
		subtract.calculate(10, 5);
		division.calculate(50, 5);
	}

}
