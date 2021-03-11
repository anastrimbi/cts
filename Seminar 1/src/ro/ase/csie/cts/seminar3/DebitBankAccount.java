package ro.ase.csie.cts.seminar3;

public class DebitBankAccount implements Account {
	private String iban;
	
	private long balance;
	
	private Person accountHolder;

	public DebitBankAccount(String iban, Person person) {
		this.iban = iban;
		this.accountHolder = person;
		balance = 0;
	}
	
	@Override
	public void withdraw(long amount) throws InsufficientFundsException {
		if(amount > balance)
			throw new InsufficientFundsException("Insufficient funds! You have "+ balance);
		System.out.println("withdrawing " + amount + " from" + iban);
		balance -= amount;
	}
	
	@Override
	public void deposit(long amount) {
		System.out.println("adding " + amount + " to your account " + iban);
		balance += amount;
	}

	public String getIban() {
		return iban;
	}

	public long getBalance() {
		return balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}

	
	
}

