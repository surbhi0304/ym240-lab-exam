package labExam1;

public class SavingAccount extends Account {

	private float interestRate=10;

	public SavingAccount() {
	}

	public SavingAccount(Owner owner, float balance, String number) {
		super( owner, balance, number);
	}

	
	
	public float getInterestRate() {
		return interestRate;
	}

	@Override
	public void print() {
		System.out.println("Owner: "+getOwner());
		System.out.println("Balance: "+getBalance());
		System.out.println("Number: "+getNumber());
		System.out.println("Interest Rate: "+getInterestRate());
		
	}

	@Override
	public void withdraw(float amount) {

		float balance = getBalance() - amount;
		if (balance > 130) {
			setBalance(balance);
			System.out.println("withdrawl pass");
		} else {
			System.out.println("withdraw fail");
		}
	}

	public float getInterest() {
		return interestRate*this.getBalance();
	}

	@Override
	public void deposit(float amount) {
		setBalance(getBalance()+amount);		
	}

}