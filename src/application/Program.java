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

		witchIsBigger(areaA, areaB);
		
		sc.close();
	}
	
	public static void witchIsBigger(double a, double b) {
		if(a > b) {
			System.out.printf("Triangle A is bigger, with the area of: %.4f%n", a);
			System.out.printf("Triangle B has an area of: %.2f%n", b);
		}else {
			System.out.printf("Triangle B is bigger, with the area of: %.4f%n", b);
			System.out.printf("Triangle A has an area of: %.2f%n", a);
		}
	}
}

