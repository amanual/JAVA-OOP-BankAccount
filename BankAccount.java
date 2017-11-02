
import java.util.*;
public class BankAccount {
	private String accountNumber = "";
	private double checkingBalance;
	private double savingBalance;
	
	public static int numberOfCount = 0;
	public static int totalMoneySaved = 0;
	
	private int randomAccount() {
		Random rand = new Random();
		int account = rand.nextInt(900000000) + 1000000000;
		System.out.println("from account: " + account);
		return account;		
		
//		int account = (int)(Math.random()* 11 + 1);
	}
	public BankAccount() {
		numberOfCount++;
		accountNumber += randomAccount();
		System.out.println("the number of counts are: " + numberOfCount + "\nand your account number is: " + accountNumber);
	}
	public double getCheckingBalance() {
		System.out.println("Your checking balance is: " + checkingBalance);
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingBalance() {
		System.out.println("Your saving balance is: " + savingBalance);
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public void depositToCheckingSaving(int saveToChecking, int saveToSaving) {
		this.checkingBalance = totalMoneySaved + saveToChecking;
		this.savingBalance = totalMoneySaved + saveToSaving;	
		System.out.println("Your total checking balance is know: " + checkingBalance + " and your total saving balance is know: " + savingBalance);
	}
	public int withdrawMoneyFromChecking(int money) {
		if(checkingBalance < money) {
			System.out.println("your account balance is to low: " + checkingBalance);
			
		}
		
		checkingBalance = checkingBalance - money;
		System.out.println("Your new total checking balance is know: " + checkingBalance + " and your new total saving balance is know: " + savingBalance);
		return money;		
	}
	public double displayCheckingBalance() {
		System.out.println("Your checking account balance is: " + checkingBalance);
		return checkingBalance;
	}
	public double displaySavingBalance() {
		System.out.println("Your saving account balance is: " + savingBalance);
		return savingBalance;
	}
	
	
	
	
	
	

}
