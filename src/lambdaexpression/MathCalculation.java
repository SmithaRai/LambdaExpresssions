package lambdaexpression;

import java.util.Scanner;

interface math
   {
	int calculate(int a , int b);
	
	static void Result(int a , int b , math obj)
	{
		System.out.println("Result  : "+obj.calculate(a,b));
	}
   }
public class MathCalculation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("******************MATH CALCULATIONS USING LAMBDA**************************");
     
		math add = (a,b)->(a+b); 
		math subtract = (a,b)->a-b; 
		math division = (a,b)-> (a/b); 
		
		math.Result(5, 4, add);
		math.Result(5, 4, subtract);
		math.Result(5, 4, division);
	}

}
