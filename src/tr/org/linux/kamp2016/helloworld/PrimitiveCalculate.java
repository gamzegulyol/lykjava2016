package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class PrimitiveCalculate {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		boolean ctn = true;
		
		while(ctn){
			System.out.println("Bir sayi giriniz:");
			double inputNumber1 = input.nextDouble();
			
			System.out.println("Bir işlem giriniz");
			String inputFunction = input.next();
			
			switch (inputFunction) {
			case "+":
				System.out.println("Bir sayı daha giriniz:");
				double inputNumber2 = input.nextDouble();
				double result = inputNumber1 + inputNumber2;
				System.out.println(inputNumber1 + "+" + inputNumber2 + result );
				break;
			case "*":
				System.out.println("Bir sayı daha giriniz:");
				inputNumber2 = input.nextDouble();
				result = inputNumber1 * inputNumber2;
				System.out.println(inputNumber1 + "*" + inputNumber2  + result);
				
			default:
				System.out.println("İşlem Geçersizdir");
				break;
			}
			System.out.println("Devam etmek istiyor musunuz?(E/H)");
			String ctnString = input.next();
			if(ctnString.equals("H")){
				
				ctn = false;
			}
		}
		System.out.println("Bitti");
		
	}

}
