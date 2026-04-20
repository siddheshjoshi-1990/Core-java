package com.java.core;

import java.util.Scanner;

public class CalculatorScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        //Addition
        System.out.println("Enter First no:");
        int a = sc.nextInt();
        System.out.println("Enter Second no:");
        int b = sc.nextInt();
        
        int c = a + b;
        System.out.println("Addition is:" +c);
        
        //Substraction
        System.out.println("Enter no first:");
        int num1 =sc.nextInt();
        System.out.println("Enter no second");
        int num2 = sc.nextInt();
        
        int sub = num1 - num2;
        System.out.println("Substration is:" +sub);		
        
        //Multiplication 
        System.out.println("Enter no first:");
        int x = sc.nextInt();
        System.out.println("Enter no second:");
        int y = sc.nextInt();
        
        int mul = x * y;
        System.out.println("Multiplication is:" +mul);
        
        //Division
        System.out.println("Enter no first:");
        int no1 = sc.nextInt();
        System.out.println("Enter no second:");
        int no2 = sc.nextInt();
        
        int div = no1 / no2;
        System.out.println("Division is:" +div);
        
        //modification
        System.out.println("Enter no first:");
        int m1 = sc.nextInt();
        System.out.println("Enter no second:");
        int m2 = sc.nextInt();
        
        int mod = m1 % m2;
        System.out.println("Modification is:" +mod);
        
	}

}
