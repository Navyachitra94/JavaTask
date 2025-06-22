package javaprograms;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the Second Number:");
		int number2 = sc.nextInt();
		
		//Before Swap
		System.out.println("Before Swapping");
		System.out.println("The First Number:" + number1);
		System.out.println("The Second Number:" + number2);
			
		int temp=number1;
		number1=number2;
		number2=temp;
		
		//After Swap
		
		System.out.println("After Swapping");
		System.out.println("The First Number:" + number1);
		System.out.println("The Second Number:" + number2);		
		
}

}
