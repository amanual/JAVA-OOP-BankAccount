
public class BankAccountTest {

//	public BankAccountTest() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
//		BankAccount account2 = new BankAccount(20.0);
//		account2.BankAccount();
		account.getCheckingBalance();
		account.getSavingBalance();
		account.depositToCheckingSaving(200, 300);
		account.withdrawMoneyFromChecking(100);
		account.displayCheckingBalance();
		account.displaySavingBalance();
//		
		
		
		
		
		
	}

}
