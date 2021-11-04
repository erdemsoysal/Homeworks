package Odevler;

import java.util.Scanner;
import java.math.*;

public class IkinciDerecedenDenklemKokuBulma {

	public static void main(String[] args) {
		
		double a,b,c,delta,x1,x2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen a sayısını giriniz: ");
		a = scan.nextInt();
		System.out.println("Lütfen b sayısını giriniz: ");
		b = scan.nextInt();
		System.out.println("Lütfen c sayısını giriniz: ");
		c = scan.nextInt();
		
		delta = (b*b) - (4*a*c);
		System.out.println("delta = " + delta);
		
		if (delta == 0) 
		{
			x1=x2=(-b) / (2*a);
			System.out.println("Denklemin kökleri x1= " + x1 + " ve x2= " + x2 );
		}
		
		else if (delta > 0) 
		{
			x1= ((-b) + Math.sqrt(delta)) / (2*a);
			x2= ((-b) - Math.sqrt(delta)) / (2*a);
			System.out.println("Denklemin kökleri x1= " + x1 + " ve x2= " + x2 );
		}
		
		else 
		{
			System.out.println("Denklemin gerçel sayılar ile ifade edilecek bir kökü yoktur.");
		}
		
	}

}
