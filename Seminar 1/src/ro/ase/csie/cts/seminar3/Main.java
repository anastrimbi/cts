package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<Person, BankAccount> employees = new HashMap<>();
		
		Person p1 = new Person("Ana Norris");
		BankAccount b1 = new BankAccount("RF12345678", p1);
		
		Person p2 = new Person("Archie Norris");
		BankAccount b2 = new FeeBankAccount("BRD1234567", p2);
		
		Person p3 = new Person("Yogi");
		BankAccount b3 = new BankAccount("BEAR234567", p3);
		
		employees.put(p1,b1);
		employees.put(p2,b2);
		employees.put(p3,b3);
		
		for(Account a : employees.values()) {
			a.deposit(1000);
		}
		
		for(Account a : employees.values()) {
			try {
				a.withdraw(10);
			} catch (InsufficientFundsException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
	}
}
