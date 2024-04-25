package application;

import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Triangle triangleA = new Triangle();
		Triangle triangleB = new Triangle();

		System.out.println("Please input the measures of triangle A: ");
	
		triangleA.a = sc.nextDouble();
		triangleA.b = sc.nextDouble();
		triangleA.c = sc.nextDouble();
		
		System.out.println("Please input the measures of triangle B: ");
		
		triangleB.a = sc.nextDouble();
		triangleB.b = sc.nextDouble();
		triangleB.c = sc.nextDouble();
		
		double areaA = triangleA.area();
		double areaB = triangleB.area();

		System.out.printf("Area of Triangle A: %.4f%n",areaA);
		System.out.printf("Area of Triangle B: %.4f%n",areaB);
		
		sc.close();
	

	}


}
