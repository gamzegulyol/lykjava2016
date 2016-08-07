package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class AccountTest {

	public static void main(String args[]) {

		Account account1 = new Account("Gamze Gülyol", 50.00);

		System.out.print(account1.getName() + "'nin bakiyesi:" + account1.getBalance());

		Scanner input = new Scanner(System.in);

		System.out.print("\nYatırmak istediğiniz para miktarını giriniz");

		double depositAmount = input.nextDouble();

		System.out.print(depositAmount + "TL" + account1.getName() + "\nkişisinin hesabına ekleniyor...\n");

		account1.deposit(depositAmount);

		System.out.print(account1.getName() + "'nin bakiyesi:" + account1.getBalance());

	}

}
