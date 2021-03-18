package ro.ase.csie.cts.seminar4;

import ro.ase.csie.cts.seminar3.BankAccount;
import ro.ase.csie.cts.seminar3.DebitBankAccount;
import ro.ase.csie.cts.seminar3.EmailNotificationService;
import ro.ase.csie.cts.seminar3.NotificationService;
import ro.ase.csie.cts.seminar3.Person;
import ro.ase.csie.cts.seminar4.banking.CreditBankAccount;


public class Main {

	public static void main(String[] args) {
NotificationService emailService = new EmailNotificationService();
		
		
		Person p3 = new Person("Van Damme");
		p3.setEmail("van@damme.com");
		p3.setMobile("+44534634423");
		DebitBankAccount b3 = new DebitBankAccount(emailService, "BT12312323", p3);
		
		BankAccount b = CreditBankAccount.createCreditBankAccount(emailService, "ING345678", p3, 100));
		
		b.deposit(50);
		System.out.println(b.toString());
	}

}
