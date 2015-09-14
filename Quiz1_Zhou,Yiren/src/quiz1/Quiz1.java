package quiz1;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args){
		double a;
		double b;
		double c;
		double d;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the touchdown number:");
		double TD = input.nextDouble();
		
		System.out.println("Please input total yards:");
		double Yards = input.nextDouble();
		
		System.out.println("Please input interceptions:");
		double INT = input.nextDouble();
		
		System.out.println("Please input completion；");
		double Comp = input.nextDouble();
		
		System.out.println("Please input the number of passes attempted:");
		double ATT = input.nextDouble();	
		
		double PR;
		a = ((Comp/ATT) - .3) * 5;
		b = ((Yards/ATT) - 3) * .25;
		c = (TD/ATT)*20;
		d = 2.375 - (INT/ATT*25);
		
		
		PR = ((a + b + c + d)/6) * 100;
		
		System.out.print("The passer rating for this player is ");
		System.out.printf("%2.1f", PR);
		
	}
}
