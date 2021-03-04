package ro.ase.csie.cts.seminar2;

import java.math.BigDecimal;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar2.solid.FeeBankAccount;
import ro.ase.csie.cts.seminar2.solid.InsufficientFundsException;
import ro.ase.csie.cts.seminar2.solid.Person;

public class Main {

	public static void main(String[] args) {
//		// instance of calendar util
//		CalendarUtil cu= new CalendarUtil();
//		
//		
//		// exception
//		try {
//			System.out.println(cu.weekDay(10));
//			// else if
//			System.out.println(cu.weekDay(3));
//			// switch
//			System.out.println(cu.weekDay2(3));
//			// vector
//			System.out.println(cu.weekDay3(3));
//			// validation working?
//			System.out.println(cu.weekDay3(10));
//			// with pre-existing java class
//			System.out.println("DateFormatSymbols says" + cu.weekDay4(10));
//			System.out.println("DateFormatSymbols says" + cu.weekDay4(5));
//		} catch (IncorrectDayException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
		
		Person p = new Person("Ana");
		BankAccount account = new BankAccount("INGB123242344", p);
		
		account.deposit(100);
		try {
			account.withdraw(30);
			account.withdraw(40);
			account.withdraw(70);

		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
			
		System.out.println(account.getBalance());
		
		
		account = new FeeBankAccount("BRD123123234234", p);
		
		account.deposit(500);
		
		try {
			account.withdraw(100);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(account.getBalance());
	}

}
