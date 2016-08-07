package tr.org.linux.kamp2016.helloworld;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sphere {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Kürenin yarıçapın giriniz: ");
		try{ //Gövdekileri yapmayı dene.Hata olursa ekrana catch bölümündekileri bastırır.
		double yarıçap = input.nextDouble();
		System.out.println("Hacim:" + kureHacmi(yarıçap));	
		}
		catch(InputMismatchException e){
			
			System.out.println("Başka bir şey değil, sayı gir.");
		}
	
	}
	public static double kureHacmi(double yarıçap){
		
		double hacim = (4.0 / 3.0) * Math.PI * Math.pow(yarıçap, 3);
				
				return hacim;
	}

}
