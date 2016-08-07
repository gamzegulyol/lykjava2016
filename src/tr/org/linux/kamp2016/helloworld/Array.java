package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;
import java.util.Scanner;

/*Arrayler sıfırdan başlar.*/

public class Array {
	
	public static void main(String args[]){
		
		/*int[] array = new int[3];
		
		int a = 1;
		int b = 5;
		int c = 6;
		
		int total=a+b+c;
		
		array[0]= a;
		array[1]= b;
		array[2]= c;
		
		int total2 = array[0]+array[1]+array[2];
		
		System.out.println("total:"+total);
		System.out.println("total:"+total2);
		
		int[] array2 = new int[] {1,5,6};
		int total3=array2[0] + array2[1] + array2[2];
		
		System.out.println("total3"+total3);
		
		
		int total4 = 0;
		for(int i=0; i <array.length; i++){
			total4 =total4+array[i]; 
			
		}
		System.out.println("total4:"+total4);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir değer giriniz");
		int inputNumber = input.nextInt();
		int[] array5 = new int[10];
		int counter = 0;
		
		while(inputNumber != -1){
		
		
			if(inputNumber != -1){
			array5[counter] = inputNumber;
			}
			
			inputNumber = input.nextInt();
			
			counter++;
		}
		
		for(int i = 0; i < array5.length; i++){
			
			System.out.println("Arrayın" + i + ".elemanı:"+array5[i]);
		}
		
		*/
		/*Scanner input = new Scanner(System.in);
		System.out.println("Bir değer giriniz");
		String inputString= input.next();
		String[] array5 = new String[5];
		int counter = 0;
		
		while(!inputString.equals("çıkış")){
			System.out.println("Bir deger giriniz");
			
			if(!inputString.equals("çıkış")){
			array5[counter] = inputString;
			}
			inputString = input.next();
			counter++;
		}
		
		for(int i = 0; i < array5.length; i++){
			
			System.out.println("Arrayın" + i + ".elemanı:"+array5[i]);
		
	}*/
	
		Scanner input = new Scanner(System.in);
		System.out.println("Bir değer giriniz");
		int inputNumber= input.nextInt();
		ArrayList arrayList5 = new ArrayList();
		int counter = 0;
		
		while(inputNumber != -1){
			System.out.println("Bir deger giriniz");
			
			if(inputNumber != -1){
			arrayList5.add(inputNumber) ;
			}
			inputNumber = input.nextInt();
			counter++;
		}
		
		for(int i = 0; i < arrayList5.size(); i++){
			
			System.out.println("Array Listin" + i + ".elemanı:"+arrayList5.get(i));
	

}
	}
}

