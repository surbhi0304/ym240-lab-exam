package labExam1;

public class Q2Driver {
	public static void main(String[] args) {
		Date date1= new Date(05,12,21997);
		Date date2= new Date(01,11,1999);
		
		Owner surbhi = new Owner("surbhi singhal",date1,"nvhhyf");
		Owner sugandh= new Owner("Sugandh singhal",date2,"bvhdd");
		
		
		Account account1 = new SavingAccount(surbhi,1000,"125634");
		Account account2 = new CurrentAccount(sugandh,10000,"45678");
		
		System.out.println("account1 " +account1.getBalance());
		account1.deposit(500);
		System.out.println("account2 " +account1.getBalance());
		account2.deposit(4999);
		
		System.out.println(account1.getBalance());
		account1.withdraw(50);
		System.out.println(account2.getBalance());
		account2.withdraw(85522);
		
		
	}
}
