package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<Person, Receivable> employees = new HashMap<>();
		
		Person p1 = new Person("Ana Norris");
		CreditBankAccount b1 = new CreditBankAccount("RF12345678", p1, -500);
		
		Person p2 = new Person("Archie Norris");
		DebitBankAccount b2 = new FeeBankAccount("BRD1234567", p2);
		
		Person p3 = new Person("Yogi");
		DebitBankAccount b3 = new DebitBankAccount("BEAR234567", p3);
		
		employees.put(p1,b1);
		employees.put(p2,b2);
		employees.put(p3,b3);
		
		for(Receivable a : employees.values()) {
			a.deposit(1000);
		}
		
		Map<Person, Payable> union = new HashMap<>();
		
		union.put(p2,  b2);
		union.put(p3, b3);
		
		for(Payable a : union.values()) {
			try {
				a.withdraw(10);
			} catch (InsufficientFundsException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		System.out.println("\n\n");
		try {
			b2.transfer(b3, 200);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
