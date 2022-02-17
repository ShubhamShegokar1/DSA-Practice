import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 Write a class “BankAccount” with the following instance variables: 
 AccountNumber (an integer), balance a floating-point number), 
 and “ownerName” (a String). Write proper constructor for this class. 

 Also write methods balance, add (to deposit an amount), and subtract 
 (to withdraw an amount) and implement them. 

 Now create another class “AccountManager” that contains an array of BankAccount. 

 Write methods create (to create an account), delete(to terminate an account),
  deposit (to deposit an amount to an account) and withdraw (to withdraw an 
  amount from an account). Also write a class “Bank”, add main() function 
  that creates an AccountManager and add 5 accounts. Now print the details 
  of all accounts in this Bank.
 */


class BankAccount
{
	Long accountNumber;
	long balance;
	String name;
	public BankAccount(Long accountNumber, long balance, String name) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void addBalance(long balance) {
		long oldBalance=getBalance();
		this.balance = balance+oldBalance;
	}
	public void subtractBalance(long balance) {
		long oldBalance=getBalance();
		this.balance = balance-oldBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", name=" + name + "]";
	}
}


class AccountManager
{
	HashMap <Long,BankAccount> map = new HashMap<>();

	public void createAccount(BankAccount bankAccount) {
		map.put(bankAccount.accountNumber,bankAccount);
		System.out.println("Account is created");
	}	

	public void removeAccount(BankAccount bankAccount) {
		map.remove(bankAccount.accountNumber);
		System.out.println("Account is deleted");
	}	

	public void display() {
		for (Map.Entry it : map.entrySet()) {
			System.out.println(it.getKey()+" "+it.getValue().toString());
		}
	}
}
public class Bank 
{
	public static void main(String[] args)
	{
		Float f2 = 0.0f;  
		
		BankAccount obj = new BankAccount( (long)1234566, 0, "Shubham Shegokar");
		obj.addBalance(10);
		AccountManager  accountManager = new AccountManager();
		accountManager.createAccount(obj);	
		accountManager.display();
		
	}
}
